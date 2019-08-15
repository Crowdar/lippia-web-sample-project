#Lippia Web sample project 

##System Requirements :
- git client: https://www.atlassian.com/git/tutorials/install-git
+ JDK 8: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html   
	  https://openjdk.java.net/install/   
+ maven 3.X: https://maven.apache.org/download.cgi   
+ docker 18.09: https://docs.docker.com/install/linux/docker-ce/ubuntu/
+ docker compose 1.24: https://docs.docker.com/compose/install/


##Purpose
This project has the intention of show in a practical way how to use Lippia Automation Framework to build automated tests using Gherkin and Page-Object pattern. This sample project includes the required components as binaries, docker containers and configuration files to simply download and run a set of sample tests in your local computer, using the Lippia container stack described bellow.

##Project structure

A typical Lippia Test Automation project usually looks like this 

```
	.
├── main
│   ├── java
│   │   └── com
│   │       └── crowdar
│   │           └── examples
│   │               ├── pages
│   │               │   ├── Inicio.java
│   │               │   └── PageBaseExamples.java
│   │               └── steps
│   │                   └── InicioSteps.java
│   └── resources
│       ├── config.properties
│       ├── cucumber.properties
│       └── webdrivermanager.properties
└── test
    ├── java
    │   ├── CrowdTestNgParallelRunner.java
    │   ├── CrowdTestNgRunner.java
    │   └── com
    │       └── crowdar
    │           ├── Hooks.java
    │           ├── examples
    │           │   └── testng
    │           │       └── StepDefinitions.java
    │           └── integration
    │               └── tests
    │                   └── ZapiTests.java
    └── resources
        └── features
            └── Inicio.feature
```

Folder's description:

|Path   |Description    |
|-------|----------------|
|main\java\\...\examples\pages\\\*.java|Folder with all the **PageObjects** matching steps with java code|
|main\java\\...\examples\steps\\\*Steps.java|Folder with all the **steps** wich match with Gherkin Test Scenarios |
|test\resources\features\\\*.feature|Folder with all the **feature files** containing **Test Scenarios** and **Sample Data** |
|main\resources|Folder with all configuration needed to run Lippia |

In this example, *Inicio* is the first web page the framework will interact with. The **steps** defined in *InicioSteps.java* to execute the *Test Scenarios* defined in Gherkin language. 


|File   | Description    |
|-------|----------------|
|Inicio.java   | Map between each element in the webpage *Inicio* you want to interact with. You need to add one new file for each page you want to navigate in your tests. |
|InicioSteps.java   | Code to support the behaviour of each **step** coded into the feature files for the *Inicio* web page. This code executes the interaction between the Framework and the web application and match the steps with the code who run interactions. |
|Inicio.feature| Definition of the **Test Scenarios** with all the **steps** written in Gherkin format |


###Docker stack
The following project includes the basic Docker Lippia Containers to run this  web sample project. To install and start your local instalation please read ![Lippia Docker Web Readme file](https://bitbucket.org/crowdarautomation/lippia-web-example-project/src/lippia_docker_web_readme.md)


###Test Scenarios

The Test Scenarios can be written using BDD metodology. This project includes Cucumber as BDD interpreter which is supported by Lippia by default. On each declared step you can insert the calls defined from service classes

![Lippia gherkin Web](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/gherkin.png =100x)


### Reports 

By default Lippia expose Test results using Extent Report Community Edition (https://github.com/extent-framework)
In order to see test results this project includes extent report that show you the result of each run. This kind of reporting is really easy to understand. 
You just need to open it and navigate for all the report page to earn the much information as you can for every run.

![Lippi Extent Report](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/reporteExtent.png)


#Run Test sample from console
##Linux
### Start Selenium grid container 
After downloading the project from repository you can see the following files into your local folder



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

