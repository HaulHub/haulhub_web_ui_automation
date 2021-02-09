@tag
Feature: ConsumerEticketing.feature
 
    @CONSUMERETICKETINGFEATURE
    Scenario Outline: Validate Ability for Producer to invite Consumer to E-ticketing with a JOBslip customer doesn't exist yet
       Given admin Login to the application with valid <userName> and <password>
       And I search for customer<customername> and login to the customers portal
       And I click the OrderDashboard link in FOB home page 
       And I go to ETicket manage customers page
       And I invite a new ETicket customer by Typing in a new HaulHub Customer name
       
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | vignesh | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |

 
   
    @CONSUMERETICKETINGFEATURE
    Scenario Outline: Validate Ability to edit the newly created E-Ticketing Consumer
    And I edit the newly created E-Ticketing Consumer
     
       
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | vignesh | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
   


   
      
     