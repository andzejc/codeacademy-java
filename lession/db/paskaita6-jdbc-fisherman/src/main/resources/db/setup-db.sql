create table fisherman.hook_size
(
    id                 serial
        constraint hook_size_pk primary key,
    name               varchar(20) not null unique
);


create table fisherman.fisherman
(
    id                 serial
        constraint fisherman_pk primary key,
    name               varchar(20) not null,
    surname            varchar(60) not null,
    age                integer,
    rod                varchar(30) not null,
    hook_size_id       integer     not null,
    start_fishing_date date        not null
);

create table fisherman.fish
(
    id            serial
        constraint fish_pk primary key,
    name          varchar(20) not null,
    weight        integer,
    favorite_food varchar(30) not null,
    hook_size_id  integer     not null
);


create table fisherman.fisherman_fish
(
    id                     serial
        constraint fisherman_fish_pk primary key,
    fisherman_id           integer,
    fish_id                integer,
    fish_capture_date_time timestamp not null default current_timestamp,
    CONSTRAINT fisherman_fish_fish_id_fk
        FOREIGN KEY (fish_id)
            REFERENCES fisherman.fish (id)
            ON DELETE CASCADE
            ON UPDATE CASCADE,
    CONSTRAINT fisherman_fish_fisherman_id_fk
        FOREIGN KEY (fisherman_id)
            REFERENCES fisherman.fisherman (id)
            ON DELETE CASCADE
            ON UPDATE CASCADE
);

ALTER TABLE fisherman.fish
    ADD CONSTRAINT fish_hook_size_id_fk
        FOREIGN KEY (hook_size_id)
            REFERENCES fisherman.hook_size (id)
            ON DELETE CASCADE
            ON UPDATE CASCADE;

ALTER TABLE fisherman.fisherman
    ADD CONSTRAINT fisherman_hook_size_id_fk
        FOREIGN KEY (hook_size_id)
            REFERENCES fisherman.hook_size (id)
            ON DELETE CASCADE
            ON UPDATE CASCADE;


Insert into fisherman.hook_size (id, name)
values (1, 'SMALL'),
       (2, 'MEDIUM'),
       (3, 'LARGE');
