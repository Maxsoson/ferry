# Кроки для виконання
1. Встановіть локально PostgreSQL, Maven та Java.
2. Створіть базу даних ferry.
3. Вкажіть правильне значення властивості hibernate.connection.password у файлі "src\main\resources\hibernate.cfg.xml".
4. Зберіть програму за допомогою команди: mvn clean install.
5. Запустіть програму за допомогою команди: mvn exec:java -D"exec.mainClass=com.ferry.MainApp".
6. Якщо термінал відображає знаки питання "?" замість українських символів, зконфігуруйте термінал на відображення шрифту в форматі UTF-8 виконавши команду chcp 65001 та встановивши кодування для Maven: $env:MAVEN_OPTS="-Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8".

# Результати виконання програми
```
@Maxsoson ➜ /workspaces/ferry (main) $ mvn exec:java -D"exec.mainClass=com.ferry.MainApp"
 [INFO] Scanning for projects...
[INFO] Loaded 24535 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] ------------------------< com.ferry:ferry-app >-------------------------
[INFO] Building ferry-app 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] Could not transfer metadata /.meta/prefixes.txt from/to jvnet-nexus-releases (https://maven.java.net/content/repositories/releases/): (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
[INFO] 
[INFO] --- exec:3.7.0:java (default-cli) @ ferry-app ---
[INFO] Loaded 50 auto-discovered prefixes for remote repository ow2-snapshot (prefixes-ow2-snapshot.txt)
Nov 18, 2026 11:37:14 AM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.6.14.Final
Nov 18, 2026 11:37:14 AM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Nov 18, 2026 11:37:14 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Nov 18, 2026 11:37:14 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [org.postgresql.Driver] at URL [jdbc:postgresql://localhost:5433/ferry]
Nov 18, 2026 11:37:14 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=postgres, password=****}
Nov 18, 2026 11:37:14 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Nov 18, 2026 11:37:14 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
Nov 18, 2026 11:37:14 AM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.PostgreSQLDialect
Hibernate: 
    
    alter table flight 
       drop constraint FKdp4dfia0skgkoqrew73y583mh
Nov 18, 2026 11:37:15 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@73baf59] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Nov 18, 2026 11:37:15 AM org.hibernate.tool.schema.internal.ExceptionHandlerLoggedImpl handleException
WARN: GenerationTarget encountered exception accepting command : Error executing DDL "
    alter table flight 
       drop constraint FKdp4dfia0skgkoqrew73y583mh" via JDBC Statement
org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "
    alter table flight 
       drop constraint FKdp4dfia0skgkoqrew73y583mh" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.applySqlString(SchemaDropperImpl.java:387)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.applySqlStrings(SchemaDropperImpl.java:371)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.applyConstraintDropping(SchemaDropperImpl.java:341)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.dropFromMetadata(SchemaDropperImpl.java:235)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.performDrop(SchemaDropperImpl.java:156)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.doDrop(SchemaDropperImpl.java:128)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.doDrop(SchemaDropperImpl.java:114)
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:157)
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:85)
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:335)
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:471)
        at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:728)
        at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:746)
        at com.ferry.MainApp.main(MainApp.java:16)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
        at java.base/java.lang.reflect.Method.invoke(Method.java:565)
        at org.codehaus.mojo.exec.AbstractExecJavaBase.executeMainMethod(AbstractExecJavaBase.java:478)
        at org.codehaus.mojo.exec.ExecJavaMojo.executeMainMethod(ExecJavaMojo.java:142)
        at org.codehaus.mojo.exec.AbstractExecJavaBase.doExecClassLoader(AbstractExecJavaBase.java:453)
        at org.codehaus.mojo.exec.AbstractExecJavaBase.lambda$execute$0(AbstractExecJavaBase.java:317)
        at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.postgresql.util.PSQLException: ERROR: relation "flight" does not exist
        at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2725)
        at org.postgresql.core.v3.QueryExecutorImpl.processResults(QueryExecutorImpl.java:2412)
        at org.postgresql.core.v3.QueryExecutorImpl.execute(QueryExecutorImpl.java:371)
        at org.postgresql.jdbc.PgStatement.executeInternal(PgStatement.java:502)
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:419)
        at org.postgresql.jdbc.PgStatement.executeWithFlags(PgStatement.java:341)
        at org.postgresql.jdbc.PgStatement.executeCachedSql(PgStatement.java:326)
        at org.postgresql.jdbc.PgStatement.executeWithFlags(PgStatement.java:302)
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:297)
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54)
        ... 21 more

Hibernate: 
    
    alter table ticket_sale 
       drop constraint FK7dcawp6km4a7tjld5qhxijghf
Nov 18, 2026 11:37:15 AM org.hibernate.tool.schema.internal.ExceptionHandlerLoggedImpl handleException
WARN: GenerationTarget encountered exception accepting command : Error executing DDL "
    alter table ticket_sale 
       drop constraint FK7dcawp6km4a7tjld5qhxijghf" via JDBC Statement
org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "
    alter table ticket_sale 
       drop constraint FK7dcawp6km4a7tjld5qhxijghf" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.applySqlString(SchemaDropperImpl.java:387)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.applySqlStrings(SchemaDropperImpl.java:371)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.applyConstraintDropping(SchemaDropperImpl.java:341)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.dropFromMetadata(SchemaDropperImpl.java:235)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.performDrop(SchemaDropperImpl.java:156)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.doDrop(SchemaDropperImpl.java:128)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.doDrop(SchemaDropperImpl.java:114)
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:157)
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:85)
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:335)
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:471)
        at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:728)
        at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:746)
        at com.ferry.MainApp.main(MainApp.java:16)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
        at java.base/java.lang.reflect.Method.invoke(Method.java:565)
        at org.codehaus.mojo.exec.AbstractExecJavaBase.executeMainMethod(AbstractExecJavaBase.java:478)
        at org.codehaus.mojo.exec.ExecJavaMojo.executeMainMethod(ExecJavaMojo.java:142)
        at org.codehaus.mojo.exec.AbstractExecJavaBase.doExecClassLoader(AbstractExecJavaBase.java:453)
        at org.codehaus.mojo.exec.AbstractExecJavaBase.lambda$execute$0(AbstractExecJavaBase.java:317)
        at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.postgresql.util.PSQLException: ERROR: relation "ticket_sale" does not exist
        at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2725)
        at org.postgresql.core.v3.QueryExecutorImpl.processResults(QueryExecutorImpl.java:2412)
        at org.postgresql.core.v3.QueryExecutorImpl.execute(QueryExecutorImpl.java:371)
        at org.postgresql.jdbc.PgStatement.executeInternal(PgStatement.java:502)
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:419)
        at org.postgresql.jdbc.PgStatement.executeWithFlags(PgStatement.java:341)
        at org.postgresql.jdbc.PgStatement.executeCachedSql(PgStatement.java:326)
        at org.postgresql.jdbc.PgStatement.executeWithFlags(PgStatement.java:302)
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:297)
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54)
        ... 21 more

Hibernate: 
    
    alter table ticket_sale 
       drop constraint FKcpp8omve68dbfyelfe8pk9pw2
Nov 18, 2026 11:37:15 AM org.hibernate.tool.schema.internal.ExceptionHandlerLoggedImpl handleException
WARN: GenerationTarget encountered exception accepting command : Error executing DDL "
    alter table ticket_sale 
       drop constraint FKcpp8omve68dbfyelfe8pk9pw2" via JDBC Statement
org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "
    alter table ticket_sale 
       drop constraint FKcpp8omve68dbfyelfe8pk9pw2" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.applySqlString(SchemaDropperImpl.java:387)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.applySqlStrings(SchemaDropperImpl.java:371)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.applyConstraintDropping(SchemaDropperImpl.java:341)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.dropFromMetadata(SchemaDropperImpl.java:235)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.performDrop(SchemaDropperImpl.java:156)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.doDrop(SchemaDropperImpl.java:128)
        at org.hibernate.tool.schema.internal.SchemaDropperImpl.doDrop(SchemaDropperImpl.java:114)
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:157)
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:85)
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:335)
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:471)
        at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:728)
        at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:746)
        at com.ferry.MainApp.main(MainApp.java:16)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
        at java.base/java.lang.reflect.Method.invoke(Method.java:565)
        at org.codehaus.mojo.exec.AbstractExecJavaBase.executeMainMethod(AbstractExecJavaBase.java:478)
        at org.codehaus.mojo.exec.ExecJavaMojo.executeMainMethod(ExecJavaMojo.java:142)
        at org.codehaus.mojo.exec.AbstractExecJavaBase.doExecClassLoader(AbstractExecJavaBase.java:453)
        at org.codehaus.mojo.exec.AbstractExecJavaBase.lambda$execute$0(AbstractExecJavaBase.java:317)
        at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: org.postgresql.util.PSQLException: ERROR: relation "ticket_sale" does not exist
        at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2725)
        at org.postgresql.core.v3.QueryExecutorImpl.processResults(QueryExecutorImpl.java:2412)
        at org.postgresql.core.v3.QueryExecutorImpl.execute(QueryExecutorImpl.java:371)
        at org.postgresql.jdbc.PgStatement.executeInternal(PgStatement.java:502)
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:419)
        at org.postgresql.jdbc.PgStatement.executeWithFlags(PgStatement.java:341)
        at org.postgresql.jdbc.PgStatement.executeCachedSql(PgStatement.java:326)
        at org.postgresql.jdbc.PgStatement.executeWithFlags(PgStatement.java:302)
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:297)
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54)
        ... 21 more

Hibernate: 
    
    drop table if exists ferry cascade
Nov 18, 2026 11:37:15 AM org.hibernate.engine.jdbc.spi.SqlExceptionHelper$StandardWarningHandler logWarning
WARN: SQL Warning Code: 0, SQLState: 00000
Nov 18, 2026 11:37:15 AM org.hibernate.engine.jdbc.spi.SqlExceptionHelper$StandardWarningHandler logWarning
WARN: table "ferry" does not exist, skipping
Hibernate: 
    
    drop table if exists flight cascade
Nov 18, 2026 11:37:15 AM org.hibernate.engine.jdbc.spi.SqlExceptionHelper$StandardWarningHandler logWarning
WARN: SQL Warning Code: 0, SQLState: 00000
Nov 18, 2026 11:37:15 AM org.hibernate.engine.jdbc.spi.SqlExceptionHelper$StandardWarningHandler logWarning
WARN: table "flight" does not exist, skipping
Hibernate: 
    
    drop table if exists ticket_category cascade
Nov 18, 2026 11:37:15 AM org.hibernate.engine.jdbc.spi.SqlExceptionHelper$StandardWarningHandler logWarning
WARN: SQL Warning Code: 0, SQLState: 00000
Nov 18, 2026 11:37:15 AM org.hibernate.engine.jdbc.spi.SqlExceptionHelper$StandardWarningHandler logWarning
WARN: table "ticket_category" does not exist, skipping
Hibernate: 
    
    drop table if exists ticket_sale cascade
Nov 18, 2026 11:37:15 AM org.hibernate.engine.jdbc.spi.SqlExceptionHelper$StandardWarningHandler logWarning
WARN: SQL Warning Code: 0, SQLState: 00000
Nov 18, 2026 11:37:15 AM org.hibernate.engine.jdbc.spi.SqlExceptionHelper$StandardWarningHandler logWarning
WARN: table "ticket_sale" does not exist, skipping
Hibernate: 
    
    create table ferry (
       ferry varchar(255) not null,
        parking_spaces int4,
        passenger_seats int4,
        primary key (ferry)
    )
Nov 18, 2026 11:37:15 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@1cbca6f5] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
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
       add constraint FKdp4dfia0skgkoqrew73y583mh 
       foreign key (ferry) 
       references ferry
Hibernate: 
    
    alter table ticket_sale 
       add constraint FK7dcawp6km4a7tjld5qhxijghf 
       foreign key (ticket_category) 
       references ticket_category
Hibernate: 
    
    alter table ticket_sale 
       add constraint FKcpp8omve68dbfyelfe8pk9pw2 
       foreign key (flight_number) 
       references flight
Hibernate: 
    insert 
    into
        ferry
        (parking_spaces, passenger_seats, ferry) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        ferry
        (parking_spaces, passenger_seats, ferry) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_category
        (accounting_unit, ticket_category) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        ticket_category
        (accounting_unit, ticket_category) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        ticket_category
        (accounting_unit, ticket_category) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        ticket_category
        (accounting_unit, ticket_category) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        flight
        (ferry, flight_date, flight_number) 
    values
        (?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        ticket_sale
        (ticket_price_uah, tickets_sold, flight_number, ticket_category) 
    values
        (?, ?, ?, ?)
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
Номер рейсу: 2202
Дата рейсу: 9/3/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 6
Ціна квитка, грн: 40
--------------------------------------------------
Номер рейсу: 2202
Дата рейсу: 9/3/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Велосипед
Одиниця обліку: одиниця
Продано квитків: 3
Ціна квитка, грн: 50
--------------------------------------------------
Номер рейсу: 2203
Дата рейсу: 9/4/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дорослий пасажир
Одиниця обліку: особа
Продано квитків: 30
Ціна квитка, грн: 85
--------------------------------------------------
Номер рейсу: 2203
Дата рейсу: 9/4/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 3
Ціна квитка, грн: 50
--------------------------------------------------
Номер рейсу: 2203
Дата рейсу: 9/4/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Легковий автомобіль
Одиниця обліку: одиниця
Продано квитків: 4
Ціна квитка, грн: 250
--------------------------------------------------
Номер рейсу: 2204
Дата рейсу: 9/5/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Велосипед
Одиниця обліку: одиниця
Продано квитків: 5
Ціна квитка, грн: 50
--------------------------------------------------
Номер рейсу: 2204
Дата рейсу: 9/5/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Легковий автомобіль
Одиниця обліку: одиниця
Продано квитків: 6
Ціна квитка, грн: 250
--------------------------------------------------
Номер рейсу: 2205
Дата рейсу: 9/6/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дорослий пасажир
Одиниця обліку: особа
Продано квитків: 20
Ціна квитка, грн: 85
--------------------------------------------------
Номер рейсу: 2205
Дата рейсу: 9/6/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 30
Ціна квитка, грн: 85
--------------------------------------------------
Номер рейсу: 2205
Дата рейсу: 9/6/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Велосипед
Одиниця обліку: одиниця
Продано квитків: 3
Ціна квитка, грн: 55
--------------------------------------------------
Номер рейсу: 2206
Дата рейсу: 9/16/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дорослий пасажир
Одиниця обліку: особа
Продано квитків: 25
Ціна квитка, грн: 80
--------------------------------------------------
Номер рейсу: 2206
Дата рейсу: 9/16/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 8
Ціна квитка, грн: 40
--------------------------------------------------
Номер рейсу: 2206
Дата рейсу: 9/16/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Легковий автомобіль
Одиниця обліку: одиниця
Продано квитків: 6
Ціна квитка, грн: 40
--------------------------------------------------
Номер рейсу: 2207
Дата рейсу: 9/26/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 6
Ціна квитка, грн: 40
--------------------------------------------------
Номер рейсу: 2207
Дата рейсу: 9/26/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Велосипед
Одиниця обліку: одиниця
Продано квитків: 3
Ціна квитка, грн: 50
--------------------------------------------------
Номер рейсу: 2208
Дата рейсу: 10/6/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дорослий пасажир
Одиниця обліку: особа
Продано квитків: 30
Ціна квитка, грн: 85
--------------------------------------------------
Номер рейсу: 2208
Дата рейсу: 10/6/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 3
Ціна квитка, грн: 50
--------------------------------------------------
Номер рейсу: 2208
Дата рейсу: 10/6/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Легковий автомобіль
Одиниця обліку: одиниця
Продано квитків: 4
Ціна квитка, грн: 250
--------------------------------------------------
Номер рейсу: 2209
Дата рейсу: 10/16/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Велосипед
Одиниця обліку: одиниця
Продано квитків: 5
Ціна квитка, грн: 50
--------------------------------------------------
Номер рейсу: 2209
Дата рейсу: 10/16/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Легковий автомобіль
Одиниця обліку: одиниця
Продано квитків: 6
Ціна квитка, грн: 250
--------------------------------------------------
Номер рейсу: 2210
Дата рейсу: 10/26/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дорослий пасажир
Одиниця обліку: особа
Продано квитків: 20
Ціна квитка, грн: 85
--------------------------------------------------
Номер рейсу: 2210
Дата рейсу: 10/26/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 30
Ціна квитка, грн: 85
--------------------------------------------------
Номер рейсу: 2210
Дата рейсу: 10/26/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Велосипед
Одиниця обліку: одиниця
Продано квитків: 3
Ціна квитка, грн: 55
--------------------------------------------------
Номер рейсу: 2211
Дата рейсу: 11/5/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дорослий пасажир
Одиниця обліку: особа
Продано квитків: 25
Ціна квитка, грн: 80
--------------------------------------------------
Номер рейсу: 2211
Дата рейсу: 11/5/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 8
Ціна квитка, грн: 40
--------------------------------------------------
Номер рейсу: 2211
Дата рейсу: 11/5/2026
Пором: Дніпро
Пасажирських місць: 100
Місць для автомобілів: 12
Категорія квитка: Легковий автомобіль
Одиниця обліку: одиниця
Продано квитків: 6
Ціна квитка, грн: 40
--------------------------------------------------
Номер рейсу: 2212
Дата рейсу: 11/15/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Дитячий пасажир
Одиниця обліку: особа
Продано квитків: 6
Ціна квитка, грн: 40
--------------------------------------------------
Номер рейсу: 2212
Дата рейсу: 11/15/2026
Пором: Обрій
Пасажирських місць: 80
Місць для автомобілів: 8
Категорія квитка: Велосипед
Одиниця обліку: одиниця
Продано квитків: 3
Ціна квитка, грн: 50
--------------------------------------------------
Nov 18, 2026 11:37:15 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PoolState stop
INFO: HHH10001008: Cleaning up connection pool [jdbc:postgresql://localhost:5433/ferry]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.444 s
[INFO] Finished at: 2026-11-18T11:37:15Z
[INFO] ------------------------------------------------------------------------
```