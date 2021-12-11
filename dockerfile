FROM java:8

ADD target/*.jar yutt.jar

VOLUME /tmp

EXPOSE 8080

ENTRYPOINT ["java","-jar",“yutt.jar”,"--spring.profiles.active=test","--server.port=8080"]
