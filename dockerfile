FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/sample-maven-app-1.0.0.jar app.jar

COPY index.html /app/index.html

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
