CREATE TABLE IF NOT EXISTS users(
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    email varchar(225) NOT NULL,
    password varchar(225) NOT NULL,
    first_name varchar(225) NOT NULL,
    last_name varchar(225) NOT NULL,
    phone_number varchar(225) NOT NULL
);