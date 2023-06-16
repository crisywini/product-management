[![Java CI with Maven](https://github.com/crisywini/product-management  /actions/workflows/maven.yml/badge.svg?branch=develop&event=push)](https://github.com/crisywini/piggy-bank/actions/workflows/maven.yml)

# Product Management 

This project allows to manage common and technical products


# Current Functionalities:
- Saves a common product
- Saves a technical product


## Usage 

Installed Maven and Java 17.

Download the repo and run the next command in the root folder:

    mvn spring-boot:run 

## Using docker

Go to the root folder and build the image: 

    docker image build -t product-management .

Then run the image as you want:

    docker container run  -p 8080:8080 product-management


Then you can use the localhost:8080/ the exposed services at this moment are:

| Service | Method | Description |
|--|--|--|
| */products/common* | POST | Saves a Common Product |
| */products/technical* | POST | Saves a Technical Product |


### Based on: https://code-specialist.com/architecture/rest-api-clean-architecture



