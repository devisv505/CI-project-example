FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE
COPY /target/demo-0.0.1-SNAPSHOT.jar /
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./demo-0.0.1-SNAPSHOT.jar"]
