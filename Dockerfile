FROM adoptopenjdk/openjdk8:ubi
COPY /target/SPEAssignment-1.0-SNAPSHOT.jar SPEAssignment-1.0-SNAPSHOT.jar
CMD ["java","-cp","/SPEAssignment-1.0-SNAPSHOT.jar","App"]
