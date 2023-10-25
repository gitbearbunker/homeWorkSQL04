CREATE TABLE if not EXISTS PERSONS
(
    name varchar(15) not null,
    surname varchar(25) not null,
    age int not null,
    phone_number varchar(20) not null,
    city_of_living varchar(15) not null,
    PRIMARY KEY(name, surname, age)
    );

INSERT INTO PERSONS(name,surname,age,phone_number, city_of_living)
VALUES ('Petr', 'Ivanov', 50, '89161111111','Moscow'),
       ('Denis', 'Ivanov', 15, '89032222222','Tambov'),
       ('Sergey', 'Ivanov', 23, '89213333333','Tver'),
       ('Vladimir', 'Ivanov', 40, '89164444444','Stupino'),
