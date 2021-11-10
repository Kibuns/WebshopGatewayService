FROM maven:3-jdk-11-slim
EXPOSE 9191
WORKDIR /app
COPY src /app/src
COPY pom.xml /app
RUN mvn clean package
ENTRYPOINT ["java", "-jar", "/app/target/WebshopGateway-0.0.1-SNAPSHOT.jar"]