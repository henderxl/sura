# sura

TECNOLOGIAS USADAS

•	SpringBoot 2.5.6
•	Maven
•	Java 11
•	Rest API

Dependencias SpringBoot

•	MySQL Driver
•	Spring Data JPA

SOFTWARE USADO

•	Java Development kit (JDK) 
•	Spring Tool Suite IDE (STS)
•	MySQL Database Server & MySQL Workbench
•	Git


Si se va a ejecutar el proyecto en local simplemente toca eliminar los archivos app.yaml y el .gcloudignore además de que en el archivo pom.xml toca modificar el <packaging>jar</packaging> por <packaging>war</packaging>
Tenga en cuenta que requiere MySQL workbench con una tabla llamada sura para poder iniciar el proyecto y posteriormente modificar las entradas para poder crear la BD

Se reemplaza 104.197.176.70:3306 por localhost:3306 en el archivo application.properties y donde va /sura se pone el nombre de la base de datos que se cree, se recomienda llamarla sura y no importa si no tiene tablas
git clone https://github.com/henderxl/sura.git
cd sura
mvn validate
mvn verify
mvn clean install

Una vez realizado este proceso se abre un cmd en la ruta del repo y se ejecuta el siguiente comando:
mvnw.cmd spring-boot:run
Una vez iniciado el proyecto se puede dirigir a la ruta
localhost:8080/usuario
localhost:8080/usuario/query?asume=SURA
localhost:8080/usuario/query?asume=EMPLEADO



DESDE NUBE (Se requiere instalar SDK DE GOOGLE CLOUD)

https://springgcp-332305.nn.r.appspot.com/usuario
En este enlace se podrá visualizar lo que trae la base de datos actualmente
https://springgcp-332305.nn.r.appspot.com/usuario/query?asume=EMPLEADO
En este enlace se podrán visualizar todos los usuarios que asumen el gasto ya que es inferior a 1.000.000 al mes
https://springgcp-332305.nn.r.appspot.com/usuario/query?asume=SURA
En este enlace se podrán visualizar todos los usuarios a los que SURA les asume el gasto puesto que supera el 1.000.000 al mes

Ejecutar en cmd ruta de sura:
gcloud app deploy
Esto actualizará la BD de la nube de google cloud
