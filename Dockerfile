FROM eclipse-temurin:17-jdk-jammy
MAINTAINER creditapi.com
COPY build/libs/gamma-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","-Dspring.datasource.url=jdbc:postgresql://postgres/gamma?user=gamma&password=gamma",/app.jar"]
