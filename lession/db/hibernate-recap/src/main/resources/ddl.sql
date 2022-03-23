DROP SCHEMA IF EXISTS public CASCADE;
CREATE SCHEMA public;

create table city
(
    id        integer      not null
        primary key,
    city_name varchar(20) not null
);

create table employee_type
(
    id   integer      not null
        primary key,
    name varchar(20) not null
        constraint employee_type_key
            unique
);

create table employee
(
    id               bigserial primary key,
    email            varchar(30) not null,
    name             varchar(30) not null,
    phone_number     varchar(8),
    surname          varchar(50) not null,
    employee_type_id integer default 1
        constraint employee_employee_type_id_to_employee_type_id_fkey
            references employee_type
);

create table employee_city
(
    employees_id bigint not null
        constraint fk6csrhehs800f3ta45wtmss21g
            references employee,
    cities_id    integer not null
        constraint fk9kp9i954ls1pb21bhs96pjqvf
            references city
);

alter table city
    owner to root;

alter table employee
    owner to root;

alter table employee_city
    owner to root;

alter table employee_type
    owner to root;
