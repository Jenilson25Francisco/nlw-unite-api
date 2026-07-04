FROM ubuntu:latest AS build
LABEL authors="Jenlson Francisco"

RUN apt-get update
RUN apt-get install openjdk-26-jdk -y
COPY . .
RUN apt-get install maven -y
RUN apt-get mvn clean install

FROM eclipse-temurin:26-jdk
EXPOSE 8080

COPY --from=build /target/nlw-unites-api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]