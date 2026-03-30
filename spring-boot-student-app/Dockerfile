FROM eclipse-temurin:17-jdk-alpine

WORKDIR /studentApp

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","/studentApp/app.jar"]
