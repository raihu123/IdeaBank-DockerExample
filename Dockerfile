FROM openjdk:19

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY /src/main/resources/application.properties application.properties
#Uncomment if you want to configure DB connection from container level
# ENV SPRING_APPLICATION_JSON= {
#         spring.datasource.url  : jdbc:mysql://idea-db:3306/idea,
#         spring.datasource.username : root,
#         spring.datasource.password : root,
#         spring.jpa.properties.hibernate.dialect : org.hibernate.dialect.MySQLDialect
#       }

ENTRYPOINT ["java","-jar","/app.jar"]