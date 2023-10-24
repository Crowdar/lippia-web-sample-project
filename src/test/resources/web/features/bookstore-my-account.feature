@Bookstore
Feature: As a customer from the bookstore page I want to access to my account information


  @MyAccount @Dashboard @Smoke
  Scenario: Access to the Dashboard successfully.
      #1. My Accounts-Dashboard
    Given The client is on bookstore page
      #  1) Open the browser
      #  2) Enter the URL “http://practice.automationtesting.in/”
    When The client clicks on My Account on the menu bar
      #  3) Click on My Account Menu
    And The client enters pepe in username textbox
      #  4) Enter registered username in username textbox
    And The client enters testing123 in password textbox
      #  5) Enter password in password textbox
    And The client clicks on login button
      #  6) Click on login button
      #  7) User must successfully login to the web page
    And The client clicks on MyAccount link
      #  8) Click on Myaccount link which leads to Dashboard
    Then Verifies that the Dashboard is visible for the client
      #  9) User must view Dashboard of the site


  @MyAccount @Orders
  Scenario: Access to the orders successfully.
      #2. My Accounts-Orders
    Given The client is on bookstore page
      #  1) Open the browser
      #  2) Enter the URL “http://practice.automationtesting.in/”
    When The client clicks on My Account on the menu bar
      #  3) Click on My Account Menu
    And The client enters pepe in username textbox
      #  4) Enter registered username in username textbox
    And The client enters testing123 in password textbox
      #  5) Enter password in password textbox
    And The client clicks on login button
      #  6) Click on login button
      #  7) User must successfully login to the web page
    And The client clicks on MyAccount link
      #  8) Click on Myaccount link which leads to Dashboard
    And The Client clicks on Orders link
      #  9) Click on Orders link
    Then Verifies that the Orders are visible for the client
      #  10) User must view their orders on clicking orders link



  @MyAccount @LogOut
  Scenario: Access to the Dashboard successfully.
      #8. My Accounts-Log-Out
    Given The client is on bookstore page
      #  1) Open the browser
      #  2) Enter the URL “http://practice.automationtesting.in/”
    When The client clicks on My Account on the menu bar
      #  3) Click on My Account Menu
    And The client enters pepe in username textbox
      #  4) Enter registered username in username textbox
    And The client enters testing123 in password textbox
      #  5) Enter password in password textbox
    And The client clicks on login button
      #  6) Click on login button
      #  7) User must successfully login to the web page
    And The client clicks on MyAccount link
      #  8) Click on Myaccount link which leads to Dashboard
    And The client clicks on Logout button
      #  9) Click on Logout button
    Then Verifies that the client has successfully logout
      #  10) On clicking logout,User successfully comes out from the site
