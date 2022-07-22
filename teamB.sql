create table employee(
	employee_id INT PRIMARY KEY,
	age int NOT NULL,
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20) NOT NULL,
	father_name VARCHAR(20) NOT NUll,
	gender VARCHAR(10) Not Null,
	phone_number BIGINT NOT NULL,
	roll_type VARCHAR(10) NOT NULL,
	under_manager INT ,
	email_id VARCHAR(20) NOT NULL,
	designation VARCHAR(15),
	street_address VARCHAR(50) NOT NULL,
	address VARCHAR(50),
	state VARCHAR(15) NOT NULL,
	city VARCHAR(10) NOT NULL,
	country VARCHAR(10),
	pinCode INT NOT NULL,
	password VARCHAR(15) NOT NULL,
	FOREIGN KEY(under_manager)
	REFERENCES employee(employee_id)
);

insert into employee values(1,56,'aravind','kumar','Ram','male',9874563210,'manager',1,'jg@gmail','MD','sdfsf','chennai','tamilnadu','salem','india',600032,'11dgdd');
SELECT * FROM employee;
DELETE from employee WHERE employee_id=5;
SELECT * from employee WHERE email_id='jg@gmail' and password='11dgdd';

create table book(
	book_id INT PRIMARY KEY,
	book_name VARCHAR(20)NOT NULL,
	author_name VARCHAR(20),
	publisher VARCHAR(30)NOT NULL,
	language VARCHAR(2), 
	no_of_pages BIGINT NOT NULL,
	rating INT,
	price DOUBLE PRECISION NOT NULL
);
select * from book;
insert into book values(default,'The Road to Learn Jquery','John Resig','Team-B Publisher','en',699,4,4998.9);
create table video(
	video_id INT,
	video_url VARCHAR(2000),
	title VARCHAR(255),
	duration_in_seconds  int,
	duration_in_minutes  int
);
drop table video;
select * from video;
insert into video values(default,'https://www.youtube.com/watch?v=Hv_a3ZBSO_g',
						 'Code From Scratch',931,15);
insert into video values(default,'https://www.youtube.com/watch?v=BBpAmxU_NQo',
						 'Programming With Mosh',4722,78);

CREATE TABLE leave(
	employee_id int,
	from_date varchar(10),
	to_date varchar(10),
	textarea varchar(200)
);

SELECT * FROM leave;

delete from leave where employee_id=11; 


