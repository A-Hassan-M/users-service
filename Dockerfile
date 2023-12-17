FROM maven:3.8.2-jdk-17
WORKDIR /webappdemo
COPY ./.mvn .mvn
COPY ./pom.xml ./
ENV MYSQL_HOST mysql
ENV MYSQL_PORT 3306
ENV MYSQL_DB usersdb
#RUN mvn clean install
RUN ["/usr/local/bin/mvn-entrypoint.sh", "mvn", "verify", "clean", "--fail-never"]
COPY . .
CMD mvn spring-boot:run