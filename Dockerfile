FROM openjdk:8
ADD target/sc-docker-poc.jar sc-docker-poc.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","sc-docker-poc.jar"]