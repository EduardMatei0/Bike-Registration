CREATE DATABASE  IF NOT EXISTS `bike_directory`;
USE `bike_directory`;


DROP TABLE IF EXISTS `bike`;

CREATE TABLE
    `bike`
    (
        id int(11) NOT NULL AUTO_INCREMENT,
        contact BOOLEAN NOT NULL,
        email VARCHAR(255),
        model VARCHAR(255),
        name VARCHAR(255),
        phone VARCHAR(255),
        purchase_date DATETIME,
        purchase_price NUMERIC,
        serial_number VARCHAR(255),
        PRIMARY KEY (id)
    );



INSERT INTO bike (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (1, 1, 'jeff@bikes.com', 'Globo MTB 29 Full Suspension', 'Jeff Miller', '328-443-5555', sysdate(), '1100');
INSERT INTO bike (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (2, 0, 'samantha@bikes.com', 'Globo Carbon Fiber Race Series', 'Samantha Davis', '448-397-5555', sysdate(), '1999');
INSERT INTO bike (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (3, 1, 'dave@bikes.com', 'Globo Time Trial Blade', 'Dave Warren', '563-891-5555', sysdate(), '2100');

