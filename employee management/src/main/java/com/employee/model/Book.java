package com.employee.model;

public class Book {
	private int bookId;
	private int noOfPage;
	private String bookName;
	private String authorName;
	private String publisher;
	private String language;
	private String rating;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public Book(int bookId, int noOfPage, String bookName, String authorName, String publisher, String language,
			String rating, double price) {
		super();
		this.bookId = bookId;
		this.noOfPage = noOfPage;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.language = language;
		this.rating = rating;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getNoOfPage() {
		return noOfPage;
	}
	public void setNoOfPage(int noOfPage) {
		this.noOfPage = noOfPage;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", noOfPage=" + noOfPage + ", bookName=" + bookName + ", authorName="
				+ authorName + ", publisher=" + publisher + ", language=" + language + ", rating=" + rating + ", price="
				+ price + "]";
	}
}
