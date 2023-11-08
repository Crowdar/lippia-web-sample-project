@Bookstore
Feature: As a customer from the bookstore page I want to access to my account information


  @MyAccount @Dashboard @Smoke
  Scenario: Access to the Dashboard successfully.
    Given The client is on bookstore page
    When The client clicks on My Account on the menu bar
    And The client enters testuser01-automation@yopmail.com in username textbox
    And The client enters Testinmg1245 in Password textbox
    And The client clicks on login button
    And The client clicks on Downloads link
    And The client clicks on Dashboard link
    Then Verifies that the Dashboard is visible for the client
    And Verifies that the client navigates to my-account page


  @MyAccount @Orders
  Scenario: Access to the orders successfully.
    Given The client is on bookstore page
    When The client clicks on My Account on the menu bar
    And The client enters testuser01-automation@yopmail.com in username textbox
    And The client enters Testinmg1245 in Password textbox
    And The client clicks on login button
    And The client clicks on Orders link
    Then Verifies that the Orders are visible for the client
    And Verifies that the client navigates to my-account/orders page



  @MyAccount @LogOut
  Scenario: Access to the Dashboard successfully.
    Given The client is on bookstore page
    When The client clicks on My Account on the menu bar
    And The client enters testuser01-automation@yopmail.com in username textbox
    And The client enters Testinmg1245 in Password textbox
    And The client clicks on login button
    And The client clicks on Logout link
    Then Verifies that the client has successfully logout
