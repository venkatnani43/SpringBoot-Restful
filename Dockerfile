FROM eclipse-temurin:17
EXPOSE 8081
ADD target/*.jar springbooot-restful.jar 
ENTRYPOINT ["java","-jar","/springbooot-restful.jar"]

