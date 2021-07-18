## SO-Project


links de referencias:
https://matheuspcarvalhoblog.wordpress.com/2017/04/01/anotacao-customizada-bean-validation/

## Compile:

Maven:
```
./mvnw clean install
```

## Run:

Maven:
```
./mvnw clean install spring-boot:run -Dspring-boot.run.profiles=local
```

Java:
```
java -jar -Dspring.profiles.active=local target/so-project-0.0.1-SNAPSHOT.jar
```