

CREATE TABLE buys (
    customer_cust_id  INTEGER NOT NULL,
    products_pr_id    INTEGER NOT NULL     );
ALTER TABLE buys ADD CONSTRAINT buys_pk PRIMARY KEY ( customer_cust_id, products_pr_id);

CREATE TABLE customer (
    cust_id    INTEGER NOT NULL,
    cust_name  CHAR(50),
    age        INTEGER,
    email      CHAR(50),
    phone_nb   INTEGER,   
   nbofprod    Integer   );
ALTER TABLE customer ADD CONSTRAINT customer_pk PRIMARY KEY ( cust_id );

CREATE TABLE department (
    dept_id    INTEGER NOT NULL,
    dept_name  CHAR(50),
    address    CHAR(50),
    email      CHAR(60)   );    
ALTER TABLE department ADD CONSTRAINT department_pk PRIMARY KEY ( dept_id );

CREATE TABLE dependent (
    name              CHAR(50) NOT NULL,
    sex               CHAR(6),
    relation_ship     CHAR(50),
    birth_date        DATE,
    employee_e_id     INTEGER NOT NULL    );
ALTER TABLE dependent ADD CONSTRAINT dependent_pk PRIMARY KEY ( name );

CREATE TABLE employee (
    e_id                INTEGER NOT NULL,
    e_fname             CHAR(20),
    e_lname             CHAR(20),
    salary              decimal,
    phone_nb            INTEGER,
    sex                 CHAR(6),
    address             CHAR(100),
    department_dept_id  INTEGER NOT NULL      );
ALTER TABLE employee ADD CONSTRAINT employee_pk PRIMARY KEY ( e_id, department_dept_id );

CREATE TABLE has_a (
    employee_e_id     INTEGER NOT NULL,
    job_title_job_id  INTEGER NOT NULL         );
ALTER TABLE has_a ADD CONSTRAINT has_a_pk PRIMARY KEY ( employee_e_id,  employee_dept_id ,job_title_job_id );

CREATE TABLE job_title (
    job_id       INTEGER NOT NULL,
    description  CHAR(50),
    status       CHAR(50)      );
ALTER TABLE job_title ADD CONSTRAINT job_title_pk PRIMARY KEY ( job_id );

CREATE TABLE managed_by (
    department_dept_id  INTEGER NOT NULL,
    manager_m_id        INTEGER NOT NULL        );
ALTER TABLE managed_by ADD CONSTRAINT managed_by_pk PRIMARY KEY ( department_dept_id, manager_m_id );

CREATE TABLE manager (
    m_id          INTEGER NOT NULL,
    address       CHAR(50),
    m_fname       CHAR(20),
    m_lname       CHAR(20),
    phone_nb      INTEGER,
    manager_m_id  INTEGER NOT NULL           );
ALTER TABLE manager ADD CONSTRAINT manager_pk PRIMARY KEY ( m_id );

CREATE TABLE products (
    pr_id        INTEGER NOT NULL,
    pr_name      CHAR(50),
    description  CHAR(50),
    price        decimal     );
ALTER TABLE products ADD CONSTRAINT products_pk PRIMARY KEY ( pr_id );

CREATE TABLE project (
    p_id                INTEGER NOT NULL,
    p_name              CHAR(50),
    end_date            DATE,
    department_dept_id  INTEGER NOT NULL       );
ALTER TABLE project ADD CONSTRAINT project_pk PRIMARY KEY ( p_id );

CREATE TABLE role (
    role_id           INTEGER NOT NULL,
    role_name         CHAR(50),
    role_desc         CHAR(50),
employee_e_id     INTEGER NOT NULL,
    employee_dept_id  INTEGER NOT NULL      );
ALTER TABLE role ADD CONSTRAINT role_pk PRIMARY KEY ( role_id );

CREATE TABLE sells (
    department_dept_id  INTEGER NOT NULL,
    products_pr_id      INTEGER NOT NULL     );
