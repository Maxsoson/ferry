# Кроки для виконання
1. Встановіть локально PostgreSQL, Maven та Java.
2. Створіть базу даних ferry.
3. Вкажіть правильне значення властивості hibernate.connection.password у файлі "src\main\resources\hibernate.cfg.xml".
4. Зберіть програму за допомогою команди: mvn clean install.
5. Запустіть програму за допомогою команди: mvn exec:java -D"exec.mainClass=com.ferry.MainApp".
6. Якщо термінал відображає знаки питання "?" замість українських символів, зконфігуруйте термінал на відображення шрифту в форматі UTF-8 виконавши команду chcp 65001 та встановивши кодування для Maven: $env:MAVEN_OPTS="-Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8".

# Результати виконання програми
```
Nov 18, 2026 1:10:15 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.6.14.Final
Nov 18, 2026 1:10:15 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Nov 18, 2026 1:10:15 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Nov 18, 2026 1:10:15 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [org.postgresql.Driver] at URL [jdbc:postgresql://localhost:5432/ferry]
Nov 18, 2026 1:10:15 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=postgres, password=****}
Nov 18, 2026 1:10:15 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Nov 18, 2026 1:10:15 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
Nov 18, 2026 1:10:16 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.PostgreSQLDialect
Hibernate: 

    alter table flight 
       drop constraint FK_flight_ferry
Hibernate: 

    alter table ticket_sale 
       drop constraint FK_ticket_sale_category
Hibernate: 

    alter table ticket_sale 
       drop constraint FK_ticket_sale_flight
Hibernate: 

    drop table if exists ferry cascade
Hibernate: 

    drop table if exists flight cascade
Hibernate: 

    drop table if exists ticket_category cascade
Hibernate: 

    drop table if exists ticket_sale cascade
Hibernate: 

    create table ferry (
       ferry varchar(255) not null,
        parking_spaces int4,
        passenger_seats int4,
        primary key (ferry)
    )
Hibernate: 

    create table flight (
       flight_number int4 not null,
        flight_date date,
        ferry varchar(255),
        primary key (flight_number)
    )
Hibernate: 

    create table ticket_category (
       ticket_category varchar(255) not null,
        accounting_unit varchar(255),
        primary key (ticket_category)
    )
Hibernate: 

    create table ticket_sale (
       flight_number int4 not null,
        ticket_category varchar(255) not null,
        ticket_price_uah int4,
        tickets_sold int4,
        primary key (flight_number, ticket_category)
    )
Hibernate: 

    alter table flight 
       add constraint FK_flight_ferry 
       foreign key (ferry) 
       references ferry
Hibernate: 

    alter table ticket_sale 
       add constraint FK_ticket_sale_category 
       foreign key (ticket_category) 
       references ticket_category
Hibernate: 

    alter table ticket_sale 
       add constraint FK_ticket_sale_flight 
       foreign key (flight_number) 
       references flight
Hibernate: 
    insert 
    into
        ferry
        (parking_spaces, passenger_seats, ferry) 
    values
        (?, ?, ?)
...
Дані успішно збережено!
Hibernate: 
    select
        flight1_.flight_number as col_0_0_,
        flight1_.flight_date as col_1_0_,
        ferry2_.ferry as col_2_0_,
        ferry2_.passenger_seats as col_3_0_,
        ferry2_.parking_spaces as col_4_0_,
        ticketcate3_.ticket_category as col_5_0_,
        ticketcate3_.accounting_unit as col_6_0_,
        ticketsale0_.tickets_sold as col_7_0_,
        ticketsale0_.ticket_price_uah as col_8_0_ 
    from
        ticket_sale ticketsale0_ 
    inner join
        flight flight1_ 
            on ticketsale0_.flight_number=flight1_.flight_number 
    inner join
        ferry ferry2_ 
            on flight1_.ferry=ferry2_.ferry 
    inner join
        ticket_category ticketcate3_ 
            on ticketsale0_.ticket_category=ticketcate3_.ticket_category 
    order by
        flight1_.flight_number ASC
Номер рейсу: 2201
Дата рейсу: 9/2/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дорослий пасажир
Одиниця обліку: особа
Продано квитків: 25
Ціна квитка, грн: 80
--------------------------------------------------
Номер рейсу: 2201
Дата рейсу: 9/2/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 8
Ціна квитка, грн: 40
--------------------------------------------------
Номер рейсу: 2201
Дата рейсу: 9/2/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Легковий автомобіль
Одиниця обліку: одиниця
Продано квитків: 6
Ціна квитка, грн: 40
--------------------------------------------------
...
Nov 18, 2026 1:10:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PoolState stop
INFO: HHH10001008: Cleaning up connection pool [jdbc:postgresql://localhost:5432/ferry]
```