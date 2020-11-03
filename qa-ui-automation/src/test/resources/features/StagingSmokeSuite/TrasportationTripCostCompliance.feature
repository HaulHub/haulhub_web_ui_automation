@tag
Feature: TrasportationTripCostCompliance.feature
 
   @TRANSPORTTRIPCOSTCOMPLIANCE
    Scenario Outline: Login as user Customer and check the Tripcost modal window opens correctly
       Given Login to the application with valid <userName> and <password>
       And I click the tripcostmodal window against jobnumber within JobBoard
      
       Examples:
       | userName    | password           |  jobnumber     |                                                                          
       | 8572688987  | haul-Quality!0501  |  51568          | 
   
  