ALTER TABLE sells ADD CONSTRAINT sells_pk PRIMARY KEY ( department_dept_id, products_pr_id );

CREATE TABLE works_on (
    employee_e_id                INTEGER NOT NULL,
    employee_department_dept_id  INTEGER NOT NULL,
    project_p_id                 INTEGER NOT NULL,
    start_date                   DATE    );
CREATE TABLE CAN_BE (
cust_id   	INTEGER NOT NULL,
e_id   		INTEGER NOT NULL);



ALTER TABLE works_on ADD CONSTRAINT works_on_pk PRIMARY KEY ( employee_e_id, employee_department_dept_id, project_p_id );
ALTER TABLE buys ADD CONSTRAINT buys_customer_fk FOREIGN KEY ( customer_cust_id ) REFERENCES customer ( cust_id );
ALTER TABLE buys ADD CONSTRAINT buys_products_fk FOREIGN KEY ( products_pr_id )  REFERENCES products ( pr_id );
ALTER TABLE dependent ADD CONSTRAINT dependent_employee_fk FOREIGN KEY ( employee_e_id,
 employee_dept_id )  REFERENCES employee ( e_id, department_dept_id );
ALTER TABLE employee ADD CONSTRAINT employee_department_fk FOREIGN KEY ( department_dept_id )       REFERENCES department ( dept_id );
ALTER TABLE has_a ADD CONSTRAINT has_a_employee_fk FOREIGN KEY ( employee_e_id, employee_dept_id )
REFERENCES employee ( e_id, department_dept_id );
ALTER TABLE has_a ADD CONSTRAINT has_a_job_title_fk FOREIGN KEY ( job_title_job_id )
  REFERENCES job_title ( job_id );
ALTER TABLE managed_by ADD CONSTRAINT managed_by_department_fk FOREIGN KEY ( department_dept_id )
REFERENCES department ( dept_id );
ALTER TABLE managed_by ADD CONSTRAINT managed_by_manager_fk FOREIGN KEY ( manager_m_id )
 REFERENCES manager ( m_id );
ALTER TABLE manager ADD CONSTRAINT manager_manager_fk FOREIGN KEY ( manager_m_id )
  REFERENCES manager ( m_id );
ALTER TABLE project  ADD CONSTRAINT project_department_fk FOREIGN KEY ( department_dept_id )
REFERENCES department ( dept_id );
ALTER TABLE role ADD CONSTRAINT role_employee_fk FOREIGN KEY ( employee_e_id, employee_dept_id )
  REFERENCES employee ( e_id, department_dept_id );
ALTER TABLE sells ADD CONSTRAINT sells_department_fk FOREIGN KEY ( department_dept_id )
   REFERENCES department ( dept_id );
ALTER TABLE sells ADD CONSTRAINT sells_products_fk FOREIGN KEY ( products_pr_id )
 REFERENCES products ( pr_id );
ALTER TABLE works_on  ADD CONSTRAINT works_on_employee_fk FOREIGN KEY ( employee_e_id, employee_department_dept_id )
  REFERENCES employee ( e_id, department_dept_id );
ALTER TABLE works_on ADD CONSTRAINT works_on_project_fk FOREIGN KEY ( project_p_id )
  REFERENCES project ( p_id );




INSERT INTO employee (e_id, e_fname, e_lname, salary, phone_nb, sex, address, department_dept_id)
VALUES 
(1, 'hasan', 'alammar', 1233.4, 71475403, 'male', 'beirut', 555),
(2, 'sami', 'moussa', 1500, 7138889, 'male', 'beirut', 555),
(3, 'sara', 'Jaafar', 1200.5, 3098883, 'female', 'dahye', 555),
(4, 'jad', 'mousawi', 1555.22, 3888299, 'male', 'jbeil', 666),
(5, 'lara', 'hanna', 1304, 71293033, 'female', 'jounieh', 666),
(6, 'joseph', 'matta', 1500, 71444678, 'male', 'saida', 555),
(7, 'ali', 'mayladan', 1782, 3666837, 'male', 'sour', 666);

