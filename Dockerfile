FROM amazoncorretto:17-alpine3.17-jdk
COPY ./build/libs/in2l-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["java", "-jar", "in2l-0.0.1-SNAPSHOT.jar"]

# FROM amazoncorretto:17-alpine3.17-jdk
# ADD in2l-0.0.1-SNAPSHOT.jar in2l-0.0.1.jar
# ENV JAVA_OPTS=""
# ENTRYPOINT ["java", "-jar", "in2l-0.0.1.jar"]
#
# FROM openjdk:17-alpine
# COPY ./build/libs/in2l-0.0.1-SNAPSHOT.jar ./
# ENTRYPOINT ["java","-jar","/ncrtest-0.0.1-SNAPSHOT.jar"]