#Lippia Web sample project ([lippia.io])

##System Requirements :
- git client: https://www.atlassian.com/git/tutorials/install-git
- JDK 8: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html   
	  https://openjdk.java.net/install/   
+ maven 3.X: https://maven.apache.org/download.cgi   
+ docker 18.09: https://docs.docker.com/install/linux/docker-ce/ubuntu/
+ docker compose 1.24: https://docs.docker.com/compose/install/


##Purpose
This project has the intention of show in a practical way how to use Lippia Automation Framework to build automated tests using Gherkin and Page-Object pattern. This sample project includes the required components as binaries, docker containers and configuration files to simply download and run a set of sample tests in your local computer, using the Lippia container stack described bellow.

##Project structure

A typical Lippia Test Automation project usually looks like this 





###Containers
The following project includes the following Lippia architecture components

![Lippia Architecture Web](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/architecture_web_lippia.png =200x)

The docker containers are included in the **docker-compose.yml** as you can see:

```yml
	version: "3.3"

	services:
	  selenium-hub:
	    image: selenium/hub:3.141.59-palladium
	    container_name: selenium-hub
	    environment:
	      - GRID_MAX_SESSION=20
	      - GRID_DEBUG=true
	      - GRID_BROWSER_TIMEOUT=3000
	      - GRID_TIMEOUT=3000
	    ports:
	      - "4444:4444"
	  chrome:
	    image: selenium/node-chrome:3.141.59-palladium
	    volumes:
	      - /dev/shm:/dev/shm
	    depends_on:
	      - selenium-hub
	    environment:
	      - HUB_HOST=selenium-hub
	      - HUB_PORT=4444
	      - NODE_MAX_INSTANCES=1
	      - NODE_MAX_SESSION=1

	  jenkins:
	    image: jenkinsci/blueocean:1.18.0
	    privileged: true
	    ports:
	      - 8080:8080
	      - 8443:8443
	      - 50000:50000
	    # Change path of apk that you want to test. I use sample_apk that I provide in folder "example"
	    volumes:
	      - ./jenkins/jenkins_home:/var/jenkins_home
	  
```


###Test Scenarios

The Test Scenarios can be written using BDD metodology. This project includes Cucumber as BDD interpreter which is supported by Lippia by default. On each declared step you can insert the calls defined from service classes

![Lippia gherkin Web](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/gherkin.png)


### Reports 

By default Lippia expose Test results using Extent Report Community Edition (https://github.com/extent-framework)
In order to see test results this project includes extent report that show you the result of each run. This kind of reporting is really easy to understand. 
You just need to open it and navigate for all the report page to earn the much information as you can for every run.

![Lippi Extent Report](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/reporteExtent.png)


#Run Test sample from console
##Linux
### Start Selenium grid container 
After downloading the project from repository you can see the following files into your local folder


```yml


- To start the containers, simply run the following command : 

```
	sudo docker-compose up --scale chrome=10 -d
```	

### Executing tests
- go to root project folder and you will find a pom.xml file
- run commant : mvn clean -P GridParallel test



##Windows
from command lines as administrator execute:

1- go to root project directory

2- run the following command wait to virtualbox instance start, this operation will be take several minutes.
`vagrant up --provision `

3- mvn clean -P GridParallel test    (execution of tests against selenium grid instance of the sandbox)

4- vagrant halt (to stop and close vagrant service)

