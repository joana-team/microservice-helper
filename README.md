# microservice-helper
Small helper repo for microservice analyses based on jaxrs-cfx.
References all packages needed to setup a server (and the Joana 
annotations package).

Idea
----
Encapsulate the microservice server stuff with a well-defined interface:
We can than make assumptions on the server initialisation in the 
component based analysis :)

Usage
-----
Use it via maven

```xml
<dependency>
  <groupId>io.github.joana-team</groupId>
  <artifactId>microservice-helper</artifactId>
  <version>1.0.3</version>
</dependency>
```

For a minimal example of how this could be used to create a microservice with OpenAPI, 
look no further than the
[cat shop example](https://github.com/joana-team/joana/tree/openapi/ifc/sdg/schemas/catshop/shop).



How to publish a maven package
------------------------------
```sh
mvn clean   # Delete build contents                
mvn compile # Compile classes
mvn package # Build JAR
mvn verify  # Will sign/check GPG
mvn install # Install to local maven repo
mvn deploy  # Push to Sonatype->maven central
``
