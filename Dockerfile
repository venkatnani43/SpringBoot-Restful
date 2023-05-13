FROM eclipse-temurin:17
EXPOSE 8081
ADD target/springboot-restful.jar springboot-restful.jar 
ENTRYPOINT ["java","-jar","/springboot-restful.jar"]

