FROM eclipse-temurin:17-jdk-jammy
MAINTAINER creditapi.com
COPY build/libs/gamma-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
