## Результати виконання програми
```
PS C:\Users\ironm\OneDrive\Документы\GitHub\ferry> mvn exec:java -D"exec.mainClass=com.ferry.FerryApplication"
[INFO] Scanning for projects...
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml (10 kB at 8.2 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml (20 kB at 16 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/exec-maven-plugin/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/exec-maven-plugin/maven-metadata.xml (1.2 kB at 20 kB/s)
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

2026-11-26 09:31:47.553  INFO 14552 --- [lication.main()] com.ferry.FerryApplication               : Starting FerryApplication using Java 23.0.2 on PAVILION_HP with PID 14552 (C:\Users\ironm\OneDrive\Документы\GitHub\ferry\target\classes started by ironm in C:\Users\ironm\OneDrive\Документы\GitHub\ferry)
2026-11-26 09:31:47.561  INFO 14552 --- [lication.main()] com.ferry.FerryApplication               : No active profile set, falling back to default profiles: default
2026-11-26 09:31:48.578  INFO 14552 --- [lication.main()] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2026-11-26 09:31:48.700  INFO 14552 --- [lication.main()] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 109 ms. Found 1 MongoDB repository interfaces.
2026-11-26 09:31:49.636  INFO 14552 --- [lication.main()] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[127.0.0.1:27017], srvHost=cluster0.n7ca33c.mongodb.net, mode=MULTIPLE, requiredClusterType=REPLICA_SET, serverSelectionTimeout='30000 ms', requiredReplicaSetName='atlas-vbe5s3-shard-0'}
2026-11-26 09:31:49.688  INFO 14552 --- [33c.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017 to client view of cluster
2026-11-26 09:31:49.757  INFO 14552 --- [33c.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017 to client view of cluster
2026-11-26 09:31:49.759  INFO 14552 --- [33c.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017 to client view of cluster
2026-11-26 09:31:50.254  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:5, serverValue:158687}] to ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017
2026-11-26 09:31:50.254  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:159930}] to ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017
2026-11-26 09:31:50.255  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:159382}] to ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
2026-11-26 09:31:50.254  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:159678}] to ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
2026-11-26 09:31:50.256  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, type=REPLICA_SET_PRIMARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=351298700, setName='atlas-vbe5s3-shard-0', canonicalAddress=ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, hosts=[ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017], passives=[], arbiters=[], primary='ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017', tagSet=TagSet{[Tag{name='availabilityZone', value='eun1-az2'}, Tag{name='cacheState', value='READY'}, Tag{name='diskState', value='READY'}, Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='EU_NORTH_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=7fffffff0000000000000143, setVersion=162, topologyVersion=TopologyVersion{processId=6b0469e333a0e3ce90e81f50, counter=6}, lastWriteDate=Thu Nov 26 09:31:59 EET 2026, lastUpdateTimeNanos=92021360255300}
2026-11-26 09:31:50.254  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:4, serverValue:159928}] to ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017
2026-11-26 09:31:50.254  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:6, serverValue:158687}] to ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017
2026-11-26 09:31:50.255  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=351319400, setName='atlas-vbe5s3-shard-0', canonicalAddress=ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017, hosts=[ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017], passives=[], arbiters=[], primary='ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017', tagSet=TagSet{[Tag{name='availabilityZone', value='eun1-az1'}, Tag{name='cacheState', value='READY'}, Tag{name='diskState', value='READY'}, Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='EU_NORTH_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=null, setVersion=162, topologyVersion=TopologyVersion{processId=6b0469a7490fc39f7f08d4bd, counter=4}, lastWriteDate=Thu Nov 26 09:31:59 EET 2026, lastUpdateTimeNanos=92021360255300}
2026-11-26 09:31:50.258  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=349366200, setName='atlas-vbe5s3-shard-0', canonicalAddress=ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, hosts=[ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-02.n7ca33c.mongodb.net:27017, ac-2xqtbag-shard-00-00.n7ca33c.mongodb.net:27017], passives=[], arbiters=[], primary='ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017', tagSet=TagSet{[Tag{name='availabilityZone', value='eun1-az3'}, Tag{name='cacheState', value='READY'}, Tag{name='diskState', value='READY'}, Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='EU_NORTH_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=null, setVersion=162, topologyVersion=TopologyVersion{processId=6b046a22cc7211e330631d83, counter=3}, lastWriteDate=Thu Nov 26 09:31:59 EET 2026, lastUpdateTimeNanos=92021360255400}
2026-11-26 09:31:50.261  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Setting max election id to 7fffffff0000000000000143 from replica set primary ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
2026-11-26 09:31:50.264  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Setting max set version to 162 from replica set primary ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
2026-11-26 09:31:50.266  INFO 14552 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Discovered replica set primary ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
2026-11-26 09:31:50.615  INFO 14552 --- [lication.main()] com.ferry.FerryApplication               : Started FerryApplication in 4.159 seconds (JVM running for 25.306)
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вихід
Введіть номер команди (1-4): 1
2026-11-26 09:32:06.704  INFO 14552 --- [lication.main()] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:7, serverValue:159771}] to ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017
12 документів з рейсами порома завантажено з CSV.
1. Додати рейси порома з CSV-файлу
2. Подивитись рейси порома
3. Видалити рейси порома
4. Вихід
Введіть номер команди (1-4): 2
Знайдено 24 документів рейсів порома:
FerryFlight { id="6b07406fd8799c668393d10c"
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
FerryFlight { id="6b07406fd8799c668393d10d"
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
FerryFlight { id="6b07406fd8799c668393d10e"
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
FerryFlight { id="6b07406fd8799c668393d10f"
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
FerryFlight { id="6b07406fd8799c668393d110"
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
FerryFlight { id="6b07406fd8799c668393d111"
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
FerryFlight { id="6b07406fd8799c668393d112"
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
FerryFlight { id="6b07406fd8799c668393d113"
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
FerryFlight { id="6b07406fd8799c668393d114"
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
FerryFlight { id="6b07406fd8799c668393d115"
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
FerryFlight { id="6b07406fd8799c668393d116"
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
FerryFlight { id="6b07406fd8799c668393d117"
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
FerryFlight { id="6b07e076d855fd2951f76c34"
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
FerryFlight { id="6b07e076d855fd2951f76c35"
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
FerryFlight { id="6b07e076d855fd2951f76c36"
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
FerryFlight { id="6b07e076d855fd2951f76c37"
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
FerryFlight { id="6b07e076d855fd2951f76c38"
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
FerryFlight { id="6b07e076d855fd2951f76c39"
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
FerryFlight { id="6b07e076d855fd2951f76c3a"
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
FerryFlight { id="6b07e076d855fd2951f76c3b"
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
FerryFlight { id="6b07e076d855fd2951f76c3c"
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
FerryFlight { id="6b07e076d855fd2951f76c3d"
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
FerryFlight { id="6b07e076d855fd2951f76c3e"
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
FerryFlight { id="6b07e076d855fd2951f76c3f"
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
2026-11-26 09:32:17.571  INFO 14552 --- [ionShutdownHook] org.mongodb.driver.connection            : Closed connection [connectionId{localValue:7, serverValue:159771}] to ac-2xqtbag-shard-00-01.n7ca33c.mongodb.net:27017 because the pool has been closed.
'''