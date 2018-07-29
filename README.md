# springboot-quickstart
eclipse-maven spring boot quick start project 




## # to run as stand alone app

delare packaging as jar in pom.xml
	<packaging>jar</packaging>
open cmd
go to home directory run 'mvn clean install'
go to target folder and run 'java -jar springboot-quickstart-0.0.1-SNAPSHOT.jar'



## # to run in servlet container 

delare packaging as war in pom.xml
	<packaging>war</packaging>
open cmd
go to home directory run 'mvn clean install'
go to target folder and run 'java -jar springboot-quickstart-0.0.1-SNAPSHOT.jar'
