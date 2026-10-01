
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT,
    date_of_birth DATE,
    email_id VARCHAR(100) NOT NULL,
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(255)
);


INSERT INTO students (student_id, name, age, date_of_birth, email_id, phone_number, address)
VALUES 
(1, 'Rahul Sharma', 20, '2004-05-15', 'rahul.sharma@example.com', '9876543210', '123 Park Street, Mumbai'),
(2, 'Priya Patel', 21, '2003-08-22', 'priya.patel@example.com', '9876543211', '45 MG Road, Bengaluru'),
(3, 'Amit Verma', 19, '2005-01-10', 'amit.verma@example.com', '9876543212', '78 Civil Lines, Delhi');


SELECT * FROM students;