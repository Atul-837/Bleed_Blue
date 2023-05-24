FROM openjdk:19
FROM maven:3-amazoncorretto-19
WORKDIR /app
COPY . /app
RUN mvn clean install
#ADD ./target/bleed_blue.jar  /app/bleed_blue.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "./target/bleed_blue.jar"]
