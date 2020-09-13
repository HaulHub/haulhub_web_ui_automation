@tag
Feature: SINGLE.feature

     
    @SINGLE 
    Scenario Outline: Validate ability to open the truck matching page without issues
       Given admin Login to the application with valid <userName> and <password>
       And I search for customer<customername> and login to the customers portal
       And I click the OrderDashboard link in FOB home page 
       And I launch the Truckmatching screen and validate it opens correctly
       
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |

   