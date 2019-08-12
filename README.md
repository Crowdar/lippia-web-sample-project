#Example test web project with Lippia 1.6 ([lippia.io])

This project includes the following architecture

![Lippia Architecture Web](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/architecture_web_lippia.png)


##Scenarios :

The Scenarios can be written using BDD metodology. This project includes Cucumber as BDD. On each declared step you can insert the calls defined from service classes

![Lippia gherkin Web](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/gherkin.png)


## Report :

In order to see test results this project includes extent report that show you the result of each run. This kind of reporting is really easy to understand. 
You just need to open it and navigate for all the report page to earn the much information as you can for every run.

![Lippi Extent Report](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/reporteExtent.png)


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

