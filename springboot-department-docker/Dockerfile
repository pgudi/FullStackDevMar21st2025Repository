FROM eclipse-temurin
WORKDIR /application
ENV PORT=9091
EXPOSE 9091
COPY target/*.jar /application/app.jar
ENTRYPOINT ["java","-jar","/application/app.jar"]