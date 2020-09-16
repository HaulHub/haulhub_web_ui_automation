@tag
Feature: SINGLE.feature

     
 
     
       @SINGLE
    Scenario Outline: Validate ability to login as Second Broker and see the assigned shifts under needs review section under Customer Jobs section
       Given admin Login to the application with valid <userName> and <password>
       And I search for secondbroker <SecondBroker> and login to the secondbroker portal
       And I click the Dashboard link in Secondbroker home page and validate assigned shifts displays under review section of Customer Jobs section
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |SecondBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany   |Vigneshbroker2|
      
       @SINGLE
    Scenario Outline: Validate Second Broker can select all his assigned 3 shifts within the Review Job modal Accept 
      And as second broker I click the assigned shifts and select all the 3 shifts and click accept
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
   
     @SINGLE
    Scenario Outline: Validate Second Broker can click Accept later button under jobs under the notsourced section
      And as second broker I click Accept later button under Customer jobs Section 
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
      
      @SINGLE
    Scenario Outline: Validate as second broker within Job management  click the sceduler and assign 1 shift to internal truck  and one shift to fleet
      And as second broker within Job management  click the sceduler and assign 1 shift to internal truck  and one shift to fleet
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
   