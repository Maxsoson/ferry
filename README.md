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
[INFO] Total time:  5.486 s
[INFO] Finished at: 2026-11-25T22:07:27+02:00
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

2026-11-25 22:07:36.745  INFO 25772 --- [lication.main()] com.ferry.FerryApplication               : Starting FerryApplication using Java 23.0.2 on PAVILION_HP with PID 25772 (C:\Users\ironm\OneDrive\╨Ф╨╛╨║╤Г╨╝╨╡╨╜╤В╤Л\GitHub\ferry\target\classes started by ironm in C:\Users\ironm\OneDrive\╨Ф╨╛╨║╤Г╨╝╨╡╨╜╤В╤Л\GitHub\ferry)
2026-11-25 22:07:36.749  INFO 25772 --- [lication.main()] com.ferry.FerryApplication               : No active profile set, falling back to default profiles: default
2026-11-25 22:07:37.331  INFO 25772 --- [lication.main()] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2026-11-25 22:07:37.415  INFO 25772 --- [lication.main()] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 76 ms. Found 1 MongoDB repository interfaces.
2026-11-25 22:07:38.078  INFO 25772 --- [lication.main()] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[127.0.0.1:27017], srvHost=cluster0.n7ca33c.mongodb.net, mode=MULTIPLE, requiredClusterType=REPLICA_SET, serverSelectionTimeout='30000 ms', requiredReplicaSetName='atlas-vbe5s3-shard-0'}
2026-11-25 22:07:38.112  INFO 25772 --- [33c.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017 to client view of cluster
2026-11-25 22:07:38.176  INFO 25772 --- [33c.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017 to client view of cluster
2026-11-25 22:07:38.178  INFO 25772 --- [33c.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017 to client view of cluster
2026-11-25 22:07:38.825  INFO 25772 --- [lication.main()] com.ferry.FerryApplication               : Started FerryApplication in 2.9 seconds (JVM running for 7.917)
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вих?д
Введ?ть номер команди (1-4): 2026-11-25 22:07:39.099  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:130168}] to ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017
2026-11-25 22:07:39.099  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:5, serverValue:131166}] to ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017
2026-11-25 22:07:39.099  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:131087}] to ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
2026-11-25 22:07:39.099  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:6, serverValue:131021}] to ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
2026-11-25 22:07:39.099  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:4, serverValue:130167}] to ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017
2026-11-25 22:07:39.099  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:131162}] to ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017
2026-11-25 22:07:39.111  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=594797900, setName='atlas-vbe5s3-shard-0', canonicalAddress=ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017, hosts=[ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017], passives=[], arbiters=[], primary='ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017', tagSet=TagSet{[Tag{name='availabilityZone', value='eun1-az1'}, Tag{name='cacheState', value='READY'}, Tag{name='diskState', value='READY'}, Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='EU_NORTH_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=null, setVersion=162, topologyVersion=TopologyVersion{processId=6b0469a7490fc39f7f08d4bd, counter=4}, lastWriteDate=Wed Nov 25 22:07:46 EET 2026, lastUpdateTimeNanos=50968995898200}
2026-11-25 22:07:39.111  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, type=REPLICA_SET_PRIMARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=594813000, setName='atlas-vbe5s3-shard-0', canonicalAddress=ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, hosts=[ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017], passives=[], arbiters=[], primary='ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017', tagSet=TagSet{[Tag{name='availabilityZone', value='eun1-az2'}, Tag{name='cacheState', value='READY'}, Tag{name='diskState', value='READY'}, Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='EU_NORTH_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=7fffffff0000000000000143, setVersion=162, topologyVersion=TopologyVersion{processId=6b0469e333a0e3ce90e81f50, counter=6}, lastWriteDate=Wed Nov 25 22:07:46 EET 2026, lastUpdateTimeNanos=50968995898200}
2026-11-25 22:07:39.111  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=594714000, setName='atlas-vbe5s3-shard-0', canonicalAddress=ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, hosts=[ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017], passives=[], arbiters=[], primary='ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017', tagSet=TagSet{[Tag{name='availabilityZone', value='eun1-az3'}, Tag{name='cacheState', value='READY'}, Tag{name='diskState', value='READY'}, Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='EU_NORTH_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=null, setVersion=162, topologyVersion=TopologyVersion{processId=6b046a22cc7211e330631d83, counter=3}, lastWriteDate=Wed Nov 25 22:07:46 EET 2026, lastUpdateTimeNanos=50968995898100}
2026-11-25 22:07:39.114  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Setting max election id to 7fffffff0000000000000143 from replica set primary ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
2026-11-25 22:07:39.114  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Setting max set version to 162 from replica set primary ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
2026-11-25 22:07:39.115  INFO 25772 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Discovered replica set primary ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
1
2026-11-25 22:08:50.665  INFO 25772 --- [lication.main()] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:7, serverValue:131068}] to ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
12 документ?в з рейсами порома завантажено з CSV.
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вих?д
Введ?ть номер команди (1-4): 2
Знайдено 12 документ?в рейс?в порома:
FerryFlight { id="6b074052d8799c668393d100"
 flightNumber="2201"
 flightDate="2026-09-02"
 ferry="Дн?про"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 25 / 80"
 childPassenger="особа / 8 / 40"
 bicycle=""
 passengerCar="одиниця / 6 / 40"
}
FerryFlight { id="6b074052d8799c668393d101"
 flightNumber="2202"
 flightDate="2026-09-03"
 ferry="Обр?й"
 passengerSeats="80"
 parkingSpaces="8"
 adultPassenger=""
 childPassenger="особа / 6 / 40"
 bicycle="одиниця / 3 / 50"
 passengerCar=""
}
FerryFlight { id="6b074052d8799c668393d102"
 flightNumber="2203"
 flightDate="2026-09-04"
 ferry="Дн?про"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 30 / 85"
 childPassenger="особа / 3 / 50"
 bicycle=""
 passengerCar="одиниця / 4 / 250"
}
FerryFlight { id="6b074052d8799c668393d103"
 flightNumber="2204"
 flightDate="2026-09-05"
 ferry="Обр?й"
 passengerSeats="80"
 parkingSpaces="8"
 adultPassenger=""
 childPassenger=""
 bicycle="одиниця / 5 / 50"
 passengerCar="одиниця / 6 / 250"
}
FerryFlight { id="6b074052d8799c668393d104"
 flightNumber="2205"
 flightDate="2026-09-06"
 ferry="Дн?про"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 20 / 85"
 childPassenger="особа / 30 / 85"
 bicycle="одиниця / 3 / 55"
 passengerCar=""
}
FerryFlight { id="6b074052d8799c668393d105"
 flightNumber="2206"
 flightDate="2026-09-16"
 ferry="Дн?про"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 25 / 80"
 childPassenger="особа / 8 / 40"
 bicycle=""
 passengerCar="одиниця / 6 / 40"
}
FerryFlight { id="6b074052d8799c668393d106"
 flightNumber="2207"
 flightDate="2026-09-26"
 ferry="Обр?й"
 passengerSeats="80"
 parkingSpaces="8"
 adultPassenger=""
 childPassenger="особа / 6 / 40"
 bicycle="одиниця / 3 / 50"
 passengerCar=""
}
FerryFlight { id="6b074052d8799c668393d107"
 flightNumber="2208"
 flightDate="2026-10-06"
 ferry="Дн?про"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 30 / 85"
 childPassenger="особа / 3 / 50"
 bicycle=""
 passengerCar="одиниця / 4 / 250"
}
FerryFlight { id="6b074052d8799c668393d108"
 flightNumber="2209"
 flightDate="2026-10-16"
 ferry="Обр?й"
 passengerSeats="80"
 parkingSpaces="8"
 adultPassenger=""
 childPassenger=""
 bicycle="одиниця / 5 / 50"
 passengerCar="одиниця / 6 / 250"
}
FerryFlight { id="6b074052d8799c668393d109"
 flightNumber="2210"
 flightDate="2026-10-26"
 ferry="Дн?про"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 20 / 85"
 childPassenger="особа / 30 / 85"
 bicycle="одиниця / 3 / 55"
 passengerCar=""
}
FerryFlight { id="6b074052d8799c668393d10a"
 flightNumber="2211"
 flightDate="2026-11-05"
 ferry="Дн?про"
 passengerSeats="100"
 parkingSpaces="12"
 adultPassenger="особа / 25 / 80"
 childPassenger="особа / 8 / 40"
 bicycle=""
 passengerCar="одиниця / 6 / 40"
}
FerryFlight { id="6b074052d8799c668393d10b"
 flightNumber="2212"
 flightDate="2026-11-15"
 ferry="Обр?й"
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
4. Вих?д
Введ?ть номер команди (1-4): 3
Ус? рейси порома видалено.
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вих?д
Введ?ть номер команди (1-4): 1
12 документ?в з рейсами порома завантажено з CSV.
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вих?д
Введ?ть номер команди (1-4): 4
2026-11-25 22:09:21.835  INFO 25772 --- [ionShutdownHook] org.mongodb.driver.connection            : Closed connection [connectionId{localValue:7, serverValue:131068}] to ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017 because the pool has been closed.
'''