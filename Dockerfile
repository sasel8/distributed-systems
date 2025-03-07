FROM openjdk:21

WORKDIR /app

COPY app/target/app-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]
