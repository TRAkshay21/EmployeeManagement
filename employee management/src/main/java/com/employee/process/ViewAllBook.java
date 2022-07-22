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
import com.employee.model.Book;

public class ViewAllBook implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {

		HttpSession session = request.getSession();
		Connection con = null;
		con = (Connection) session.getAttribute("connection");
		Map<String, Object> map2 = new HashMap<>();
		String uri = "success";// ch

		map2.put(Constant.uriPath, uri);
		List<Book> list = new ArrayList<>();

		String sql1 = Constant.selectBook;
		Book book = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql1);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int bookId = rs.getInt("book_id");
				String bookName = rs.getString("book_name");

				book = new Book(bookId, bookName);
				list.add(book);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Book e : list) {
			System.out.println(e);
		}
		map2.put(Constant.list, list);

		return map2;
	}

}
