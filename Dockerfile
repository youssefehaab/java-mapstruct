FROM openjdk:11-jre-slim
EXPOSE 5555
ADD ./target/java-mapstruct-1.0.0-SNAPSHOT.jar java-mapstruct-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "java-mapstruct-1.0.0-SNAPSHOT.jar"]