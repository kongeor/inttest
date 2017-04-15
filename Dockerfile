FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/inttest.jar /inttest/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/inttest/app.jar"]
