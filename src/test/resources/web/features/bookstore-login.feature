@Bookstore
Feature: As a customer from the bookstore page I want to login in my account properly

  @MyAccount @Login @Success @Smoke
  Scenario: Login success with valid username and password.
      #1. Log-in with valid username and password.
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
    Then Verifies that the client has successfully login
      #  7) User must successfully login to the web page


  @MyAccount @Login @Failed
  Scenario: Login fail with incorrect username and password.
      #2. Log-in with incorrect username and incorrect password.
    Given The client is on bookstore page
      #  1) Open the browser
      #  2) Enter the URL “http://practice.automationtesting.in/”
    When The client clicks on My Account on the menu bar
      #  3) Click on My Account Menu
    And The client enters pedro in username textbox
      #  4) Enter incorrect username in username textbox
    And The client enters test456 in password textbox
      #  5) Enter incorrect password in password textbox.
    And The client clicks on login button
      #  6) Click on login button
    Then Verifies that the message with the text "Error: The password you entered for the username pedro is incorrect. Los your password?" is displayed on the login page
      #  7) Proper error must be displayed(ie Invalid username) and prompt to enter login again


  @MyAccount @Login @Failed
  Scenario: Login fail with correct username and empty password.
      #  3. Log-in with correct username and empty password.
    Given The client is on bookstore page
      #  1) Open the browser
      #  2) Enter the URL “http://practice.automationtesting.in/”
    When The client clicks on My Account on the menu bar
      #  3) Click on My Account Menu
    And The client enters pepe in username textbox
      #  4) Enter valid username in username textbox
    And The client enters "" in password textbox
      #  5) Now enter empty password in the password textbox
    And The client clicks on login button
      #  6) Click on login button
    Then Verifies that the message with the text "Error: Password is required." is displayed on the login page
      #  7) Proper error must be displayed(ie Invalid password) and prompt to enter login again
