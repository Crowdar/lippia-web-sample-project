@Bookstore @Prueba
Feature: As a customer from the bookstore page I want to login in my account properly

  @MyAccount @Login @Success @Smoke
  Scenario: Login success with valid username and password.
    Given The client is on bookstore page
    When The client clicks on My Account on the menu bar
    And The client enters testuser01-automation@yopmail.com in username textbox
    And The client enters Testinmg1245 in Password textbox
    And The client clicks on login button
    Then Verifies that the client navigates to my-account page


  @MyAccount @Login @Failed
  Scenario: Login fail with incorrect username and password.
    Given The client is on bookstore page
    When The client clicks on My Account on the menu bar
    And The client enters pedro in username textbox
    And The client enters testuser02-automation@yopmail.com in username textbox
    And The client enters Testing123 in Password textbox
    And The client clicks on login button
    Then Displays a message error with the text Error: A user could not be found with this email address.
    And Displays the login form for retrying login


  @MyAccount @Login @Failed
  Scenario: Login fail with correct username and empty password.
    Given The client is on bookstore page
    When The client clicks on My Account on the menu bar
    And The client enters testuser01-automation@yopmail.com in username textbox
    And The client enters  in Password textbox
    And The client clicks on login button
    Then Displays a message error with the text Error: Password is required.
    And Displays the login form for retrying login
