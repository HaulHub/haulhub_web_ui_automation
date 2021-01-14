@tag
Feature: singletest.feature

  @SINGLETEST
  Scenario Outline: Validate as Second Broker I am able to see the driver name against the shift assigned to Fleet company with in Sceduler page
    Given admin Login to the application with valid <userName> and <password>
    And I search for secondbroker <SecondBroker> and login to the secondbroker portal
   

    Examples: 
      | userName | password          | customername | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          | SecondBroker   | drivername    |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | alisa        | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver                |              1 | vigneshcompany | VigneshCompany | VigneshCompany | Vigneshbroker2 | Vignesh Nehru |
