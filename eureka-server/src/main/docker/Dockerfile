FROM openjdk:8-jdk-alpine
VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
ADD eureka-server.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8761