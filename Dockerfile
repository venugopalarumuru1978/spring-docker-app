FROM openjdk:8
ADD target/spring-docker-app-0.0.1-SNAPSHOT.jar demoapp.jar
ENTRYPOINT ["java", "-jar", "demoapp.jar"]
