FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","/app.jar"]
