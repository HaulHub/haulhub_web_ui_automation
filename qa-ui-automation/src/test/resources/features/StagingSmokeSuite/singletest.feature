@tag
Feature: singletest.feature

  @SINGLE
  Scenario Outline: Validate ability to Create Material order and Add trucks,fleets and be able to validate sent SMS messages to Truck drivers
    Given Login to the application with valid <userName> and <password>
    And I click the FOB Materials logo
    And I click add a job site button
    When I enter jobsitename <jobsitename> and onsitecontactname <onsitecontactname> and phonenumber <phonenumber> and address <address> details and save the jobsite
    Then I see the Created Jobsite name appears correctly
    
  
     Examples: 
      | userName   | password          | jobsitename    | onsitecontactname |  phonenumber   | address                             | 
      | 8572688987 | haul-Quality!0501 | vigneshcompany | Vig               |  8572688987    | 12 Andover Road, Billerica, MA, USA |