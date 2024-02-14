FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} BasicAuthenticationApplication.jar
ENTRYPOINT ["java","-jar","/BasicAuthenticationApplication.jar"]

