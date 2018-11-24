drop database if exists db_crud;
create database db_crud;
use db_crud;
create table t_user(operator_id int primary key auto_increment,
name varchar(50),
password varchar(50),
status int
);

insert into t_user(operator_id,name,password,status)values(2,'zs','zs',1);

select * from t_user;