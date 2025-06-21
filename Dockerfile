FROM openjdk:17
WORKDIR /app
COPY target/microserviceclient-0.0.1-SNAPSHOT.jar client.jar
EXPOSE 8082
ENTRYPOINT [ "java","-jar","client.jar" ]