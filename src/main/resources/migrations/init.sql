
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    firstname VARCHAR (50) NOT NULL,
    lastname VARCHAR (50) NOT NULL,
    description VARCHAR (255) NOT NULL,
    login VARCHAR(60) NOT NULL,
    created_at TIMESTAMP NOT NULL
);


CREATE SEQUENCE hibernate_sequence START 1;

--ALTER TABLE users ADD COLUMN login VARCHAR(60)