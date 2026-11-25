# Приклад Java-програми ведення розкладу коледжу з використанням СКБД MongoDB

## Кроки для виконання
1. Завантажте і встановіть Java Development Kit 23 for Windows.
1. Завантажте Maven з https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.zip і розпакуйте його на локальний комп'ютер.
1. В Windows в параметрах системи додайте системну змінну MAVEN_HOME=<шлях до папки з Maven>
1. В Windows в параметрах системи додайте `;<шлях до папки з Maven>\bin` в системну змінну PATH.
1. Встановіть СКБД MongoDB Community Server вибрати варіант установки Complete -> "Run service as Network Service user"
1. Встановіть MongoDB Compass (GUI).
1. Створіть базу даних `college-db` і колекцію в ній `college-schedule`.
1. Зберить програму використовуючи команду `mvn clean install`.
1. Запустіть програму за допомогою команди `mvn exec:java -Dexec.mainClass="com.college.CollegeApplication"`.

## Результати виконання програми
```
PS C:\Users\ironm\OneDrive\Документы\GitHub\ferry> mvn clean install
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< com.ferry:ferry-crossing >----------------------
[INFO] Building ferry-crossing 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ ferry-crossing ---
[INFO] Deleting C:\Users\ironm\OneDrive\Документы\GitHub\ferry\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ ferry-crossing ---
[INFO] Copying 2 resources from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ ferry-crossing ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 3 source files with javac [debug target 1.8] to target\classes
[WARNING] bootstrap class path is not set in conjunction with -source 8
  not setting the bootstrap class path may lead to class files that cannot run on JDK 8
    --release 8 is recommended instead of -source 8 -target 1.8 because it sets the bootstrap class path automatically
[WARNING] source value 8 is obsolete and will be removed in a future release
[WARNING] target value 8 is obsolete and will be removed in a future release
[WARNING] To suppress warnings about obsolete options, use -Xlint:-options.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ ferry-crossing ---
[INFO] skip non existing resourceDirectory C:\Users\ironm\OneDrive\Документы\GitHub\ferry\src\test\resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ ferry-crossing ---
[INFO] Recompiling the module because of changed dependency.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ ferry-crossing ---
[INFO] 
[INFO] --- jar:3.4.1:jar (default-jar) @ ferry-crossing ---
[INFO] Building jar: C:\Users\ironm\OneDrive\Документы\GitHub\ferry\target\ferry-crossing-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- install:3.1.2:install (default-install) @ ferry-crossing ---
[INFO] Installing C:\Users\ironm\OneDrive\Документы\GitHub\ferry\pom.xml to C:\Users\ironm\.m2\repository\com\ferry\ferry-crossing\1.0-SNAPSHOT\ferry-crossing-1.0-SNAPSHOT.pom
[INFO] Installing C:\Users\ironm\OneDrive\Документы\GitHub\ferry\target\ferry-crossing-1.0-SNAPSHOT.jar to C:\Users\ironm\.m2\repository\com\ferry\ferry-crossing\1.0-SNAPSHOT\ferry-crossing-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.815 s
[INFO] Finished at: 2026-11-25T21:21:40+02:00
[INFO] ------------------------------------------------------------------------
PS C:\Users\ironm\OneDrive\Документы\GitHub\ferry> mvn exec:java -D"exec.mainClass=com.ferry.FerryApplication"
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< com.ferry:ferry-crossing >----------------------
[INFO] Building ferry-crossing 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec:3.7.0:java (default-cli) @ ferry-crossing ---

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.4)

2026-11-25 21:21:55.394  INFO 15356 --- [lication.main()] com.ferry.FerryApplication               : Starting FerryApplication using Java 23.0.2 on PAVILION_HP with PID 15356 (C:\Users\ironm\OneDrive\Документы\GitHub\ferry\target\classes started by ironm in C:\Users\ironm\OneDrive\Документы\GitHub\ferry)
2026-11-25 21:21:55.398  INFO 15356 --- [lication.main()] com.ferry.FerryApplication               : No active profile set, falling back to default profiles: default
2026-11-25 21:21:56.039  INFO 15356 --- [lication.main()] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2026-11-25 21:21:56.134  INFO 15356 --- [lication.main()] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 88 ms. Found 1 MongoDB repository interfaces.
2026-11-25 21:21:56.651  INFO 15356 --- [lication.main()] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms'}
2026-11-25 21:21:56.790  INFO 15356 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:17}] to localhost:27017
2026-11-25 21:21:56.790  INFO 15356 --- [localhost:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:16}] to localhost:27017
2026-11-25 21:21:56.791  INFO 15356 --- [localhost:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=38967100}
2026-11-25 21:21:57.294  INFO 15356 --- [lication.main()] com.ferry.FerryApplication               : Started FerryApplication in 2.578 seconds (JVM running for 7.752)
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вихід
Введіть номер команди (1-4): 1
2026-11-25 21:22:00.019  INFO 15356 --- [lication.main()] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:18}] to localhost:27017
12 документів з рейсами порома завантажено з CSV.
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вихід
Введіть номер команди (1-4): 2
Знайдено 12 документів рейсів порома:
FerryFlight { id="6b073557c167ea29c5670571"
 flightNumber="2201"
 flightDate="2026-09-02"
 ferry="Дніпро"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 25 / 80"
 childPassenger="особа / 8 / 40"
 bicycle=""
 passengerCar="одиниця / 6 / 40"
}
FerryFlight { id="6b073557c167ea29c5670572"
 flightNumber="2202"
 flightDate="2026-09-03"
 ferry="Обрій"
 passengerSeats="80"
 parkingSpaces="8"
 adultPassenger=""
 childPassenger="особа / 6 / 40"
 bicycle="одиниця / 3 / 50"
 passengerCar=""
}
FerryFlight { id="6b073557c167ea29c5670573"
 flightNumber="2203"
 flightDate="2026-09-04"
 ferry="Дніпро"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 30 / 85"
 childPassenger="особа / 3 / 50"
 bicycle=""
 passengerCar="одиниця / 4 / 250"
}
FerryFlight { id="6b073557c167ea29c5670574"
 flightNumber="2204"
 flightDate="2026-09-05"
 ferry="Обрій"
 passengerSeats="80"
 parkingSpaces="8"
 adultPassenger=""
 childPassenger=""
 bicycle="одиниця / 5 / 50"
 passengerCar="одиниця / 6 / 250"
}
FerryFlight { id="6b073557c167ea29c5670575"
 flightNumber="2205"
 flightDate="2026-09-06"
 ferry="Дніпро"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 20 / 85"
 childPassenger="особа / 30 / 85"
 bicycle="одиниця / 3 / 55"
 passengerCar=""
}
FerryFlight { id="6b073557c167ea29c5670576"
 flightNumber="2206"
 flightDate="2026-09-16"
 ferry="Дніпро"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 25 / 80"
 childPassenger="особа / 8 / 40"
 bicycle=""
 passengerCar="одиниця / 6 / 40"
}
FerryFlight { id="6b073557c167ea29c5670577"
 flightNumber="2207"
 flightDate="2026-09-26"
 ferry="Обрій"
 passengerSeats="80"
 parkingSpaces="8"
 adultPassenger=""
 childPassenger="особа / 6 / 40"
 bicycle="одиниця / 3 / 50"
 passengerCar=""
}
FerryFlight { id="6b073557c167ea29c5670578"
 flightNumber="2208"
 flightDate="2026-10-06"
 ferry="Дніпро"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 30 / 85"
 childPassenger="особа / 3 / 50"
 bicycle=""
 passengerCar="одиниця / 4 / 250"
}
FerryFlight { id="6b073557c167ea29c5670579"
 flightNumber="2209"
 flightDate="2026-10-16"
 ferry="Обрій"
 passengerSeats="80"
 parkingSpaces="8"
 adultPassenger=""
 childPassenger=""
 bicycle="одиниця / 5 / 50"
 passengerCar="одиниця / 6 / 250"
}
FerryFlight { id="6b073557c167ea29c567057a"
 flightNumber="2210"
 flightDate="2026-10-26"
 ferry="Дніпро"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 20 / 85"
 childPassenger="особа / 30 / 85"
 bicycle="одиниця / 3 / 55"
 passengerCar=""
}
FerryFlight { id="6b073557c167ea29c567057b"
 flightNumber="2211"
 flightDate="2026-11-05"
 ferry="Дніпро"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 25 / 80"
 childPassenger="особа / 8 / 40"
 bicycle=""
 passengerCar="одиниця / 6 / 40"
}
FerryFlight { id="6b073557c167ea29c567057c"
 flightNumber="2212"
 flightDate="2026-11-15"
 ferry="Обрій"
 passengerSeats="80"
 parkingSpaces="8"
 adultPassenger=""
 childPassenger="особа / 6 / 40"
 bicycle="одиниця / 3 / 50"
 passengerCar=""
}
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вихід
Введіть номер команди (1-4): 3
Усі рейси порома видалено.
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вихід
Введіть номер команди (1-4): 1
12 документів з рейсами порома завантажено з CSV.
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вихід
Введіть номер команди (1-4): 4
2026-11-25 21:22:17.507  INFO 15356 --- [ionShutdownHook] org.mongodb.driver.connection            : Closed connection [connectionId{localValue:3, serverValue:18}] to localhost:27017 because the pool has been closed.
'''