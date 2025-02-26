create database if not exists temp;
use temp;
create table customer(
id int primary key auto_increment,
name varchar(50),
age int,
city varchar(20)
);

insert into customer
values
(1001,'Oimayak',23,'Salap');

insert into customer
(name, age, city)
values
('Suman',22,'Janai'),
('Sourav', 23, 'Kona'),
('Rudra',24,'Howrah'),
('Arpan',28,'Liluah');

select * from customer;

create table orders(
order_id int primary key auto_increment,
name varchar(50) not null,
price int not null,
quantity int not null
);

insert into orders
values
(1001,'Poco F3 GT',24490,1);

insert into orders
(name, price, quantity)
values
('Sunglass', 499, 1),
('Lays',10,6),
('Nvidia RTX 4060',38990,1),
('OnePlus Ear Bud Pro', 4699,2);

select * from orders
order by price desc;

describe orders;

select date_format(curdate(), '%d/%m/%y') as aj;
select date_format(curdate(), '%D/%M/%Y');

select monthname(curdate());

select sum((price * quantity)) as expenditure
from orders;

select customer.name, customer.city, orders.name, orders.price, orders.quantity, (orders.price*orders.quantity) as bill_amount
from customer inner join orders on customer.id = orders.order_id
order by bill_amount desc
limit 1,1;

/*
sub query
*/

select name, price from orders
where price < (select max(price) from orders)
order by price desc
limit 1;


select name, age, if(age<=23, 'n', 'm')
from customer;


/*New Concept*/
select age,
case when age>=24 then 'Arpan'
when age>=23 then 'Suman'
else 'Ambu'
end as age_grp
from customer;




create table book(
book_id int primary key auto_increment,
first_name varchar(25) not null,
last_name varchar(25) not null,
author varchar(50) not null,
price int not null default 255);

insert into book
values
(101,'English','Grammar','P C Das',255);

insert into book
(first_name, last_name, author)
values
('Pather','Panchali','Bankimchandra'),
('Modern','Physics','H C Verma'),
('Oxford','Dictionary','Oxford Inc');

select concat(first_name, ' ', last_name) as book_name, author from book;

select upper(substring(concat(first_name,' ',last_name), 1, 7)) as short_name
from book;

