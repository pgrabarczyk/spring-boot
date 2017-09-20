# spring-boot-actuator
Spring boot application with actuator and custom endpoint called host.


## Build and execution

```
mvn clean package spring-boot:repackage
```

```
java -jar target/spring-boot-actuator-0.1.jar
```



## Check custom endpoint /host
Enter in your browser

http://localhost:8080/host

or

```
curl http://localhost:8080/host
```

then you should get result of your host (using system network interfaces) eg:

```
fe80:0:0:0:a00:27ff:fe87:9bff%eth0
10.10.42.185
0:0:0:0:0:0:0:1%lo
127.0.0.1
```