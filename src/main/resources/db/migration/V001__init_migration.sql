-- Создание схемы
CREATE SCHEMA IF NOT EXISTS like_test;

-- Создание последовательности;
CREATE SEQUENCE IF NOT EXISTS like_test.like_test_seq;

-- Создание таблицы;
CREATE TABLE IF NOT EXISTS like_test.user
(
    id serial PRIMARY KEY,
    name text
);

CREATE TABLE IF NOT EXISTS like_test.post
(
    id serial PRIMARY KEY,
    name text
);






