Feature: What type of NHS cost help can get for a person in Wales
  @smoke
  Scenario: Types of NHS cost help available for a person in Wales
    Given I am in home page
    When I click on start btn
    And I click on Wales btn
    And I click on where you live page next btn
    Then I am in date of birth page
    When I enter day of birth as "10"
    And I enter month of birth as "05"
    And I enter year of birth as "1985"
    And click on next btn of date of birth page
    Then I am in do you live with a partner page
    When I click on no partner
    And I click on next btn of a partner page
    Then I can see Do you claim any benefits or tax credits? page
    When I click on no claim benefits
    And I click on next btn of claim any benefits page
    Then I can see are you pregnant page
    When I click on no pregnancy btn
    And I click on pregnant page next btn
    Then I can see do you have an injury caused by armed forces page
    When I click on no injury caused armed forces btn
    And I click on injury caused by armed forced page next btn
    Then I can see do you have diabetes page
    When I click on no diabetes btn
    And I click on diabetes page next btn
    Then I can see do you or family member have glaucoma page
    When I click on have glaucoma no btn
    And I click on have glaucoma page next btn
    Then I can see do you live in a care home page
    When I click on live in care home no btn
    And click on live in a care home page next btn
    Then I can see do you have savings page
    When I click on savings no btn
    And click on savings page next btn
    Then I can see "You get help with NHS costs"






