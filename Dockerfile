FROM java:8

ADD target/*.jar yutt.jar

VOLUME /tmp

EXPOSE 80

ENTRYPOINT ["java","-jar","yutt.jar"]