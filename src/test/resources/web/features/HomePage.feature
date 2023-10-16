@HomePage

  Feature: Scenarios de la Home Page

  @Slider
  Scenario: Home Page with three Sliders only
    Given The client is on Home Page
    When The client click on Shop menu
    And The client click on Home menu
    Then The client see 3 Sliders only

  @Arrival
  Scenario Outline: Home page - Images in Arrivals should navigate
    Given The client is on Home Page
    When The client click on Shop menu
    And The client click on Home menu
    And The client click on first arrival
    Then The client is redirected to the page <url>
    Examples:
      | url                                                          |
      | https://practice.automationtesting.in/product/selenium-ruby/ |

  #SHOP-PAGE
    @Categories
    Scenario Outline: Shop-Product Categories Functionality
      Given The client is on Home Page
      When The client click on Shop menu
      And The client clicks on the first item in the product list
      Then The client is redirected to the page <url>
      Examples:
        | url                                                                      |
        | https://practice.automationtesting.in/product/android-quick-start-guide/ |

  #SHOP-PAGE
    @Dropdown
    Scenario Outline: Shop-Default Sorting Functionality
      Given The client is on Home Page
      When The client click on Shop menu
      And The client click on dropdown
      And The cliente clicks on option <Option>
      Then The client is redirected to the page <url>
      Examples:
        | Option     | url                                                            |
        | popularity | https://practice.automationtesting.in/shop/?orderby=popularity |
        | rating     | https://practice.automationtesting.in/shop/?orderby=rating     |
        | date       | https://practice.automationtesting.in/shop/?orderby=date       |
        | price      | https://practice.automationtesting.in/shop/?orderby=price      |
        | price-desc | https://practice.automationtesting.in/shop/?orderby=price-desc |


  #MY ACCOUNT - LOGIN
  @Login
  Scenario Outline: Log-in with valid username and password
    Given The client is on Home Page
    When The client click on My Account
    And The client completes the Username field with the value <Username>
    And The client completes the Password field with the value <Password>
    And The client click on Login
    Then The client logs into his account
    Examples:
      | Username          | Password    |
      | lugo.fd@gmail.com | AlgunRayo73 |

  @IncorrectValuesLogin
  Scenario Outline: Log-in with incorrect username and incorrect password
    Given The client is on Home Page
    When The client click on My Account
    And The client completes the Username field with the value <Username>
    And The client completes the Password field with the value <Password>
    And The client click on Login
    Then The client sees an incorrect user massage
    Examples:
      | Username          | Password    |
      | lugo.fe@gmail.com | AlgunRayo72 |






