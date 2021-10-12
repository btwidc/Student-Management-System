create database javaspring;

use javaspring;

CREATE TABLE user (
id INT PRIMARY KEY,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
email VARCHAR(30) NOT NULL,
password VARCHAR(30) NOT NULL
);

CREATE TABLE role (
id INT PRIMARY KEY,
name VARCHAR(30) NOT NULL
);

CREATE TABLE users_roles (
user_id INT,
role_id INT,
FOREIGN KEY (user_id)  REFERENCES user (id),
FOREIGN KEY (role_id)  REFERENCES role (id)
);

