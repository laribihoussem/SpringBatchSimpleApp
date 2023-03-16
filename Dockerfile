FROM eclipse-temurin:11
ADD target/testSncfProject-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
EXPOSE 8070