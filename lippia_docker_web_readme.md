##Lippia Docker Web

This file describes the installation of the following Lippia containers:

![Lippia Architecture Web](https://bitbucket.org/crowdarautomation/lippia-web-example-project/raw/805effb96e514985af2815aa89a1537bb4fe44ba/architecture_web_lippia.png =70x)

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
	    volumes:
	      - ./jenkins/jenkins_home:/var/jenkins_home
	  
```

To start the containers run the following command

```
    sudo docker-compose up --scale chrome=10 -d
```

This command, will start download the images needed to build all the containers and start them. It takes a while to download the images depending on your internet connection. After that you you can check the containers are up and running executing the following command `docker containers ls `. 
You have to see 10 Chrome Browsers, 1 Selenium Grid and 1 Jenkins.

```
CONTAINER ID        IMAGE                                     COMMAND                  CREATED             STATUS              PORTS                                                                      NAMES
7334a5bee687        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_5
912f88d38bb2        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_3
bd442e21a088        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_1
0f69715cd500        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_10
ac42a9cd48b2        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_6
24afc5a74926        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_8
da28b68d7df8        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_4
93cd3935b81a        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_9
03841dde0580        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_2
29d29f842f47        selenium/node-chrome:3.141.59-palladium   "/opt/bin/entry_poin…"   6 minutes ago       Up 5 minutes                                                                                   lippia-web-example-project_chrome_7
b31e87dc32cf        selenium/hub:3.141.59-palladium           "/opt/bin/entry_poin…"   6 minutes ago       Up 6 minutes        0.0.0.0:4444->4444/tcp                                                     selenium-hub
b2f7325d2fc5        jenkinsci/blueocean:1.18.0                "/sbin/tini -- /usr/…"   6 minutes ago       Up 6 minutes        0.0.0.0:8080->8080/tcp, 0.0.0.0:8443->8443/tcp, 0.0.0.0:50000->50000/tcp   lippia-web-example-project_jenkins_1

```




