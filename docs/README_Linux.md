## Lippia Web sample project - Linux users

## System Requirements :
+ JDK 8: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html   
	  https://openjdk.java.net/install/   
+ Maven 3.X: https://maven.apache.org/download.cgi   
+ Docker 18.09: https://docs.docker.com/install/linux/docker-ce/ubuntu/
+ Docker compose 1.24: https://docs.docker.com/compose/install/

# Getting started
 [Download]: <https://bitbucket.org/crowdarautomation/lippia-web-example-project/get/fdc35889edbf.zip>
- [Download] and unzip the source repository for this guide, or clone it using Git:
    ``` $ git clone https://bitbucket.org/crowdarautomation/lippia-web-example-project.git ```
- Go to root directory  
    ``` $ cd lippia-web-example-project ```
## Strategies to run
***
- [Local](#local) (running tests building project with maven from command line)
- [Stack](#sarasa) (running docker-compose and only clicking "Build job" on jenkins)  

#### Local strategy
##### Executing tests in you local machine from command line
- From terminal  execute  
 `$ mvn clean test`    
   
```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TestSuite
WARNING: Found tags option '~@Ignore'. Support for '~@tag' will be removed from the next release of Cucumber-JVM. Please use 'not @tag' instead.
TESTCASE El cliente inicia en la busqueda de un wikipedia en google STARTED EN HILO :12
log4j:WARN No appenders could be found for logger (com.crowdar.report.ExtentReportManager).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
TEST STEP STARTED EN HILO :12
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Sep 04, 2019 12:38:01 PM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Starting ChromeDriver 76.0.3809.126 (d80a294506b4c9d18015e755cee48f953ddc3f2f-refs/branch-heads/3809@{#1024}) on port 14439
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
Sep 04, 2019 12:38:02 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12
TESTCASE El cliente inicia en la busqueda de un wikipedia en google STARTED EN HILO :12
TEST STEP STARTED EN HILO :12
Sep 04, 2019 12:38:04 PM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Starting ChromeDriver 76.0.3809.126 (d80a294506b4c9d18015e755cee48f953ddc3f2f-refs/branch-heads/3809@{#1024}) on port 8281
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
Sep 04, 2019 12:38:04 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12
TESTCASE El cliente inicia en la busqueda de un wikipedia en google STARTED EN HILO :12
TEST STEP STARTED EN HILO :12
Sep 04, 2019 12:38:08 PM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Starting ChromeDriver 76.0.3809.126 (d80a294506b4c9d18015e755cee48f953ddc3f2f-refs/branch-heads/3809@{#1024}) on port 25377
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
Sep 04, 2019 12:38:08 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12
TESTCASE El cliente inicia en la busqueda de un wikipedia en google STARTED EN HILO :12
TEST STEP STARTED EN HILO :12
Sep 04, 2019 12:38:12 PM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Starting ChromeDriver 76.0.3809.126 (d80a294506b4c9d18015e755cee48f953ddc3f2f-refs/branch-heads/3809@{#1024}) on port 13831
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
Sep 04, 2019 12:38:12 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12
TESTCASE El cliente inicia en la busqueda de un wikipedia en google STARTED EN HILO :12
TEST STEP STARTED EN HILO :12
Sep 04, 2019 12:38:16 PM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Starting ChromeDriver 76.0.3809.126 (d80a294506b4c9d18015e755cee48f953ddc3f2f-refs/branch-heads/3809@{#1024}) on port 20650
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
Sep 04, 2019 12:38:16 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12
TEST STEP STARTED EN HILO :12
TEST STEP FINISHED EN HILO :12

5 Scenarios (5 passed)
15 Steps (15 passed)
0m18.753s

TEST STEP FINISHED EN HILO :12
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 19.439 s - in TestSuite
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  22.870 s
[INFO] Finished at: 2019-09-04T12:38:19-03:00
[INFO] ------------------------------------------------------------------------
```
  
> This strategy consumes the bonigarcia solution to get the correct Driver to interact with your browser.
>In this case, Maven will be excute tests phase by using your local browser directly.

To see the result, go to the [report section](#Report) below.

#### Stack strategy
This strategy use docker containers to generate a context to execute the tests. 
Through docker compose we configure the following  

-	Jenkins  
-	Selenium hub  
-  	Browser nodes  

##### Starting stack
To start the containers, simply run the following command from terminal:

```
$ sudo docker-compose up --scale chrome=2
```


 > This command, will start download the images needed to build all the containers and start them. It takes a while to download the images depending on your internet connection.

![docker-compose](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/848727f5bcbd7fd08f5cc3d399a639839f1dcfcc/docs/img/docker-compose-up.png)

 >You can change the number of instances to start from chrome by modifying the values of the "scale" parameter
for example: `-scale chrome=9` (creating 9 chrome instances)

After that you you can check the containers are up and running executing the following command
`$ sudo docker ps `.
    You have to see 2 Chrome Browsers, 1 Selenium Grid and 1 Jenkins.

```
CONTAINER ID        IMAGE                                     COMMAND                  CREATED             STATUS              PORTS                                                                      NAMES
lippia-web-example-project_chrome_1
0f69715cd500        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                       lippia-web-example-project_chrome_2
29d29f842f47        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                    
lippia-web-example-project_chrome_3
bd442e21a088        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   0.0.0.0:4444->4444/tcp                                                     selenium-hub
b2f7325d2fc5        jenkinsci/blueocean:1.18.0                "/sbin/tini -- /usr/…"   6 minutes ago       Up 6 minutes        0.0.0.0:8080->8080/tcp, 0.0.0.0:8443->8443/tcp, 0.0.0.0:50000->50000/tcp   lippia-web-example-project_jenkins_1

```

## Check Docker stack is up and running
After starting the stack you can see  and selenium grid following url:
Jenkins: http://localhost:8080

![jenkins](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/848727f5bcbd7fd08f5cc3d399a639839f1dcfcc/docs/img/jenkins.png)

Selenium Grid: http://localhost:4444/grid/console

![grid_console](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/848727f5bcbd7fd08f5cc3d399a639839f1dcfcc/docs/img/Grid_Console.png)
***

### Run from Jenkins with Selenium Grid

Enter Jenkins console http://localhost:8080 with the following credentials  

- Username: **admin**  
- Password: **secret**

### Build job

![Jenkins_job](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/848727f5bcbd7fd08f5cc3d399a639839f1dcfcc/docs/img/jenkins_start_job.png)
***
![jenkins build job](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/41c0617c8f6d8b7d2254339d96e50e74044ba3c4/docs/img/jenkins_job_build.png)

***

### Reports
you can view this report by accesing to:

- `[WORKSPACE_LOCATION]/docker/jenkins_home/workspace/nd-volume-needed-for-example-job/target/cucumber-report/example.html`
> "With each job build the report file will be replaced"

![Lippia Extent Report](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/reporteExtent.png)
