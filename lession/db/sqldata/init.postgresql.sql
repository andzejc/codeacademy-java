-- DDL
create schema if not exists paskaita5;

create table paskaita5.employee
(
    id              serial
        constraint employee_pk
            primary key,
    personal_code   varchar(11)      not null,
    name            varchar(20)      not null,
    surname         varchar(60)      not null,
    job_title       varchar(20),
    employment_date date             not null,
    salary          double precision not null
);

-- DCL
alter table paskaita5.employee
    owner to postgres;

-- DDL
create unique index employee_personal_code_uindex
    on paskaita5.employee (personal_code);

-- DML
insert into paskaita5.employee (id, personal_code, name, surname, job_title, employment_date, salary)
values  (1, '33309240064', 'Vardas', 'Pavardenis', 'SQL God', '2022-03-13', 6000),
        (2, '33309240063', 'Petras', 'Petraitis', 'PM', '2021-03-10', 5012.89);
