FROM openjdk:17

LABEL authors="mounikapathipati"

COPY target/crudoperations-0.0.1-SNAPSHOT.jar /usr/app/crudoperations-0.0.1-SNAPSHOT.jar

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar","crud_operations.jar"]