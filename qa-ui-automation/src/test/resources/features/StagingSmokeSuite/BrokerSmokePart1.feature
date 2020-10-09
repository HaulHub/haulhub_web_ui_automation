@tag
Feature: BrokerSmokePart1.feature

    @BROKERSMOKEPART1
    Scenario Outline: Validate ability to login as First Broker and create a new customer
       Given admin Login to the application with valid <userName> and <password>
       And I search for firstbroker <firstBroker> and login to the firstbroker portal
       And I enter customer details and create a customer and click to view the newly created customer profile
       
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                         | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet |firstBroker|
      | vignesh | haul-Quality!0501 | alisa  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |Vigneshbroker1|
