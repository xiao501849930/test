FROM java:7
VOLUME /tmp
ADD target/educloud-eureka.jar /educloud-eureka.jar
RUN bash -c 'touch /educloud-eureka.jar'
ENTRYPOINT ["java","-jar","/app.jar"]