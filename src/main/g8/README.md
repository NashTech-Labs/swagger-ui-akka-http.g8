## Swagger UI with Akka HTTP ##

* This repository contains a sample code base for generating swagger ui with akka http.
* You can read more about Swagger UI from [here](https://swagger.io/) and Akka HTTP from [here](https://doc.akka.io/docs/akka-http/current/). 

## How do I get set up? ##

### Clone the application ###

* sbt new knoldus/swagger-ui-akka-http.g8
  
* cd swagger-ui-akka-http/

### To Compile the application ###

* sbt clean compile

### To Run the application ###

* sbt run
* Hit the URI: localhost:8080/swagger-ui/index.html