INSERT INTO department (dept_id, dept_name, address, email)
VALUES 
(555, 'apple5', 'beirut', 'apple111@gmail.com'),
(666, 'lenovo44', 'jounieh', 'lenovo344@gmail.com'),
(190, 'ha', 'tripoli', 'ha233@gmail.com');

INSERT INTO customer (cust_id, cust_name, age, email, phone_nb, nbofprod)
VALUES 
(121, 'maher', 49, 'maher1974@gmail.com', 71443405, NULL),
(122, 'yorgo', 23, 'yorgo22@gmail.com', 3044089, NULL),
(123, 'abbass', 35, 'abbas11@gmail.com', 7116893, NULL),
(124, 'ali', 50, 'ali345@gmail.com', 3666837, 80),
(125, 'joseph', 28, 'joseph9876@gmail.com', 71444678, 29),
(126, 'fatima', 18, 'fatima233@gmail.com', 3887647, 9),
(127, 'suzan', 17, 'suzan111@gmail.com', 71178900, 5);

INSERT INTO products (pr_id, pr_name, description, price)
VALUES 
(1, 'iphone15', '256gb black', 1150),
(2, 'laptop', 'lenovo1234', 590),
(3, 'watch', 'apple watch', 230),
(4, 'tv', 'Samsung 65 inches', 780);

INSERT INTO manager (m_id, address, m_fname, m_lname, phone_nb)
VALUES 
(1, 'jbeil', 'charbel', 'gemayel', 3778921),
(2, 'jeih', 'mhmd', 'monzer', 71338442),
(3, 'dahye', 'ali', 'mayladan', 71277283);

INSERT INTO managed_by (department_dept_id, manager_m_id)
VALUES 
(555, 1),
(555, 2),
(666, 3);

INSERT INTO project (p_id, p_name, end_date, department_dept_id)
VALUES 
(1, 'iphone16', '2024-09-12', 555),
(2, 'ipad', NULL, 555),
(3, 'tv', '2024-04-30', 666),
(4, 'ooo', NULL, 666);

INSERT INTO job_title (job_id, description, status)
VALUES 
(1, 'programmer', NULL),
(2, 'uxui', NULL),
(3, 'developer', NULL);

INSERT INTO sells (department_dept_id, products_pr_id)
VALUES 
(555, 1),
(555, 2),
(666, 3),
(666, 4);

INSERT INTO works_on (employee_e_id, project_p_id, start_date)
VALUES 
(1, 1, '2023-03-03'),
(2, 2, NULL),
(3, 1, '2023-08-09');

INSERT INTO has_a (employee_e_id, job_title_job_id)
VALUES 
(1, 1),
(2, 2),
(3, 3);

INSERT INTO buys (customer_cust_id, products_pr_id)
VALUES 
(124, 1),
(124, 4),
(125, 4),
(126, 2);

INSERT INTO role (role_id, role_name, role_desc, employee_e_id, employee_dept_id)
VALUES 
(1, 'programmer', 'works on programming apps', 1, 555),
(2, 'uxui designer', 'designs websites', 2, 555),
(3, 'developer', 'develops websites', 3, 666);

INSERT INTO can_be (cust_id, e_id)
VALUES 
(6, 125),
(7, 124);





 Select Max(salary) AS max_salary,min(salary) As min_salary
 from employee;

SELECT e_lname, dept_name, dept_id
FROM employee, department
WHERE e.dept_id = d.dept_id AND dept_id = 555;

SELECT dept_id, AVG(salary) AS avg_salary
FROM employees
GROUP BY dept_id
HAVING COUNT(*) > 5;

select count(*)nbofprod,cust_id
from customer
group by cust_id;

