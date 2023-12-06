create table users
(
    id serial not null primary key,
    username varchar(30),
    password_hash varchar(30),
    course_name varchar(30),
    email varchar(30)
);