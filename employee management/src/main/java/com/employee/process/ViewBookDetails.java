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

public class ViewBookDetails implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Connection con = null;
		con = (Connection) session.getAttribute("connection");
		Map<String, Object> map2 = new HashMap<>();
		String uri = "success";// ch

		map2.put(Constant.uriPath, uri);
		List<Book> list = new ArrayList<>();

		String strBookName = (String) map.get("bookName");
		String sql1 = Constant.findBookByName;
		Book book = null;
		try {

			PreparedStatement pstmt = con.prepareStatement(sql1);
			pstmt.setString(1, strBookName);
			System.out.println(strBookName);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int bookId = rs.getInt("book_id");
				String bookName = rs.getString("book_name");
				String authorName = rs.getString("author_name");
				String publisher = rs.getString("publisher");
				int noOfPage = rs.getInt("no_of_pages");
				String language = rs.getString("language");
				String rating = rs.getString("rating");
				double price = rs.getDouble("price");

				book = new Book(bookId, noOfPage, bookName, authorName, publisher, language, rating, price);
				list.add(book);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * for (Book e : list) { System.out.println(e); }
		 */
		map2.put(Constant.list, list);

		return map2;

	}

}
