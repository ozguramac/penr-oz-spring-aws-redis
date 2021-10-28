# Spring AWS Redis integration example

### Reference Documentation
For further reference, please consider the following sections:

* [Gradle documentation](https://docs.gradle.org)
* [Docker Compose Overview](https://docs.docker.com/compose/overview/) 
* [Spring Boot Overview](https://spring.io/projects/spring-boot)
* [AWS SDK Overview](https://aws.amazon.com/sdk-for-java/)
* [Redis Overview](https://redis.io/)

### Build
```
$ ./gradlew build
```

### Run
```
$ docker-compose up penr-oz-spring-aws-redis
```

### Use
[try](http://localhost:8080/swagger-ui/)

### Debug
[docker-compose.override.yml](https://docs.docker.com/compose/extends/)
```
version: '3'
services:
  penr-oz-spring-aws-redis:
    entrypoint: java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005
    ports:
      - "8080:8080"
      - "5005:5005"
```
then
```
$ docker-compose up penr-oz-spring-aws-redis
```
finally use your favorite IDE to put breakpoints and connect to debugger
e.g.
[Intellij Remote Java](https://www.jetbrains.com/help/idea/run-debug-configuration-remote-debug.html)
which requires a correct local [JDK](https://jdk.java.net/8/)
installed.

### Stop
```
$ docker-compose stop
```

### Clean
```
$ docker-compose down
```

### Check/Health
```
docker-compose ps
```
