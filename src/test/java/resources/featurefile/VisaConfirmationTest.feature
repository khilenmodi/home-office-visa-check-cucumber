@regression
Feature: VisaConfirmationTest
  As user I want to login into gov.uk website
@sanity
  Scenario: anAustralianComingToUKForTourism
    Given I am on homepage
    When  I click on start button
    And   Select a Nationality "Australia"
    And   Click on Continue button
    And   Select  a reason "Tourism or visiting family and friends"
    And   Click on Continue button
    Then  verify result "You will not need a visa to come to the UK"
@smoke
Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths
  Given I am on homepage
  When  I click on start button
  And  Select a Nationality "Chile"
  And   Click on Continue button
  And  Select  a reason "Work, academic visit or business"
  And   select Continue button
  And   Select intendent to stay for "more"
  And   Click next step button
  And   Select have planning to work for "Health and care professional"
  And   Click Continue
  Then  verify  a result "You need a visa to work in health and care"

 @regression
  Scenario:aCongoNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card
    Given I am on homepage
    When  I click on start button
    And  Select a Nationality "Congo"
    And   Click on Continue button
    And   Select  a reason "Join partner or family for a long stay"
    And   select Continue button
    And  Select state My partner of family member have uk immigration status "yes"
    And  Set Click To Continue
    Then  verify The result "You’ll need a visa to join your family or partner in the UK"

