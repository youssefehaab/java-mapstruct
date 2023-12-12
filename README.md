# Java-Mapstruct
### Steps to run compose file
***
**1 - Build Jar and created generated sources**

- Run ```mvn clean install```

Generated sources will be in ```target/generated-sources/annotations/com/chesterford/mapstruct/mapper```
- ```StudentMapperImpl```
- ```TeacherMapperImpl```

Jar file will be generated in a generated directory ```target```
***
**2 - Build Image**
- Run ```docker build -t java-mapstruct .```

Image will be created with name ```java-mapstruct```
***
**3 - Run compose file**
- Run ```docker-compose up -d```