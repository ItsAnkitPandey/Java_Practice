CREATE TABLE Employees (
    employee_id NUMBER PRIMARY KEY,
    employee_name VARCHAR2(100),
    department_id NUMBER,
    salary NUMBER
);

INSERT INTO Employees (employee_id, employee_name, department_id, salary)
VALUES (1, 'John Doe', 101, 50000);

INSERT INTO Employees (employee_id, employee_name, department_id, salary)
VALUES (2, 'Jane Smith', 102, 60000);

INSERT INTO Employees (employee_id, employee_name, department_id, salary)
VALUES (3, 'Alice Johnson', 101, 55000);

INSERT INTO Employees (employee_id, employee_name, department_id, salary)
VALUES (4, 'Bob Brown', 103, 52000);

INSERT INTO Employees (employee_id, employee_name, department_id, salary)
VALUES (5, 'Emily Davis', 102, 63000);


SELECT department_id, AVG(salary) AS average_salary
FROM Employees
GROUP BY department_id;