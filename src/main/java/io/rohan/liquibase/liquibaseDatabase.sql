/*CREATE SCHEMA liquibase;*/

USE liquibase;

CREATE TABLE persons(
	id int NOT NULL,
    name VARCHAR(255),
    height VARCHAR(255)
);