SELECT *
FROM customer
WHERE cust_id NOT IN (SELECT e_id FROM employee);

SELECT dept_name, dept_id
FROM department
WHERE dept_id NOT IN (SELECT dept_id FROM employee);

SELECT e1.lname AS employee_name
FROM employees e1
WHERE (e1.job_title, e1.salary) IN 
      (SELECT e2.job_title, e2.salary 
       FROM employees e2 
       WHERE e2.employee_id = e1.manager_id);
       
SELECT *
FROM employee e
WHERE e_id NOT IN (SELECT DISTINCT e_id FROM works_on)
AND salary = (SELECT MIN(salary) FROM employee );

SELECT e_id, e_fname, dept_id
FROM employee
WHERE dept_id = 666
UNION
SELECT cust_id, cust_name
FROM customer
WHERE age > 24;

SELECT e1.e_fname,e1.salary,e2.e_fname,e2.salary
from employee e1,employee e2
where e1.salary>e2.salary and e2.e_fname="sami";

SELECT * FROM employee WHERE e_fname LIKE 's%';

SELECT d.name, d.relation_ship, d.birth_date
FROM dependent d
WHERE d.employee_e_id =  1;



/*SUB QUERIES*/

 SELECT cust_name 
FROM customer 
WHERE cust_id IN ( SELECT customer_cust_id FROM buys
		 WHERE products_pr_id = ( SELECT pr_id FROM products 
					WHERE price = (SELECT MAX(price) FROM products) ) );

 SELECT dept_name
FROM department
WHERE dept_id IN (
    SELECT department_dept_id
    FROM employee
    GROUP BY department_dept_id
    HAVING AVG(salary) > 50000);

SELECT e_fname, e_lname
FROM employee
WHERE e_id IN (
    SELECT manager_m_id
    FROM managed_by
    WHERE department_dept_id = (
        SELECT department_dept_id
        FROM employee
        WHERE e_id = manager_m_id
    )
);

 SELECT pr_name
FROM products
WHERE pr_id IN (
    SELECT products_pr_id
    FROM sells
    WHERE department_dept_id IN (
        SELECT department_dept_id
        FROM project
        WHERE end_date BETWEEN '2024-01-01' AND '2025-12-31'));

SELECT e1.lname AS employee_name
FROM employees e1
WHERE (e1.job_title, e1.salary) IN 
      (SELECT e2.job_title, e2.salary 
       FROM employees e2 
       WHERE e2.employee_id = e1.manager_id);



/*JOINS QUERIES*/

SELECT c.cust_name, p.pr_name
FROM customer c
JOIN buys b ON c.cust_id = b.customer_cust_id
JOIN products p ON b.products_pr_id = p.pr_id;

 SELECT d.dept_name, COUNT(e.e_id) AS total_employees
FROM department d
JOIN employee e ON d.dept_id = e.department_dept_id
GROUP BY d.dept_name;

 SELECT d.dept_name, AVG(e.salary) AS avg_salary
FROM department d
JOIN employee e ON d.dept_id = e.department_dept_id
GROUP BY d.dept_name;

SELECT e.e_fname, e.e_lname, j.description AS job_title
FROM employee e
JOIN has_a h ON e.e_id = h.employee_e_id
JOIN job_title j ON h.job_title_job_id = j.job_id;



/*views*/

CREATE VIEW CustomerPurchases AS
SELECT c.cust_id, c.cust_name, p.pr_name, p.price
FROM customer c
JOIN buys b ON c.cust_id = b.customer_cust_id
JOIN products p ON b.products_pr_id = p.pr_id;

 CREATE VIEW EmployeeDetails AS
SELECT e.e_id, e.e_fname, e.e_lname, e.salary, d.dept_name
FROM employee e
JOIN department d ON e.department_dept_id = d.dept_id;

 CREATE VIEW DepartmentAverageSalary AS
