CREATE DATABASE Ankit;

USE Ankit;

CREATE TABLE Details(
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT ,
    email VARCHAR(50) UNIQUE,
    mobile VARCHAR(10) UNIQUE
    city VARCHAR(20) NOT NULL
);

INSERT INTO Details VALUES(
    (101,'Ankit Pandey', 22, 'akit@mail.com', '9978662111', 'Delhi'),
    (102,'Aditya Pandey', 28, 'adi@mail.com', '9978662121' 'Pune') ,
    (103,'SOhan Pandey', 20, 'sohan@mail.com', '9978663111', 'Delhi'),
    (104,'Mohan Pandey', 25, 'mohan@mail.com', '9978622121' 'Pune')
);

SELECT * FROM Details;
SELECT name,mobile FROM Details;

SELECT * FROM Details WHERE age < 20;
SELECT * FROM Details WHERE age BETWEEN 20 AND 25;

-- //Agregate function

SELECT MAX(age) FROM Details;
SELECT MIN(age) FROM Details;
SELECT COUNT(*) FROM Details;
SELECT SUM(age) FROM Details WHERE id BETWEEN 101 AND 103;


-- //DML COMMANDS

UPDATE Details
SET name = 'Sohan Pandey'  WHERE id = 103;

DELETE FROM Details WHERE age<18;

-- ORDER BY CLAUSE

SELECT * FROM Details
ORDER BY age DESC;

SELECT name FROM Details
ORDER BY age ASC;



-- DAY 9 WIPRO TRAINING _ SQL ORACLE

-- create table :


SQL> create table product_tbl (product_id number,product_name varchar2(50),product_price number(10,2),mfd date,category
varchar2(20), primary key(product_id));


-- insert records:

SQL> insert into product_tbl values(10,'IPhoneX',58000.00,'30-OCT-24','Mobile');

SQL> insert into product_tbl values(20,'IPhoneY',98000,'30-DEC-24','Mobile');

SQL> insert into product_tbl values(30,'SonyXP',28000,'30-DEC-24','TV');

SQL> insert into product_tbl values(40,'ScanDisk',2200,'30-JAN-23','PenDrive');


-- select :

> select * from product_tbl;

> select product_name,category from product_tbl;


-- how to filter records:

-- 1. where condition

select * from product_tbl where category = 'Mobile';

SQL> select product_name, product_price from product_tbl where product_price >= 50000;

SQL> select * from product_tbl where category = 'Mobile' and product_price >= 90000;


-- Agregate/Predefined functions

SQL> select count(*) from product_tbl;

SQL> select sum(product_price) from product_tbl;

SQL> select max(product_price) from product_tbl;

SQL> select min(product_price) from product_tbl;





-- order by: to select records in asc or desc order

SQL> select product_name,product_price from product_tbl order by product_price;

SQL> select product_name,product_price from product_tbl order by product_price ASC;

SQL> select product_name,product_price from product_tbl order by product_price DESC;





-- group by:

-- GROUP BY clause to group rows into groups.

-- The GROUP BY clause returns one row per group.

-- The GROUP BY clause is often used with aggregate functions such as AVG(), COUNT(), MAX(), MIN() and SUM().

SQL> select category,count(*) from product_tbl group by category;


-- update :

SQL> update product_tbl set product_price = 25000 where product_id = 30;

SQL> update product_tbl set product_price = 26000,product_name = 'SonyXPP' where product_id = 30;


-- delete :

SQL> delete from product_tbl where product_id = 40;

-- PRACTICE

SQL> create table customer_tbl (customer_id number, customer_name varchar2(50) not null,age number, email varchar2(30)
unique not null, mobile varchar2(10), primary key(customer_id));


SQL> insert into customer_tbl values(1,'Rohit',30,'rohit@tmail.com','9638574210');

SQL> insert into customer_tbl values(2,'Karan',35,'karan@tmail.com','9838574210');

SQL> insert into customer_tbl(customer_id,customer_name,age,email) values(3,'sita',25,'sita@tmail.com');

SQL> insert into customer_tbl values(4,'safd',35,'safd@tmail.com',null);
