## Lippia Web sample project - Linux users

## System Requirements :
+ Docker 18.09: https://docs.docker.com/install/linux/docker-ce/ubuntu/
+ Docker compose 1.24: https://docs.docker.com/compose/install/

# Getting started
 [Download]: <https://bitbucket.org/crowdarautomation/lippia-web-sample-project/get/master.zip>
- [Download] and unzip the source repository for this guide, or clone it using Git:
    ``` $ git clone https://bitbucket.org/crowdarautomation/lippia-web-sample-project.git ```
- Go to root directory  
    ``` $ cd lippia-web-sample-project ```
## Strategies to run
***
- [Local](#localHeadless) (running tests building project with docker-compose from command line)
- [Stack](#remote) (running docker-compose)  

#### Local strategy
##### Executing tests in you local machine from command line
- From terminal  execute  
 `$ sudo docker-compose -f local-docker-compose.yml up --abort-on-container-exit --exit-code-from lippia`    
   
```
$ sudo docker-compose -f local-docker-compose.yml up --abort-on-container-exit --exit-code-from lippia
Starting lippia-web-sample-project_lippia_1 ... done
Attaching to lippia-web-sample-project_lippia_1
lippia_1  | [INFO] Scanning for projects...
lippia_1  | [INFO] 
lippia_1  | [INFO] ----------------< io.lippia:Lippia-web-example-project >----------------
lippia_1  | [INFO] Building Lippia-web-example-project 1.0.0
lippia_1  | [INFO] --------------------------------[ jar ]---------------------------------
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ Lippia-web-example-project ---
lippia_1  | [INFO] Deleting /opt/workspace/automation/target
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-resources-plugin:2.4:resources (default-resources) @ Lippia-web-example-project ---
lippia_1  | [INFO] Using 'UTF-8' encoding to copy filtered resources.
lippia_1  | [INFO] Copying 5 resources
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ Lippia-web-example-project ---
lippia_1  | [INFO] Changes detected - recompiling the module!
lippia_1  | [INFO] Compiling 4 source files to /opt/workspace/automation/target/classes
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-resources-plugin:2.4:testResources (default-testResources) @ Lippia-web-example-project ---
lippia_1  | [INFO] Using 'UTF-8' encoding to copy filtered resources.
lippia_1  | [INFO] Copying 1 resource
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ Lippia-web-example-project ---
lippia_1  | [INFO] Changes detected - recompiling the module!
lippia_1  | [INFO] Compiling 2 source files to /opt/workspace/automation/target/test-classes
lippia_1  | [INFO] 
lippia_1  | [INFO] --- maven-surefire-plugin:3.0.0-M4:test (default-test) @ Lippia-web-example-project ---
lippia_1  | [INFO] 
lippia_1  | [INFO] -------------------------------------------------------
lippia_1  | [INFO]  T E S T S
lippia_1  | [INFO] -------------------------------------------------------
lippia_1  | [INFO] Running TestSuite
lippia_1  | 20-08-25 18:47:23:139  INFO TestNG-PoolService-2 root:20 - ------ Starting -----The client search by "docker"-----
lippia_1  | 20-08-25 18:47:23:139  INFO TestNG-PoolService-0 root:20 - ------ Starting -----The client search by "crowdar"-----
lippia_1  | 20-08-25 18:47:23:139  INFO TestNG-PoolService-1 root:20 - ------ Starting -----The client search by "automation"-----
lippia_1  | SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
lippia_1  | SLF4J: Defaulting to no-operation (NOP) logger implementation
lippia_1  | SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
lippia_1  | Starting ChromeDriver 84.0.4147.30 (48b3e868b4cc0aa7e8149519690b6f6949e110a8-refs/branch-heads/4147@{#310}) on port 5790
lippia_1  | Only local connections are allowed.
lippia_1  | Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
lippia_1  | ChromeDriver was started successfully.
lippia_1  | Starting ChromeDriver 84.0.4147.30 (48b3e8[1598381244.619[1598381244.618][SEVERE]: bind() failed: Cannot assig6n][SEVERE]: bind() failed: Cannot assign req reques8b4cc0aStarting Chrao7e8ted[1m4e9D519690b6f6949e110a8-refs/branch-heads/4147@{#310}) on port 28206
lippia_1  | Only local connections are allowed.
lippia_1  | Please see https://chromedriver.chromium.org/security-considerations uested address (99)
lippia_1  | for suggestions on keeping ChromeDriver safe.
lippia_1  | ChromeDriver was started successfully.
lippia_1  | 1598381244.617][SEVERE]: bind() failed: Canriver 84.0.4147.30 (48b3e868 b4acdcd0raeas7s (n99e)8
lippia_1  | 149519690b6f6949e110a8-refs/branch-heads/4147@{#310}) on port 31784
lippia_1  | Only local connections are allowed.
lippia_1  | Please see https://chromedot assign requested address (99)
lippia_1  | river.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
lippia_1  | ChromeDriver was started successfully.
lippia_1  | Aug 25, 2020 6:47:25 PM org.openqa.selenium.remote.ProtocolHandshake createSession
lippia_1  | INFO: Detected dialect: W3C
lippia_1  | Aug 25, 2020 6:47:25 PM org.openqa.selenium.remote.ProtocolHandshake createSession
lippia_1  | INFO: Detected dialect: W3C
lippia_1  | Aug 25, 2020 6:47:25 PM org.openqa.selenium.remote.ProtocolHandshake createSession
lippia_1  | INFO: Detected dialect: W3C
lippia_1  | 20-08-25 18:47:29:097  INFO TestNG-PoolService-0 root:35 - ------ Ending -----The client search by "crowdar"-----
lippia_1  | 20-08-25 18:47:29:180  INFO TestNG-PoolService-0 root:20 - ------ Starting -----The client search by "vagrant"-----
lippia_1  | Starting ChromeDriver 84.0.4147.30 (48b3e868b4cc0aa7e8149519690b6f6949e110a8-refs/branch-heads/4147@{#310}) on port 3643
lippia_1  | Only local connections are allowed.
lippia_1  | Please see https://chromedriver.chromium[.1o5r9g8/3s8e124c9u.r3i4t5y]-considerations for suggestions on keeping ChromeDriver safe.
lippia_1  | ChromeDriver was started successfully.
lippia_1  | [SEVERE]: bind() failed: Cannot assign requested address (99)
lippia_1  | 20-08-25 18:47:29:634  INFO TestNG-PoolService-2 root:35 - ------ Ending -----The client search by "docker"-----
lippia_1  | Aug 25, 2020 6:47:29 PM org.openqa.selenium.remote.ProtocolHandshake createSession
lippia_1  | INFO: Detected dialect: W3C
lippia_1  | 20-08-25 18:47:30:372  INFO TestNG-PoolService-1 root:35 - ------ Ending -----The client search by "automation"-----
lippia_1  | 20-08-25 18:47:32:613  INFO TestNG-PoolService-0 root:35 - ------ Ending -----The client search by "vagrant"-----
lippia_1  | Feature: As a potential client i need to search in google to find a web site
lippia_1  | 
lippia_1  |   @Smoke
lippia_1  |   Scenario: The client search by "crowdar"                 # src/test/resources/features/googleSearch.feature:4
lippia_1  |     Given The client is in google page                     # GoogleSteps.home()
lippia_1  |     When The client search for word crowdar                # GoogleSteps.search(String)
lippia_1  |     Then The client verify that results are shown properly # GoogleSteps.statVerfication()
lippia_1  | 
lippia_1  |   @Smoke
lippia_1  |   Scenario: The client search by "automation"              # src/test/resources/features/googleSearch.feature:10
lippia_1  |     Given The client is in google page                     # GoogleSteps.home()
lippia_1  |     When The client search for word automation             # GoogleSteps.search(String)
lippia_1  |     Then The client verify that results are shown properly # GoogleSteps.statVerfication()
lippia_1  | 
lippia_1  |   @Smoke
lippia_1  |   Scenario: The client search by "docker"                  # src/test/resources/features/googleSearch.feature:16
lippia_1  |     Given The client is in google page                     # GoogleSteps.home()
lippia_1  |     When The client search for word docker                 # GoogleSteps.search(String)
lippia_1  |     Then The client verify that results are shown properly # GoogleSteps.statVerfication()
lippia_1  | 
lippia_1  |   @Smoke
lippia_1  |   Scenario: The client search by "vagrant"                 # src/test/resources/features/googleSearch.feature:22
lippia_1  |     Given The client is in google page                     # GoogleSteps.home()
lippia_1  |     When The client search for word vagrant                # GoogleSteps.search(String)
lippia_1  |     Then The client verify that results are shown properly # GoogleSteps.statVerfication()
lippia_1  | [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.832 s - in TestSuite
lippia_1  | [INFO] 
lippia_1  | [INFO] Results:
lippia_1  | [INFO] 
lippia_1  | [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
lippia_1  | [INFO] 
lippia_1  | [INFO] ------------------------------------------------------------------------
lippia_1  | [INFO] BUILD SUCCESS
lippia_1  | [INFO] ------------------------------------------------------------------------
lippia_1  | [INFO] Total time:  16.765 s
lippia_1  | [INFO] Finished at: 2020-08-25T18:47:33Z
lippia_1  | [INFO] ------------------------------------------------------------------------
lippia-web-sample-project_lippia_1 exited with code 0


```
  
> This strategy consumes the bonigarcia solution to get the correct Driver to interact with your browser.
>In this case, Maven will be excute tests phase by using your local browser directly.


#### Stack strategy
This strategy use docker containers to generate a context to execute the tests. 
Through docker compose we configure the following  

-	Zalenium hub  
-  	Lippia Image

##### Starting stack
To start the containers, simply run the following command from terminal:

```
$ sudo docker pull elgalu/selenium
$ sudo docker-compose up --abort-on-container-exit --exit-code-from lippia_zalenium
```

 
 > This command, will start download the images needed to build all the containers and start them. It takes a while to download the images depending on your internet connection.

```
$ sudo docker-compose -f docker-compose.yml up --abort-on-container-exit --exit-code-from lippia_zalenium
Starting lippia-web-sample-project_zalenium_1 ... done
Recreating lippia-web-sample-project_lippia_zalenium_1 ... done
Attaching to lippia-web-sample-project_zalenium_1, lippia-web-sample-project_lippia_zalenium_1
zalenium_1         | Docker binary already present, will use that one.
zalenium_1         | Docker version 19.03.12, build 48a66213fe
zalenium_1         | -- LOG 15:43:45:467867776 Ensuring docker works...
zalenium_1         | -- LOG 15:43:45:638190258 Ensuring docker-selenium is available...
zalenium_1         | haveged: haveged starting up
zalenium_1         | Copying files for Dashboard...
zalenium_1         | Starting Nginx reverse proxy...
zalenium_1         | Starting Selenium Hub...
zalenium_1         | ....15:43:46.778 [main] INFO  o.o.grid.selenium.GridLauncherV3 - Selenium server version: 3.141.59, revision: unknown
zalenium_1         | .15:43:46.965 [main] INFO  o.o.grid.selenium.GridLauncherV3 - Launching Selenium Grid hub on port 4445
zalenium_1         | ...15:43:47.703 [main] INFO  d.z.e.z.c.DockerContainerClient - About to clean up any left over DockerSelenium containers created by Zalenium
lippia_zalenium_1  | [INFO] Scanning for projects...
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] ----------------< io.lippia:Lippia-web-example-project >----------------
lippia_zalenium_1  | [INFO] Building Lippia-web-example-project 1.0.0
lippia_zalenium_1  | [INFO] --------------------------------[ jar ]---------------------------------
zalenium_1         | .......15:43:49.375 [AutoStartProxyPoolPoller] INFO  d.z.e.z.proxy.AutoStartProxySet - Starting poller.
lippia_zalenium_1  | Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom
zalenium_1         | ...15:43:50.164 [main] INFO  d.z.ep.zalenium.aspect.HubAspect - Registering custom Zalenium servlets
zalenium_1         | .15:43:50.507 [main] INFO  org.openqa.grid.web.Hub - Selenium Grid hub is up and running
zalenium_1         | 15:43:50.516 [main] INFO  org.openqa.grid.web.Hub - Nodes should register to http://172.20.0.2:4445/grid/register/
zalenium_1         | 15:43:50.517 [main] INFO  org.openqa.grid.web.Hub - Clients should connect to http://172.20.0.2:4445/wd/hub
zalenium_1         | Selenium Hub started!
zalenium_1         | Sauce Labs not enabled...
zalenium_1         | Browser Stack not enabled...
zalenium_1         | TestingBot not enabled...
zalenium_1         | CBT not enabled...
zalenium_1         | LambdaTest not enabled...
zalenium_1         | Zalenium is now ready!
zalenium_1         | *************************************** Data Processing Agreement ***************************************
zalenium_1         | By using this software you agree that the following non-PII (non personally identifiable information)
zalenium_1         | data will be collected, processed and used by Zalando SE for the purpose of improving our test
zalenium_1         | infrastructure tools. Anonymisation with respect of the IP address means that only the first two octets
zalenium_1         | of the IP address are collected.
zalenium_1         | 
zalenium_1         | See the complete license at https://github.com/zalando/zalenium/blob/master/LICENSE.md
zalenium_1         | *************************************** Data Processing Agreement ***************************************
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom (3.9 kB at 2.0 kB/s)
lippia_zalenium_1  | Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.jar (25 kB at 46 kB/s)
lippia_zalenium_1  | Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/maven-metadata.xml
lippia_zalenium_1  | Downloading from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/grpc/grpc-core/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/maven-metadata.xml (2.7 kB at 7.9 kB/s)
Downloaded from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/grpc/grpc-core/maven-metadata.xml (2.7 kB at 2.5 kB/s)
lippia_zalenium_1  | Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/maven-metadata.xml
lippia_zalenium_1  | Downloading from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/netty/netty-codec-http2/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/maven-metadata.xml (2.7 kB at 7.3 kB/s)
lippia_zalenium_1  | Downloaded from crowdarRepo: https://nexus-v3-repositories.automation.crowdaronline.com/repository/maven-public/io/netty/netty-codec-http2/maven-metadata.xml (2.8 kB at 6.4 kB/s)
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ Lippia-web-example-project ---
lippia_zalenium_1  | [INFO] Deleting /opt/workspace/automation/target
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] --- maven-resources-plugin:2.4:resources (default-resources) @ Lippia-web-example-project ---
lippia_zalenium_1  | [INFO] Using 'UTF-8' encoding to copy filtered resources.
lippia_zalenium_1  | [INFO] Copying 5 resources
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ Lippia-web-example-project ---
lippia_zalenium_1  | [INFO] Changes detected - recompiling the module!
lippia_zalenium_1  | [INFO] Compiling 4 source files to /opt/workspace/automation/target/classes
zalenium_1         | 15:44:00.370 [Thread-10] INFO  d.z.e.z.registry.ZaleniumRegistry - Registered a node http://172.20.0.4:40000
zalenium_1         | 15:44:01.937 [Thread-11] INFO  d.z.e.z.registry.ZaleniumRegistry - Registered a node http://172.20.0.5:40001
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] --- maven-resources-plugin:2.4:testResources (default-testResources) @ Lippia-web-example-project ---
lippia_zalenium_1  | [INFO] Using 'UTF-8' encoding to copy filtered resources.
lippia_zalenium_1  | [INFO] Copying 1 resource
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ Lippia-web-example-project ---
lippia_zalenium_1  | [INFO] Changes detected - recompiling the module!
lippia_zalenium_1  | [INFO] Compiling 2 source files to /opt/workspace/automation/target/test-classes
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] --- maven-surefire-plugin:3.0.0-M4:test (default-test) @ Lippia-web-example-project ---
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] -------------------------------------------------------
lippia_zalenium_1  | [INFO]  T E S T S
lippia_zalenium_1  | [INFO] -------------------------------------------------------
lippia_zalenium_1  | [INFO] Running TestSuite
lippia_zalenium_1  | 20-08-25 18:44:05:819  INFO TestNG-PoolService-1 root:20 - ------ Starting -----The client search by "automation"-----
lippia_zalenium_1  | 20-08-25 18:44:05:820  INFO TestNG-PoolService-2 root:20 - ------ Starting -----The client search by "docker"-----
lippia_zalenium_1  | 20-08-25 18:44:05:819  INFO TestNG-PoolService-0 root:20 - ------ Starting -----The client search by "crowdar"-----
lippia_zalenium_1  | SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
lippia_zalenium_1  | SLF4J: Defaulting to no-operation (NOP) logger implementation
lippia_zalenium_1  | SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
zalenium_1         | 15:44:07.217 [qtp1761217448-23] INFO  o.o.g.w.s.handler.RequestHandler - Got a request to create a new session: Capabilities {browserName: chrome, goog:chromeOptions: {args: [disable-infobars, --no-sandbox, --disable-dev-shm-usage, --test-type, --ignore-certificate-errors, --start-maximized], extensions: [], prefs: {printing.enabled: false}}, recordVideo: false}
zalenium_1         | 15:44:07.218 [qtp1761217448-20] INFO  o.o.g.w.s.handler.RequestHandler - Got a request to create a new session: Capabilities {browserName: chrome, goog:chromeOptions: {args: [disable-infobars, --no-sandbox, --disable-dev-shm-usage, --test-type, --ignore-certificate-errors, --start-maximized], extensions: [], prefs: {printing.enabled: false}}, recordVideo: false}
zalenium_1         | 15:44:07.218 [qtp1761217448-17] INFO  o.o.g.w.s.handler.RequestHandler - Got a request to create a new session: Capabilities {browserName: chrome, goog:chromeOptions: {args: [disable-infobars, --no-sandbox, --disable-dev-shm-usage, --test-type, --ignore-certificate-errors, --start-maximized], extensions: [], prefs: {printing.enabled: false}}, recordVideo: false}
zalenium_1         | 15:44:07.325 [qtp1761217448-23] INFO  d.z.e.z.registry.ZaleniumRegistry - Adding sessionRequest for {recordVideo=false, browserName=chrome, goog:chromeOptions={args=[disable-infobars, --no-sandbox, --disable-dev-shm-usage, --test-type, --ignore-certificate-errors, --start-maximized], extensions=[], prefs={printing.enabled=false}}}
zalenium_1         | 15:44:07.325 [qtp1761217448-20] INFO  d.z.e.z.registry.ZaleniumRegistry - Adding sessionRequest for {recordVideo=false, browserName=chrome, goog:chromeOptions={args=[disable-infobars, --no-sandbox, --disable-dev-shm-usage, --test-type, --ignore-certificate-errors, --start-maximized], extensions=[], prefs={printing.enabled=false}}}
zalenium_1         | 15:44:07.326 [qtp1761217448-17] INFO  d.z.e.z.registry.ZaleniumRegistry - Adding sessionRequest for {recordVideo=false, browserName=chrome, goog:chromeOptions={args=[disable-infobars, --no-sandbox, --disable-dev-shm-usage, --test-type, --ignore-certificate-errors, --start-maximized], extensions=[], prefs={printing.enabled=false}}}
zalenium_1         | 15:44:07.329 [http://172.20.0.4:40000] INFO  org.openqa.grid.internal.TestSlot - Trying to create a new session on test slot {server:CONFIG_UUID=d395ec12-879d-481e-8712-12c149d9d866, seleniumProtocol=WebDriver, zal:tz=America/Argentina/Buenos_Aires, version=84.0.4147.125, platform=LINUX, acceptSslCerts=true, zal:screenResolution=1920x1080, zal:screen-resolution=1920x1080, browserName=chrome, zal:resolution=1920x1080, maxInstances=1, platformName=LINUX}
zalenium_1         | 15:44:07.330 [Matcher thread] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - External ssid null internal c345af6a-5a0a-45ff-9bb9-f4ad8d96d421 
zalenium_1         | 15:44:07.334 [Matcher thread] INFO  d.z.e.z.registry.ZaleniumRegistry - Test session with internal key c345af6a-5a0a-45ff-9bb9-f4ad8d96d421 assigned to remote (http://172.20.0.4:40000) after 0 seconds (186 ms).
zalenium_1         | 15:44:07.344 [http://172.20.0.5:40001] INFO  org.openqa.grid.internal.TestSlot - Trying to create a new session on test slot {server:CONFIG_UUID=5baf6e57-507c-466e-9898-c53be5e2c9ab, seleniumProtocol=WebDriver, zal:tz=America/Argentina/Buenos_Aires, version=84.0.4147.125, platform=LINUX, acceptSslCerts=true, zal:screenResolution=1920x1080, zal:screen-resolution=1920x1080, browserName=chrome, zal:resolution=1920x1080, maxInstances=1, platformName=LINUX}
zalenium_1         | 15:44:07.345 [Matcher thread] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - External ssid null internal 923032f7-2576-45cb-8638-d657b5b9e733 
zalenium_1         | 15:44:07.346 [Matcher thread] INFO  d.z.e.z.registry.ZaleniumRegistry - Test session with internal key 923032f7-2576-45cb-8638-d657b5b9e733 assigned to remote (http://172.20.0.5:40001) after 0 seconds (194 ms).
lippia_zalenium_1  | Aug 25, 2020 6:44:08 PM org.openqa.selenium.remote.ProtocolHandshake createSession
lippia_zalenium_1  | INFO: Detected dialect: W3C
zalenium_1         | 15:44:09.016 [http://172.20.0.5:40001] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - External ssid 69ce08afc9e0d17e2642d8ad5db60855 internal 923032f7-2576-45cb-8638-d657b5b9e733 
lippia_zalenium_1  | Aug 25, 2020 6:44:09 PM org.openqa.selenium.remote.ProtocolHandshake createSession
lippia_zalenium_1  | INFO: Detected dialect: W3C
zalenium_1         | 15:44:09.073 [http://172.20.0.4:40000] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - External ssid 1021d9cb9ac14fe1779feb26ce078249 internal c345af6a-5a0a-45ff-9bb9-f4ad8d96d421 
lippia_zalenium_1  | 20-08-25 18:44:13:756  INFO TestNG-PoolService-0 root:35 - ------ Ending -----The client search by "crowdar"-----
zalenium_1         | 15:44:14.173 [http://172.20.0.5:40001] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - Session 923032f7-2576-45cb-8638-d657b5b9e733 completed. Node should shutdown soon...
lippia_zalenium_1  | 20-08-25 18:44:14:176  INFO TestNG-PoolService-0 root:20 - ------ Starting -----The client search by "vagrant"-----
zalenium_1         | 15:44:14.261 [qtp1761217448-18] INFO  o.o.g.w.s.handler.RequestHandler - Got a request to create a new session: Capabilities {browserName: chrome, goog:chromeOptions: {args: [disable-infobars, --no-sandbox, --disable-dev-shm-usage, --test-type, --ignore-certificate-errors, --start-maximized], extensions: [], prefs: {printing.enabled: false}}, recordVideo: false}
zalenium_1         | 15:44:14.264 [qtp1761217448-18] INFO  d.z.e.z.registry.ZaleniumRegistry - Adding sessionRequest for {recordVideo=false, browserName=chrome, goog:chromeOptions={args=[disable-infobars, --no-sandbox, --disable-dev-shm-usage, --test-type, --ignore-certificate-errors, --start-maximized], extensions=[], prefs={printing.enabled=false}}}
lippia_zalenium_1  | 20-08-25 18:44:15:390  INFO TestNG-PoolService-2 root:35 - ------ Ending -----The client search by "docker"-----
zalenium_1         | 15:44:15.584 [http://172.20.0.4:40000] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - Session c345af6a-5a0a-45ff-9bb9-f4ad8d96d421 completed. Node should shutdown soon...
zalenium_1         | 15:44:16.623 [Thread-21] INFO  d.z.e.z.registry.ZaleniumRegistry - Registered a node http://172.20.0.6:40002
zalenium_1         | 15:44:16.632 [http://172.20.0.6:40002] INFO  org.openqa.grid.internal.TestSlot - Trying to create a new session on test slot {server:CONFIG_UUID=3ceb05e4-ca53-4a16-b47e-62dc00d9188b, seleniumProtocol=WebDriver, zal:tz=America/Argentina/Buenos_Aires, version=84.0.4147.125, platform=LINUX, acceptSslCerts=true, zal:screenResolution=1920x1080, zal:screen-resolution=1920x1080, browserName=chrome, zal:resolution=1920x1080, maxInstances=1, platformName=LINUX}
zalenium_1         | 15:44:16.633 [Matcher thread] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - External ssid null internal fc15d00b-30ef-46ee-b923-8d89f4138e59 
zalenium_1         | 15:44:16.635 [Matcher thread] INFO  d.z.e.z.registry.ZaleniumRegistry - Test session with internal key fc15d00b-30ef-46ee-b923-8d89f4138e59 assigned to remote (http://172.20.0.6:40002) after 9 seconds (9489 ms).
lippia_zalenium_1  | Aug 25, 2020 6:44:18 PM org.openqa.selenium.remote.ProtocolHandshake createSession
lippia_zalenium_1  | INFO: Detected dialect: W3C
zalenium_1         | 15:44:18.823 [http://172.20.0.6:40002] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - External ssid a50dfd4e2fcfc0c1513d10917ddc46b1 internal fc15d00b-30ef-46ee-b923-8d89f4138e59 
zalenium_1         | 15:44:24.774 [Thread-25] INFO  d.z.e.z.registry.ZaleniumRegistry - Registered a node http://172.20.0.7:40003
zalenium_1         | 15:44:24.776 [http://172.20.0.7:40003] INFO  org.openqa.grid.internal.TestSlot - Trying to create a new session on test slot {server:CONFIG_UUID=f5d32d3d-7f7b-4d0a-88c3-638cfa0124d2, seleniumProtocol=WebDriver, zal:tz=America/Argentina/Buenos_Aires, version=84.0.4147.125, platform=LINUX, acceptSslCerts=true, zal:screenResolution=1920x1080, zal:screen-resolution=1920x1080, browserName=chrome, zal:resolution=1920x1080, maxInstances=1, platformName=LINUX}
zalenium_1         | 15:44:24.776 [Matcher thread] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - External ssid null internal 3c17b26c-5c6f-486e-9182-efce28f03887 
zalenium_1         | 15:44:24.778 [Matcher thread] INFO  d.z.e.z.registry.ZaleniumRegistry - Test session with internal key 3c17b26c-5c6f-486e-9182-efce28f03887 assigned to remote (http://172.20.0.7:40003) after 10 seconds (10544 ms).
lippia_zalenium_1  | Aug 25, 2020 6:44:26 PM org.openqa.selenium.remote.ProtocolHandshake createSession
lippia_zalenium_1  | INFO: Detected dialect: W3C
zalenium_1         | 15:44:26.188 [http://172.20.0.7:40003] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - External ssid 452d67c7608074b576baeb9a551c7d97 internal 3c17b26c-5c6f-486e-9182-efce28f03887 
lippia_zalenium_1  | 20-08-25 18:44:27:004  INFO TestNG-PoolService-1 root:35 - ------ Ending -----The client search by "automation"-----
zalenium_1         | 15:44:27.143 [http://172.20.0.6:40002] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - Session fc15d00b-30ef-46ee-b923-8d89f4138e59 completed. Node should shutdown soon...
lippia_zalenium_1  | 20-08-25 18:44:30:122  INFO TestNG-PoolService-0 root:35 - ------ Ending -----The client search by "vagrant"-----
zalenium_1         | 15:44:30.200 [http://172.20.0.7:40003] INFO  d.z.e.z.p.DockerSeleniumRemoteProxy - Session 3c17b26c-5c6f-486e-9182-efce28f03887 completed. Node should shutdown soon...
lippia_zalenium_1  | Feature: As a potential client i need to search in google to find a web site
lippia_zalenium_1  | 
lippia_zalenium_1  |   @Smoke
lippia_zalenium_1  |   Scenario: The client search by "crowdar"                 # src/test/resources/features/googleSearch.feature:4
lippia_zalenium_1  |     Given The client is in google page                     # GoogleSteps.home()
lippia_zalenium_1  |     When The client search for word crowdar                # GoogleSteps.search(String)
lippia_zalenium_1  |     Then The client verify that results are shown properly # GoogleSteps.statVerfication()
lippia_zalenium_1  | 
lippia_zalenium_1  |   @Smoke
lippia_zalenium_1  |   Scenario: The client search by "automation"              # src/test/resources/features/googleSearch.feature:10
lippia_zalenium_1  |     Given The client is in google page                     # GoogleSteps.home()
lippia_zalenium_1  |     When The client search for word automation             # GoogleSteps.search(String)
lippia_zalenium_1  |     Then The client verify that results are shown properly # GoogleSteps.statVerfication()
lippia_zalenium_1  | 
lippia_zalenium_1  |   @Smoke
lippia_zalenium_1  |   Scenario: The client search by "docker"                  # src/test/resources/features/googleSearch.feature:16
lippia_zalenium_1  |     Given The client is in google page                     # GoogleSteps.home()
lippia_zalenium_1  |     When The client search for word docker                 # GoogleSteps.search(String)
lippia_zalenium_1  |     Then The client verify that results are shown properly # GoogleSteps.statVerfication()
lippia_zalenium_1  | 
lippia_zalenium_1  |   @Smoke
lippia_zalenium_1  |   Scenario: The client search by "vagrant"                 # src/test/resources/features/googleSearch.feature:22
lippia_zalenium_1  |     Given The client is in google page                     # GoogleSteps.home()
lippia_zalenium_1  |     When The client search for word vagrant                # GoogleSteps.search(String)
lippia_zalenium_1  |     Then The client verify that results are shown properly # GoogleSteps.statVerfication()
lippia_zalenium_1  | [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 25.718 s - in TestSuite
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] Results:
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
lippia_zalenium_1  | [INFO] 
lippia_zalenium_1  | [INFO] ------------------------------------------------------------------------
lippia_zalenium_1  | [INFO] BUILD SUCCESS
lippia_zalenium_1  | [INFO] ------------------------------------------------------------------------
lippia_zalenium_1  | [INFO] Total time:  42.290 s
lippia_zalenium_1  | [INFO] Finished at: 2020-08-25T18:44:31Z
lippia_zalenium_1  | [INFO] ------------------------------------------------------------------------
lippia-web-sample-project_lippia_zalenium_1 exited with code 0
Aborting on container exit...
Stopping lippia-web-sample-project_zalenium_1          ... done

```

## Check Docker stack is up and running
After starting the stack you can see  and selenium grid following url:

Zalenium Grid: http://localhost:4444/grid/console

![grid_console](/docs/img/Grid_Console.png)

Chrome live preview novnc: http://localhost:4444/grid/admin/live

![Zalenium_Console](/docs/img/Zalenium_Console.png)

Zalenium console: http://localhost:4444/dashboard/#

![Zalenium_Dashboard](/docs/img/Zalenium_Dashboard.png)
***
