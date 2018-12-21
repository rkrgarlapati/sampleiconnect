FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/iConnect-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
