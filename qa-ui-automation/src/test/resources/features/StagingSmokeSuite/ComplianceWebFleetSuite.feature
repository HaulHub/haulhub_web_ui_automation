@tag
Feature: ComplianceWebFleetSuite.feature
 
     @COMPLLIANCEWEBFLEET
    Scenario Outline: Validate as fleet I am able to see Certified Payroll Documents within the fleetinbox
       Given admin Login to the application with valid <userName> and <password>
       And I search for fleetname <fleetname> and login to the fleetcompany portal
       And I am able to see the Certified Payroll documents button 
    
    Examples: 
      | userName   | password          |fleetname        | 
      | vignesh    | 0$B4h1rn3XG_gZS+mF-PitDf | Vigneshcompany  |
      
      @COMPLLIANCEWEBFLEET
    Scenario Outline: Validate as fleet I am able to see Trucks and Drivers details
        And I am able to see the Trucks and Drivers details
        
     Examples: 
      | userName   | password          |fleetname        | 
      | vignesh    | 0$B4h1rn3XG_gZS+mF-PitDf | Vigneshcompany  |
        
        
      @COMPLLIANCEWEBFLEET
    Scenario Outline: Validate as fleet I am able to add and see Insurance Agent details
        And I am able to add and see Insurance Agent details
      
      Examples: 
      | userName   | password          |fleetname        | 
      | vignesh    | 0$B4h1rn3XG_gZS+mF-PitDf | Vigneshcompany  |