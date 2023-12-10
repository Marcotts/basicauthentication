create table User
(
    id int auto_increment primary key,
    NAME VARCHAR2(15),
    SURNAME VARCHAR2(15),
    EMAIL VARCHAR2(15),
    USERNAME VARCHAR2(15),
    PASSWORD VARCHAR2(15)
);

CREATE SEQUENCE SEQ_BATCH_PER_DAY
    MINVALUE 4000
    MAXVALUE 7000
    INCREMENT BY 1
    START WITH 4000
    CYCLE;

INSERT INTO User (NAME, SURNAME, EMAIL, USERNAME, PASSWORD) VALUES('NAME3', 'SURNAME3', 'EMAIL3', 'USERNAME3', 'PASSWORD3');


create table test(id bigint auto_increment, name varchar(255));
insert into test(name) values('hello');
insert into test(name) values('world');
select * from test;
