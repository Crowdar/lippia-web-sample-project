#Example test web project with Lippia 1.6 ([lippia.io])


##Requirements :
- git client   
     https://www.atlassian.com/git/tutorials/install-git
	 
- JDK 8 	    
	  https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html   
	  https://openjdk.java.net/install/   
	 
+ maven 3   
	 https://maven.apache.org/download.cgi   
#Linux
## Running selenium grid container 
- linux
- docker 18.09    
     https://docs.docker.com/install/linux/docker-ce/ubuntu/
- docker compose 1.24   
     https://docs.docker.com/compose/install/
- go to root folder project you will find a docker-compose.yml file 
- run command : sudo docker-compose up --scale chrome=10 -d

## Executing tests
- go to root project folder and you will find a pom.xml file
- run commant : mvn clean -P GridParallel test



#Window
from command lines as administrator execute:

1- go to root project directory

2- vagrant up --provision (wait to virtualbox instance start, this operation will be take several minutes) 

3- mvn clean -P GridParallel test    (execution of tests against selenium grid instance of the sandbox)

4- vagrant halt (to stop and close vagrant service)

