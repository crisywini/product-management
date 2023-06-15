FROM openjdk:17
LABEL \
    maintainer = "Cristian Giovanny Sánchez Pineda harmaharcri@hotmail.com" \
    org.label-schema.name = "Product Management" \
    org.label-schema.description = "This service manage common and technical products"

EXPOSE 8080
WORKDIR /usr/local/bin/
COPY ./adapter/target/adapter-0.0.1-SNAPSHOT.jar product_management.jar
CMD ["java", "-jar", "product_management.jar"]