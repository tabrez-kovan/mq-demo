FROM maven:3.8.4-openjdk-17-slim
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests
EXPOSE 8081
CMD ["java", "-jar", "target/MessageConsumer-latest.jar"]