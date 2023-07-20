FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
ADD target/backend-example-0.0.1-SNAPSHOT.jar backend-example-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backend-example-0.0.1-SNAPSHOT.jar"]
