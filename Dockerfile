FROM openjdk:8
COPY ./target/msestudiante.jar /
CMD ["java", "-jar", "msestudiante.jar"]
EXPOSE 5011
