FROM eclipse-temurin:17-jdk-alpine

WORKDIR /studentApp

COPY target/*.jar studentApp.jar

ENTRYPOINT ["java","-jar","/studentApp/studentApp.jar"]
