FROM openjdk:8
COPY ./target/classes/guru/springframework/basicauth/BasicAuthenticationApplication/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","BasicAuthenticationApplication"]