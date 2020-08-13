@tag
Feature: SINGLE.feature

        
      @SINGLE
    Scenario Outline: Validate clicking New Order button within Truck Scedule page and launching order modal window
       Given Login to the application with valid <userName> and <password>
       And I click the OrderDashboard link in FOB home page 
       Given I click within truck scedule page the New order button
       Then I see the New Material order modal windown opened
     
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
  
          
          