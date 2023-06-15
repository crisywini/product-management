FROM openjdk:17
MAINTAINER Cristian Giovanny Sánchez Pienda "harmaharcri@hotmail.com"
EXPOSE 8080
WORKDIR /usr/local/bin/
COPY ./adapter/target/adapter-0.0.1-SNAPSHOT.jar product_management.jar
CMD ["java", "-jar", "product_management.jar"]