SELECT d.dept_name, AVG(e.salary) AS avg_salary
FROM department d
JOIN employee e ON d.dept_id = e.department_dept_id
GROUP BY d.dept_name;

 CREATE VIEW EmployeeProjectDetails AS
SELECT e.e_id, e.e_fname, e.e_lname, p.p_name, w.start_date
FROM employee e
JOIN works_on w ON e.e_id = w.employee_e_id AND e.department_dept_id = w.employee_department_dept_id
JOIN project p ON w.project_p_id = p.p_id;

 CREATE VIEW ManagerDepartmentDetails AS
SELECT m.m_id, m.m_fname, m.m_lname, d.dept_name
FROM manager m
JOIN managed_by mb ON m.m_id = mb.manager_m_id
JOIN department d ON mb.department_dept_id = d.dept_id;



/*procedures*/

DELIMITER //
CREATE PROCEDURE AddEmployee(
    IN emp_id INT, 
    IN emp_fname CHAR(20), 
    IN emp_lname CHAR(20), 
    IN emp_salary DECIMAL(10,2), 
    IN emp_phone_nb INT, 
    IN emp_sex CHAR(6), 
    IN emp_address CHAR(100), 
    IN emp_dept_id INT)
BEGIN
    INSERT INTO employee (e_id, e_fname, e_lname, salary, phone_nb, sex, address, department_dept_id)    VALUES (emp_id, emp_fname, emp_lname, emp_salary, emp_phone_nb, emp_sex, emp_address, emp_dept_id);
END //
DELIMITER ;
CALL AddEmployee(8, 'John', 'Doe', 1800.50, 71456789, 'male', 'tripoli', 190);


DELIMITER //
CREATE PROCEDURE UpdateProductPrice(
IN prod_id INT, 
   IN new_price DECIMAL(10,2))
BEGIN
    UPDATE products
    SET price = new_price
    WHERE pr_id = prod_id;
END //
DELIMITER ;
CALL UpdateProductPrice(1, 1200.00);


DELIMITER //
CREATE PROCEDURE GetCustomerDetails(
    IN cust_id INT)
BEGIN
    SELECT cust_id, cust_name, age, email, phone_nb, nbofprod
    FROM customer
    WHERE cust_id = cust_id;
END //
DELIMITER ; 
CALL GetCustomerDetails(124);


DELIMITER //
CREATE PROCEDURE AssignEmployeeToProject(
   	 IN emp_id INT, 
   IN proj_id INT, 
   IN start_date DATE)
BEGIN
    INSERT INTO works_on (employee_e_id, project_p_id, start_date)
    VALUES (emp_id, proj_id, start_date);
END //
        DELIMITER ;
CALL AssignEmployeeToProject(3, 2, '2024-01-15');


 DELIMITER //
CREATE PROCEDURE DeleteManager(
    IN mgr_id INT)
BEGIN
    DELETE FROM manager
    WHERE m_id = mgr_id;
END //
DELIMITER ;
CALL DeleteManager(2);


/*triggers*/

DELIMITER //
CREATE TRIGGER UpdateCustomerNbofProd
AFTER INSERT ON buys
FOR EACH ROW
BEGIN
    UPDATE customer
    SET nbofprod = nbofprod + 1
    WHERE cust_id = NEW.customer_cust_id;
END //
DELIMITER ;

 DELIMITER //
CREATE TRIGGER PreventNegativeSalary
BEFORE INSERT ON employee
FOR EACH ROW
BEGIN
    IF NEW.salary < 0 THEN
        SIGNAL SQLSTATE '45000' 
        SET MESSAGE_TEXT = 'Salary cannot be negative.';
    END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER DeleteManagedByOnManagerDelete
AFTER DELETE ON manager
FOR EACH ROW
BEGIN
    DELETE FROM managed_by
    WHERE manager_m_id = OLD.m_id;
END //
DELIMITER ;

 DELIMITER //
