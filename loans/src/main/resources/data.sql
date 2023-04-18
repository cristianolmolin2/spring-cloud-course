DROP TABLE IF EXISTS loans;

CREATE TABLE loans(
    customer_id int NOT NULL,
    loan_number int AUTO_INCREMENT PRIMARY KEY,
    start_dt date NOT NULL,
    loan_type varchar(100) NOT NULL,
    total_loan int NOT NULL,
    amount_paid int NOT NULL,
    outstanding_amount int NOT NULL,
    create_dt date DEFAULT NULL
);

INSERT INTO loans(customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
    VALUES (1, CURDATE()-250, 'Home', 200000, 50000, 150000, CURDATE()-250);

INSERT INTO loans(customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
    VALUES (1, CURDATE()-376, 'Vehicle', 40000, 10000, 30000, CURDATE()-376);

INSERT INTO loans(customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
    VALUES (1, CURDATE()-549, 'Home', 50000, 10000, 40000, CURDATE()-549);

INSERT INTO loans(customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
    VALUES (1, CURDATE()-122, 'Personal', 10000, 3500, 6500, CURDATE()-122);