FROM openjdk:11.0.7-jdk-slim

ADD build/libs/alice-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]