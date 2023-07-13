create table example
(
    id           varchar(36) not null,
    code         varchar(50) not null
);

alter table example
    add CONSTRAINT pk_example PRIMARY KEY (id);