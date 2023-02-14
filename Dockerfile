FROM happysea/alpinejre8:latest

ADD eureka-service-0.0.1-SNAPSHOT.jar /opt/app.jar
#RUN sh -c 'touch /app.jar'
WORKDIR  /opt
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /opt/app.jar" ]

