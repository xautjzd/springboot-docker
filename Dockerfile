FROM hub.c.163.com/gingko/tomcat:8.5.24-8u151-jdk
MAINTAINER "xautjzd@gmail.com"
RUN rm -rf /usr/local/tomcat/webapps/ROOT
ADD target/springboot-docker-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]
