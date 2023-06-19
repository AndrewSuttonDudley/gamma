create schema if not exists gamma;

create table if not exists gamma.customers (
    id serial primary key,
    name varchar(255) not null
);
