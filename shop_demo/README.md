
Datase MySQL
1) change following configuration as per your MySQL db setting (you can use any database only need to add url )
   and change user id and password.
   
db.url=jdbc:log4jdbc:mysql://localhost:3306/test
#db.username=root
#db.password=admin

2) create table in to database
use test;

CREATE TABLE shops (
 id int(6) NOT NULL AUTO_INCREMENT,
  name varchar(60) NOT NULL,
 employees_number int(6) NOT NULL,
	  PRIMARY KEY (id)
	) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
	
3) deploy war on server (inside of targt folder you can find shop_demo.war) 

4) http://localhost:8080/shop_demo 

above link contain crud operations , also you can using java scripts submit form , and read json data and display anywhere.
you can see search return json data for display.



CREATE TABLE Customer (
     id INT(6) NOT NULL AUTO_INCREMENT,
       name varchar(60) NOT NULL,
       email varchar(60) NOT NULL,
       address varchar(60) NOT NULL,
       phone_number varchar(60) NOT NULL,
    	  PRIMARY KEY (id)
	) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
	
	
	
	CREATE TABLE Request (
     id INT(6) NOT NULL AUTO_INCREMENT,
       quantity int(60) NOT NULL,
        id_customer varchar(60) NOT NULL,
    	  PRIMARY KEY (id)
	) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;