@Bookstore
Feature: As a visitor from the bookstore page I want to navigate the home page properly


  @Home @Sliders @Smoke
  Scenario: Home page with three sliders only.
    Given The client is on bookstore page
    When The client clicks on Shop on the menu bar
    And The client clicks on bookstore logo on the menu bar
    Then Verifies the Home Page has 3 sliders

  @Home @Arrivals @Smoke
  Scenario: Home page has three arrivals only.
    Given The client is on bookstore page
    And The client clicks on Shop on the menu bar
    And The client clicks on bookstore logo on the menu bar
    And The client scrolls down on the home page
    Then Verifies the Home Page has 3 arrivals


  @Home @Arrivals
  Scenario: Images in Arrivals should navigate from the Home page.
    Given The client is on bookstore page
    And The client clicks on Shop on the menu bar
    And The client clicks on bookstore logo on the menu bar
    And The client scrolls down on the home page
    And The client clicks on the first arrival image
    Then Verifies that Add To Basket Button is visible to the client
    And Verifies that the client navigates to product/selenium-ruby page