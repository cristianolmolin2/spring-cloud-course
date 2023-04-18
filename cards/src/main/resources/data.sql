DROP TABLE IF EXISTS cards;

CREATE TABLE cards(
    card_id int AUTO_INCREMENT PRIMARY KEY,
    customer_id int NOT NULL,
    card_number varchar(100) NOT NULL,
    card_type varchar(100) NOT NULL,
    total_limit int NOT NULL,
    amount_used int NOT NULL,
    available_amount int NOT NULL,
    create_dt date DEFAULT NULL
);

INSERT INTO CARDS(customer_id, card_number, card_type, total_limit, amount_used, available_amount, create_dt)
    VALUES (1, '4565XXXX1234', 'Credit', 10000, 500, 9500, CURDATE());

INSERT INTO CARDS(customer_id, card_number, card_type, total_limit, amount_used, available_amount, create_dt)
    VALUES (1, '9878XXXX2581', 'Credit', 7500, 600, 6900, CURDATE());

INSERT INTO CARDS(customer_id, card_number, card_type, total_limit, amount_used, available_amount, create_dt)
    VALUES (1, '1232XXXX9876', 'Credit', 20000, 4000, 16000, CURDATE());