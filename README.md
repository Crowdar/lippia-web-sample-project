# Lippia Web sample project

This project has the intention of show in a practical way how to use Lippia Automation Framework to build automated tests using Gherkin and Page-Object pattern. This sample project includes the required components as binaries, docker containers and configuration files to simply download and run a set of sample tests in your local computer, using the Lippia container stack described bellow.

***


## Docker stack

The following project includes the basic Docker Lippia Containers to run this  web sample project. You can choose to run the code from your favourite IDE, run from console or from Jenkins using the Docker Stack.
To install and start a local instalation with Docker containers go to **Getting started** at the end of this guide. 

![Lippia Extent Report](docs/img/architecture_web_lippia.png)

## Project structure

A typical Lippia Test Automation project usually looks like this 

```
	.
├── main
│   ├── java
│   │   └── com
│   │       └── crowdar
│   │           └── examples
│   │               ├── pages
│   │               │   ├── GoogleHomePage.java
│   │               │   ├── GoogleSearchResultPage.java
│   │               │   ├── PageBaseGoogle.java
│   │               └── steps
│   │                   └── GoogleSteps.java
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
    │           └── Hooks.java
    └── resources
        └── features
            └── googleSearch.feature
```

Folder's description:

|Path   |Description    |
|-------|----------------|
|main\java\\...\examples\pages\\\*.java|Folder with all the **PageObjects** matching steps with java code|
|main\java\\...\examples\steps\\\*Steps.java|Folder with all the **steps** wich match with Gherkin Test Scenarios |
|test\resources\features\\\*.feature|Folder with all the **feature files** containing **Test Scenarios** and **Sample Data** |
|main\resources|Folder with all configuration needed to run Lippia |

In this example, *GoogleHomePage* is the first web page the framework will interact with. The **steps** defined in *GoogleSteps.java* to execute the *Test Scenarios* defined in Gherkin language. 


|File   | Description    |
|-------|----------------|
|PageBaseGoogle    | Define base URL to navigate. |
|GoogleHomePage.java   | PageObject: between each element in the webpage *GoogleHomePage* you want to interact with. You need to add one new file for each page you want to navigate in your tests. |
|GoogleSteps.java   | StepOpject: Code to support the behaviour of each **step** coded into the feature files for the *GoogleHomePage* web page. This code executes the interaction between the Framework and the web application and match the steps with the code who run interactions. |
|googleSearch.feature| Feature file: Definition of the **Test Scenarios** with all the **steps** written in Cucumber format (http)|

## Page base    
***
```
public class PageBaseGoogle extends CucumberPageBase {

    public PageBaseGoogle(SharedDriver driver){
        super( driver);
        BASE_URL = "http://www.google.com.ar";
    }
}
```


## Page Object    
***    
```
public class GoogleHomePage extends PageBaseGoogle{

    private WebElement googleInput(){return getWebElement(By.xpath("//input[@class='gLFyf gsfi']"));}
    private WebElement googleSearchBtn(){return getWebElement(By.name("btnK"));}

    public GoogleHomePage(SharedDriver driver){
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go(){
        navigateToIt();
    }

    public void enterSearchCriteria(String palabra){
        googleInput().clear();
        googleInput().sendKeys(palabra);
    }

    public void clickSearchButton(){
        googleSearchBtn().click();
    }

}
```

## Step Object   
***
    
```
public class GoogleSteps extends PageSteps {

    private GoogleHomePage homePage;
    private GoogleSearchResultPage searchResultPage;

    public GoogleSteps(SharedDriver driver){
        super(driver);
        homePage = new GoogleHomePage(driver);
        searchResultPage= new GoogleSearchResultPage(driver);
    }

    @Given("The client is in google page")
    public void home(){
    	homePage.go();
    }

    @When("The client search for word (.*)")
    public void search(String criteria){
    	homePage.enterSearchCriteria(criteria);
    	homePage.clickSearchButton();

    }

    @Then("The client verify that results are shown properly")
    public void statVerfication(){
    	Assert.assertTrue(!searchResultPage.getStats().isEmpty());
	
    }
}
```


## Feature File
***

The Test Scenarios can be written using BDD metodology. This project includes Cucumber as BDD interpreter which is supported by Lippia by default. On each declared step you can insert the calls defined from service classes            
    
```
Feature: As a potential client i need to search in google to find a web site

  @Smoke
  Scenario: The client search by "crowdar"
    Given The client is in google page
    When The client search for word crowdar
    Then The client verify that results are shown properly
    
  @Smoke
  Scenario: The client search by "automation"
    Given The client is in google page
    When The client search for word automation
    Then The client verify that results are shown properly
    
  @Smoke
  Scenario: The client search by "docker"
    Given The client is in google page
    When The client search for word docker
    Then The client verify that results are shown properly
	
  @Smoke
  Scenario: The client search by "vagrant"
    Given The client is in google page
    When The client search for word vagrant
    Then The client verify that results are shown properly
```


### Reports 

By default Lippia expose Test results using Extent Report Community Edition (https://github.com/extent-framework)
In order to see test results this project includes extent report that show you the result of each run. This kind of reporting is really easy to understand. 
You just need to open it and navigate for all the report page to earn the much information as you can for every run.

![Lippia Extent Report](/docs/img/reporteExtent.png)

* * *
* * *

# Getting started
    
- If you are Linux user 
    [`Getting started - Linux User`](docs/README_Linux.md)
- If you are Windows user
    [`Getting started - Windows User`](docs/README_Windows.md)
    
    
"This project is licensed under the terms of the MIT license."
