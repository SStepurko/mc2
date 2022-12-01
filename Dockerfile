# define base docker image
FROM openjdk:17
# copy files
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} mc2.jar
# how to run
ENTRYPOINT ["java","-jar","/mc2.jar"]
# port for application
# EXPOSE 10002