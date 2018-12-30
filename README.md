# SCrypt Encoder for Spring
This library implements an SCrypt encoder for password hashing in the Spring
security framework. A more detailed description of the Spring security framework can be found [here](https://docs.spring.io/spring-security/site/docs/4.0.3.RELEASE/reference/htmlsingle/).

## Building the Library
This project is built using [Maven](https://maven.apache.org). 

The project also jitpack.io to get the SCrypt library that it leverages for password hashing.

### Compiling
To compile the code run `mvn compile` from the project root.

### Testing
To execute the unit test for the project run `mvn test` from the project root.

### Packaging for Installation
To generate a jar file for installation run `mvn clean package`. This will create a JAR file in the target directory.