Feature: Validating all Functions of Adactin Application

  @smoke
  Scenario: Validating login function of Adactin with valid Username and Valid Password
    Given I am on a Adactin page on Chrome Browser
    When I need to enter Username and Password
    And I need to click Login button
    Then I need to verify the Hotel Booking page Screen appear or not

  @sanity
  Scenario: Validating login function of AdactIn with Valid Username and Valid Password
    Given I am on a Adactin page on Chrome Browser
    When I need to enter Username and Password
      | Username | Password |
      | Hameeddd | Hameeddd |
      
    And I need to click Login button
    Then I need to verify the Home page Screen appear or not
    When I need to select Location , Hotel , Room Type , No of rooms
      | London | Hotel Cornice | Super Deluxe |  1 - One  |
    And Enter checkin date and Checkout date
      | checkin date |18/12/2021|
      | Checkout date |23/12/2021|
    Then I need to select Adults per room and Childrens per room
      | Adults per room | 4 - Four |
      | Childrens per room |1 - One|
    And I need to click Search button
    Then I need to verify whether browser navigated to payment page
    When I need to select the booking and click continue
    Then I need to check browser navigated to next page
    When I need to enter Firstname , lastname , Address and Credit Card No
      | Firstname | lastname | Address | Credit Card No |
      | Hameed | Hussain | Pudupet | 7894789478947894 |
      
    And Select card type , Expiry date and Expiry year
      | Select card type | Expiry date | Expiry year |
      | VISA | June | 2022 |
      
    Then I need to enter Cvv no and click book now
      | Cvv no |123 |
    Then I need to check browser navigated to next page
    When I need to click itenarary and navigte to next page
    When Need to print the ID

  @regression
  Scenario Outline: Validating login function of AdactIn with Valid Username and Valid Password
    Given I am on a Adactin page on Chrome Browser
    When I need to enter "<Username>" and "<Password>"
    And I need to click Login button
    Then I need to verify the Home page Screen appear or not
    When I need to select "<Location>" , "<Hotel>" , "<Room Type>" , "<No of rooms>"
    And Enter "<checkin date>" and "<Checkout date>"
    Then I need to select "<Adults per room>" and "<Childrens per room>"
    And I need to click Search button
    Then I need to verify whether browser navigated to payment page
    When I need to select the booking and click continue
    Then I need to check browser navigated to next page
    When I need to enter "<Firstname>" , "<lastname>" , "<Address>" and "<Credit Card No>"
    And "<Select card type>" , "<Expiry date>" and "<Expiry year>"
    Then I need to enter "<Cvv no>" and click book now
    Then I need to check browser navigated to next page
    When I need to click itenarary and navigte to next page
    When Need to print the ID

    Examples: 
      | Username | Password | Location | Hotel         | Room Type    | No of rooms | checkin date | Checkout date | Adults per room | Childrens per room | Firstname | lastname | Address | Credit Card No   | Select card type | Expiry date | Expiry year | Cvv no |
      | Hameeddd | Hameeddd | London   | Hotel Cornice | Super Deluxe | 1 - One     | 08/12/2021   | 11/12/2021    | 4 - Four        | 1 - One            | Hameed    | Hussain  | Pudupet | 7894789478947894 | VISA             | June        |        2022 |    123 |
      
    @retest  
    Scenario Outline: Validating login function of AdactIn with Valid Username and Valid Password
    Given I am on a Adactin page on Chrome Browser
    When I need to enter "<Username>" and "<Password>"
    And I need to click Login button
    Then I need to verify the Home page Screen appear or not
    When I need to select "<Location>" , "<Hotel>" , "<Room Type>" , "<No of rooms>"
    And Enter "<checkin date>" and "<Checkout date>"
    Then I need to select "<Adults per room>" and "<Childrens per room>"
    And I need to click Search button
    Then I need to verify whether browser navigated to payment page
    When I need to select the booking and click continue
    Then I need to check browser navigated to next page
     When I need to enter Firstname , lastname , Address and Credit Card No
      | Firstname | lastname | Address | Credit Card No |
      | Hameed | Hussain | Pudupet | 7894789478947894 |
      
    And Select card type , Expiry date and Expiry year
      | Select card type | Expiry date | Expiry year |
      | VISA | June | 2022 |
      
    Then I need to enter Cvv no and click book now
      | Cvv no |123 |
    Then I need to check browser navigated to next page
    When I need to click itenarary and navigte to next page
    When Need to print the ID  
      
     Examples: 
    | Username | Password | Location | Hotel         | Room Type    | No of rooms | checkin date | Checkout date | Adults per room | Childrens per room |   
    | Hameeddd | Hameeddd | London   | Hotel Cornice | Super Deluxe | 1 - One     | 08/12/2021   | 11/12/2021    | 4 - Four        | 1 - One            |  
      
      
      
