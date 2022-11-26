create database employee;
create table department (department_id int not null, department_name varchar(255), primary key (department_id));
create table employee (employee_id int not null, employee_name varchar(255), salary int ,department_id int, primary key (employee_id), foreign key (department_id) references department(department_id));
insert into department
values (001, "Tech");

insert into department
values (002, "Management");

insert into department
values (003, "HR");

insert into employee 
values (1, "Anshuman", 1000000, 001);

insert into employee 
values (2, "Raghav", 1000000, 001);

insert into employee 
values (3, "Rashi", 750000, 002);

insert into employee 
values (4, "Quesha", 750000, 002);

insert into employee
values (5, "Janhavi", 500000, 003);

insert into employee
values (6, "Amit", 500000, 003);

# first query: Print employee_id, employee_name and department_name
select employee.employee_id, employee.employee_name, department.department_name
from employee
inner join department 
where employee.department_id = department.department_id;

#Second query: Write a Query that prints all the employees and their salaries in descending order of their salary
select employee.employee_name, employee.salary
from employee
order by employee.salary desc;

#Third Query: Write a Query that prints the average salary of employees in each department with the department name
select department.department_name, avg(employee.salary)
from department
inner join employee
where department.department_id = employee.department_id
group by department.department_id;