CREATE TRIGGER AuditProductChanges
AFTER UPDATE ON products
FOR EACH ROW
BEGIN
    INSERT INTO product_audit (pr_id, old_price, new_price, change_date)
    VALUES (OLD.pr_id, OLD.price, NEW.price, NOW());
END //
DELIMITER ;

CREATE TABLE product_audit ( pr_id INT, old_price DECIMAL(10,2), new_price DECIMAL(10,2), change_date DATETIME );

 DELIMITER //
CREATE TRIGGER RestrictDepartmentDeletion
BEFORE DELETE ON department
FOR EACH ROW
BEGIN
    IF EXISTS (SELECT 1 FROM project WHERE department_dept_id = OLD.dept_id) THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Cannot delete a department with associated projects.';
    END IF;
END //
DELIMITER ;




INSERT INTO buys (customer_cust_id, products_pr_id) VALUES (124, 2);

INSERT INTO employee (e_id, e_fname, e_lname, salary, phone_nb, sex, address, department_dept_id)
VALUES (10, 'John', 'Smith', -1500, 12345678, 'male', 'city', 555); 

DELETE FROM manager WHERE m_id = 1;

UPDATE products SET price = 1200 WHERE pr_id = 1;
SELECT * FROM product_audit;

DELETE FROM department WHERE dept_id = 555; 


-- Create local user with full permissions
CREATE USER admin_user@localhost IDENTIFIED BY 'Admin123!';

-- Create local user with read-only permissions
CREATE USER readonly_user@localhost IDENTIFIED BY 'ReadOnly123!';

-- Create remote user with data manipulation permissions
CREATE USER dml_user@'%' IDENTIFIED BY 'DML123!';

-- Create remote user restricted to specific IP
CREATE USER restricted_user@192.168.1.100 IDENTIFIED BY 'Restricted123!';

-- Create local user with project-specific permissions
CREATE USER project_user@localhost IDENTIFIED BY 'Project123!';




-- Grant full administrative permissions to admin_user
GRANT ALL PRIVILEGES ON *.* TO admin_user@localhost WITH GRANT OPTION;

-- Grant read-only permissions to readonly_user
GRANT SELECT ON *.* TO readonly_user@localhost;

-- Grant data manipulation permissions to dml_user
GRANT SELECT, INSERT, UPDATE, DELETE ON database_name.* TO dml_user@'%';

-- Grant limited permissions to restricted_user (specific IP)
GRANT SELECT, INSERT ON database_name.* TO restricted_user@192.168.1.100;

-- Grant project-specific permissions to project_user
GRANT SELECT, INSERT, UPDATE ON database_name.project_table TO project_user@localhost;


CREATE DATABASE test_db; -- Should succeed
DROP DATABASE test_db; -- Should succeed

SELECT * FROM database_name.table_name; -- Should succeed
INSERT INTO database_name.table_name VALUES (1, 'Test'); -- Should fail

INSERT INTO database_name.table_name VALUES (1, 'Test'); -- Should succeed
DROP TABLE database_name.table_name; -- Should fail

SELECT * FROM database_name.table_name; -- Should succeed
DELETE FROM database_name.table_name WHERE id=1; -- Should fail

SELECT * FROM database_name.project_table; -- Should succeed
INSERT INTO database_name.project_table VALUES (1, 'Test'); -- Should succeed
SELECT * FROM database_name.other_table; -- Should fail



select * from department;
select * from customer;
select * from buys;
select * from can_be;
select * from dependent;
select * from employee;
select * from has_a;
select * from managed_by;
select * from job_title;
select * from manager;
select * from product_audit;
select * from products;
select * from project;
select * from role;
select * from sells;
select * from works_on;


drop table employee;
drop table department;
drop table buys;
drop table customer;
drop table dependent ;
drop table has_a;
drop table job_title;
drop table managed_by;
drop table manager;
drop table products;
drop table project;
drop table role;
drop table sells;
drop table works_on;
drop table can_be;


