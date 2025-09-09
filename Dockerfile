FROM openjdk:17

LABEL authors="mounikapathipati"

COPY target/crud_operations.jar /usr/app/crud_operations.jar

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar","crud_operations.jar"]