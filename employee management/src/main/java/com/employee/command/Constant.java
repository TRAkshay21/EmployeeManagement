package com.employee.command;

public interface Constant {

	public static final String uriPath = "uriPath";
	public static final String list = "list";
	public static final String employeeId = "employeeId";

	// Connection Pool
	public static final String url = "jdbc:postgresql://localhost:5432/task";
	public static final String userName = "postgres";
	public static final String password = "postgres";

	// Employee Querys=================================
	public static final String login = "SELECT email_id,password,under_manager,employee_id FROM employee WHERE email_id=?;";
	public static final String selectByEmailId = "select * from employee where email_id=?";
	public static final String insert = "insert into employee (age,first_name,last_name ,father_name ,gender,phone_number ,roll_type ,under_manager  ,email_id ,designation ,street_address ,address ,state ,city,country ,pinCode ,password )values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String insertLeave = "insert into leave (employee_id,from_date,to_date ,textarea)values(?,?,?,?)";
	public static final String findById = "select * from employee where under_manager=?";
	public static final String update = "update employee set first_name=?,last_name=?,father_name=?,gender=?,phone_number=?,roll_type=?,under_manager=?,email_id=?,designation=?,date_of_birth=?,street_address=?,address=?"
			+ ",state=?,city=?,country=?,pinCode=?,password=?  where username=?";
	public static final String delete = "delete from employee where employee_id=?";
	public static final String select = "select * from employee";

	// Book Querys=================================
	public static final String selectBook = "select * from book";
	public static final String bInsert = "insert into book values(?,?,?,?,?,?,?,?)";
	public static final String findBookByName = "select * from book where book_name=?";
	public static final String bUpdate = "update book set book_name=?,author_name=?,publisher=?,language=?,no_of_pages=?,rating=?,price=? where book_id=?";
	public static final String bDelete = "DELETE FROM book WHERE book_id=?";

	// video Querys=================================
	public static final String SelectVideo = "select * from video";
	public static final String vInsert = "insert into video values(?,?,?)";
	public static final String vFindEmployeeById = "select * from video where video_id=?";
	public static final String vUpdate = "update video set title=?,duration=? where video_id=?";
	public static final String vDelete = "DELETE FROM video WHERE video_id=?";

	// video Querys=================================
	public static final String selectLeave = "select * from leave";
}
