FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} BasicAuthenticationApplication.jar
ENTRYPOINT ["java","-jar","/BasicAuthenticationApplication.jar"]




#FROM openjdk:8
##COPY ./target/classes/guru/springframework/basicauth/BasicAuthenticationApplication/ /tmp
#CMD ls -la /home/runner/work/basicauthentication/basicauthentication/target/*
##COPY /home/runner/work/basicauthentication/basicauthentication/target/classes/guru/springframework/basicauth/BasicAuthenticationApplication/ /tmp
##WORKDIR /tmp
##ENTRYPOINT ["java","BasicAuthenticationApplication"]
#
##Remove this file for a test