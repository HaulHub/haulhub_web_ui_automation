@tag
Feature: singletest.feature

  @SINGLE
  Scenario Outline: Validate ability to Create Material order and Add trucks,fleets and be able to validate sent SMS messages to Truck drivers
    Given Login to the application with valid <userName> and <password>
    And I click the OrderDashboard link in FOB home page
    And I Go to Manage Customers page 
    And I Add a new customer and validate the customer was added successfully  
    And I Edit update the created customer and confirms customer is reflected with updatedname
    And I Delete the updated customer name from the list
  
   
     Examples: 
      | userName   | password          | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | 10 Wheel             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
       