@tag
Feature: singletest.feature

     
   @SINGLE
    Scenario Outline: Validate truck report page
       Given Login to the application with valid <userName> and <password>
       And I click the OrderDashboard link in FOB home page 
       And I click truck scedule page 
       And I click Truck report in truck scedule page
       And I select add a receipient or select an existing recepient and send truck report to the recepient
       And I click Truck report in truck scedule page
       And I reset the truckreport to original status
       
       Examples:
       | userName    | password     |customername|startlocation| destination  | contactnumber       | address                              |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  |vigeshcompany|VigneshPlant| VigneshPlant | 8572688987     | 12 Andover Road, Billerica, MA, USA  |   1       |      1         |
   