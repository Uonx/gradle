FROM 20.10.101.94/tenx_containers/java:8
ADD testMicro_microService/build/libs/testMicro_microService-1.0.jar /
CMD ["java","-jar","testMicro_microService-1.0.jar"]
