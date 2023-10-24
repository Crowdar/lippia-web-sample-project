@Bookstore
Feature: As a visitor from the bookstore page I want to navigate the home page properly


  @Home @Sliders @Smoke
  Scenario: Home page with three sliders only.
      #1. Home Page with three Sliders only
    Given The client is on bookstore page
      #1) Open the browser
      #2) Enter the URL “http://practice.automationtesting.in/”
    When The client clicks on Shop on the menu bar
      #3) Click on Shop Menu
    And The client clicks on bookstore logo on the menu bar
       #4) Now click on Home menu button
    Then Verifies the Home Page has three sliders
      #5) Test whether the Home page has Three Sliders only
      #6) The Home page must contains only three sliders

  @Home @Arrivals @Smoke
  Scenario: Home page has three arrivals only.
  #2. Home page with three Arrivals only
    Given The client is on bookstore page
  #1) Open the browser
  #2) Enter the URL “http://practice.automationtesting.in/”
    And The client clicks on Shop on the menu bar
  #3) Click on Shop Menu
    And The client clicks on bookstore logo on the menu bar
  #4) Now click on Home menu button
    Then Verifies the Home Page has three arrivals
  #5) Test whether the Home page has Three Arrivals only
  #6) The Home page must contains only three Arrivals


  @Home @Arrivals
  Scenario: Images in Arrivals should navigate from the Home page.
  #3. Home page - Images in Arrivals should navigate
    Given The client is on bookstore page
  #1) Open the browser
  #2) Enter the URL “http://practice.automationtesting.in/”
    And The client clicks on Shop on the menu bar
  #3) Click on Shop Menu
    And The client clicks on bookstore logo on the menu bar
  #4) Now click on Home menu button
    And The client clicks on the first arrival image
  #5) Test whether the Home page has Three Arrivals only
  #6) The Home page must contains only three Arrivals
  #7) Now click the image in the Arrivals
    Then Verifies that the client is navigation to the product page
  #8) Test whether it is navigating to next page where the user can add that book into his basket.
  #9) Image should be clickable and shoul navigate to next page where user can add that book to his basket