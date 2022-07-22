package com.employee.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.employee.command.Command;
import com.employee.command.Constant;
import com.employee.model.Video;

public class ViewAllVideo implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Connection con = null;
		con = (Connection) session.getAttribute("connection");
		Map<String, Object> map2 = new HashMap<>();
		String uri = "success";

		map2.put(Constant.uriPath, uri);
		List<Video> list = new ArrayList<>();

		String sql1 = Constant.SelectVideo;
		Video video = null;
		try {

			PreparedStatement pstmt = con.prepareStatement(sql1);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int videoId = rs.getInt("video_id");
				String videoUrl = rs.getString("video_url");
				String title = rs.getString("title");
				int durationInSeconds = rs.getInt("duration_in_seconds");
				int durationInMinutes = rs.getInt("duration_in_minutes");

				video = new Video(videoId, videoUrl, title, durationInSeconds, durationInMinutes);
				list.add(video);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * for (Video e : list) { System.out.println(e); }
		 */
		map2.put(Constant.list, list);

		return map2;
	}
}
