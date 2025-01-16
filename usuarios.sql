CREATE DATABASE usuarios;

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    country VARCHAR(100),
    age VARCHAR(3)
);

CREATE TABLE skills (
    id SERIAL PRIMARY KEY,
    user_id INTEGER REFERENCES users(id) ON DELETE CASCADE,
    name VARCHAR(50),
    years INTEGER
);

CREATE TABLE languages (
    id SERIAL PRIMARY KEY,
    user_id INTEGER REFERENCES users(id) ON DELETE CASCADE,
    name VARCHAR(50),
    level VARCHAR(50)
);

CREATE TABLE experiences (
    id SERIAL PRIMARY KEY,
    user_id INTEGER REFERENCES users(id) ON DELETE CASCADE,
    company VARCHAR(100),
    position VARCHAR(100),
    duration VARCHAR(50)
);
