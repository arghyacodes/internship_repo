use temp;
drop database if exists temp;

create database if not exists temp;
use temp;

create table employee(
emp_id int primary key auto_increment,
designation varchar(50) not null,
experience int not null,
office_id int not null,
payscale int not null,
foreign key (office_id) references office(office_id),
foreign key (payscale) references salary(payscale)
);

insert into employee
values
(8051,'Jr Dev',0,3,3);

insert into employee
(designation, experience, office_id, payscale)
values
('Intern',0,4,2),
('Manager',3,2,7),
('HR', 2,5,5),
('Assiociate',1,1,6),
('Sr Dev',3,3,8),
('Project Manager',7,7,10);

create table office(
office_id int primary key,
city varchar(25));

create table salary(
payscale int primary key,
amount int default 25000);

create table info(
emp_id int not null,
fname varchar(25),
lname varchar(25),
gender varchar(10),
foreign key (emp_id) references employee(emp_id));

insert into info
values
(8051,'Aditya','Bhattacharya','Male'),
(8052,'Aditi','Roy','Female'),
(8053,'Kousik','Pal','Male'),
(8054,'oIMAYAK','Panja','Female'),
(8055,'Sourav','Basak','Male'),
(8056,'Arpan','Roy','Male'),
(8057,'Rudranath','Chatterjee','Male');

insert into office
values
(1,'Kolkata'),
(2,'Bengaluru'),
(3,'Chennai'),
(4,'Pune'),
(5,'Mumbai'),
(6,'Delhi'),
(7,'Noida'),
(8,'Hydeabad');

insert into salary
values
(1,10000),
(2,15000),
(3,20000),
(4,25000),
(5,35000),
(6,45000),
(7,60000),
(8,75000),
(9,100000),
(10,120000);

/*Max Salary*/
select max(salary.amount)
from employee
left join salary
on employee.payscale = salary.payscale;

/*Min Salary*/
select min(salary.amount)
from employee
left join salary
on employee.payscale = salary.payscale;

/*Second Heighest Salary*/
select amount from salary
where payscale<(select max(payscale) from salary)
order by payscale desc
limit 1;


-- Inner Join--
select * from employee
left join office
on employee.office_id = office.office_id
order by payscale desc;

 -- Left Join-- 
select * from salary
left join employee
on salary.payscale = employee.payscale
order by salary.payscale desc;

-- Right Join--  
select * from office
right join employee
on office.office_id = employee.office_id
order by employee.payscale desc;

-- Full Join--
select * from salary
left join employee
on salary.payscale = employee.payscale
union
select * from salary
right join employee
on salary.payscale = employee.payscale;

-- Aggregate Function -- 
select max(experience) from employee;

select min(payscale) from employee;

select avg(experience) from employee;

select count(emp_id) from employee;


-- String Functions --

select concat(fname,' ', lname) from info;

select upper(gender) from info;

select replace(fname, 'oIMAYAK','Aimayak') from info where fname = 'oIMAYAK';

select instr('Oimayak Panja','Panja');

select trim('ale' from 'Male') from info where gender='Male';