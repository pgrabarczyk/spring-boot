# spring-boot-starter
Spring boot applications presents use of spring boot starter project.

### Run
First build spring-boot-starter-custom project
```
mvn clean install
```
Then maven should copy build into your local repo.

Then you can run spring-boot-starter-client which uses spring-boot-starter-custom by:
```
 mvn spring-boot:run
 ```
 
 Then you should be able to watch logs:
 ```
 MY SPECIAL PATTERN 2017-07-20 15:10:56.452 [INFO ] [main                  ] c.p.s.b.s.c.SpringBootStarterClientApplication.main:13 -  <<<<<<< Logs using lombok works ! >>>>>>> 
 ```
 
 As you can see it's not default spring boot logback pattern.
 It's defined in:
 ```
 /spring-boot-starter-custom/src/main/resources/logback.xml
 ```
 
 Also dependency org.projectlombok:lombok are used by client, but it's defined by starter-custom.
 Usage of lombok are shown in
 ```
 /spring-boot-starter-client/src/main/java/com/pgrabarczyk/spring/boot/starter/client/SpringBootStarterClientApplication.java
 ```
