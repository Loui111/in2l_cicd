FROM amazoncorretto:17-alpine3.17-jdk
ADD ./*.jar in2l-0.0.1.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "in2l-0.0.1.jar"]
