@tag
Feature: CustomerBrokerFleet.feature

  @BROKERWORKFLOW1
      Scenario Outline: Validate as a customer ability to assign 6 different fleets with 5  assigned to first Broker and one more assigned to general pool
       Given Login to the application with valid <userName> and <password>
       And I click the OrderDashboard link in FOB home page 
       And I click the New Order button
       When I click Materials Only button in the New Order dialog box
       And I fill order details for CustomerName <customername> and StartingLocation <startlocation> details
       And I fill Load Today date time and Continue to Destination filling tab
       And I fill Destination Tab field destination <destination> and contactnumber <contactnumber> and address <address> details
       And I fill Material tag field Tonnage <Tonnage> and ProductionRate <ProductionRate> and details and Place order
       And I grab the Orderid associated with the newly created offer
       And I click Truck Scedule page and click Add Trucks against my created order
       And I fill the Truck form details worktype<WorkType> and Acceptabletrucktypes <Acceptabletrucktypes> and Trucksrequired<Trucksrequired> and Truckbilling<Truckbilling> details
       And I enter all 6 Fleet details as customer with 5 fleets to firstbroker <firstBroker> and click sendinvites button
       Then I see a message notification sent to Driver for acceptance
        
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet      |firstBroker|
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billeqvwgvgvvb1hbht36e3ttttttrica, MA, USA |       1 |              1 | Construction | Paver            |              6 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|

   @BROKERWORKFLOW1
    Scenario Outline: Validate ability to login as First Broker and see the assigned shifts under needs review section under Customer Jobs section
       Given admin Login to the application with valid <userName> and <password>
       And I search for firstbroker <firstBroker> and login to the firstbroker portal
       And I click the Dashboard link in Firstbroker home page and validate assigned shifts displays under review section of Customer Jobs section
       
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|

     @BROKERWORKFLOW1
    Scenario Outline: Validate First Broker can view customer truck rate select all 5 shifts within the Review Job modal Accept and Assign Drivers
       And as first broker I click the assigned shifts view customer truck rate and  select all the 5 shifts and Accept to assign drivers
       
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
   
     @BROKERWORKFLOW1
    Scenario Outline: First Broker assigns 1 shift to Internal truck and 3 shifts to secondbroker and then declines the last shift
       And as first broker I assign 1 shift to Internal truck and 3 shifts to secondbroker and then declines the last shift
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
     
      @BROKERWORKFLOW1
    Scenario Outline: First Broker could view the declined and generalpool shift appearing under the MarketPlace section of MarketPlace Jobs Header
       And as first broker I view the declined and generalpool shift appearing under the MarketPlace section of MarketPlace Jobs Header
       
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
     
      @BROKERWORKFLOW1
    Scenario Outline: Login to Customer portal and validate the shift declined by firstbroker is now set back to general pool within Truck Scedule page
        Given Login to the application with valid <userName> and <password>
        And I click the OrderDashboard link in FOB home page 
        And I click the Truck Scedule page
        And I validate the validate the shift declined by firstbroker is now set back to general pool
       
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | 8572688987 | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
     
      @BROKERWORKFLOW1
    Scenario Outline: Validate ability to login as Second Broker and see the assigned shifts under needs review section under Customer Jobs section
       Given admin Login to the application with valid <userName> and <password>
       And I search for secondbroker <SecondBroker> and login to the secondbroker portal
       And I click the Dashboard link in Secondbroker home page and validate assigned shifts displays under review section of Customer Jobs section
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |SecondBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany   |Vigneshbroker2|
      
      @BROKERWORKFLOW1
    Scenario Outline: Validate Second Broker can view first broker rate and select all his assigned 3 shifts within the Review Job modal and Accepts
      And as second broker I view the first broker rate then click the assigned shifts and select all the 3 shifts and click accept
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
   
     @BROKERWORKFLOW1
    Scenario Outline: Validate Second Broker can click Accept later button under jobs under the notsourced section
      And as second broker I click Accept later button under Customer jobs Section 
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
      
     @BROKERWORKFLOW1
    Scenario Outline: Validate as second broker within Job management  click the sceduler and assign 1 shift to internal truck  and one shift to fleet
      And as second broker within Job management  click the sceduler and assign 1 shift to internal truck  and one shift to fleet
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
   
    @BROKERWORKFLOW1
    Scenario Outline: Validate as first broker i am able to see the shift declined by second broker within the Not sourced section of First Broker Dashboard
       Given admin Login to the application with valid <userName> and <password>
       And I search for firstbroker <firstBroker> and login to the firstbroker portal
       And I click the Dashboard link in Firstbroker home page and validate shift declined by second broker within the Not sourced section of First Broker Dashboard
       
    Examples: 
      | userName   | password       |   firstBroker|
      | vignesh | haul-Quality!0501 |  Vigneshbroker1|      
     
     @BROKERWORKFLOW1
    Scenario Outline: Validate as fleet i am able to see the shifts assigned by second broker to fleet and also view the rates assigned by Second broker
       Given admin Login to the application with valid <userName> and <password>
       And I search for fleetname <fleetname> and login to the fleetcompany portal
       And as fleetcompany I view the Second broker rate then click the assigned shifts by Second Broker and assign drivers
    
    Examples: 
      | userName   | password          |fleetname        | 
      | vignesh    | haul-Quality!0501 | Vigneshcompany  |
      
     @BROKERWORKFLOW1
    Scenario Outline: Validate as Second Broker I am able to see the driver name against the shift assigned to Fleet company with in Sceduler page
       Given admin Login to the application with valid <userName> and <password>
       And I search for secondbroker <SecondBroker> and login to the secondbroker portal
       And I view the drivername <drivername> appearing correctly within scedulerpage of second broker
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |SecondBroker  | drivername   |
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany   |Vigneshbroker2| Vignesh Nehru |
      
      
   @FOBSMOKETESTSUITE
    Scenario Outline: Login as Customer and Cancel the original order created 
       Given Login to the application with valid <userName> and <password>
       And I click the OrderDashboard link in FOB home page 
       And I Cancel the sceduled Order as finalcleanup
     
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
     
      