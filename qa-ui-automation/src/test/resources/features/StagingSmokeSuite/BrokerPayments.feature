@tag
Feature: BrokerPayments.feature
 
   @BROKERPAYMENTS
    Scenario Outline: Login as Broker User and validate the appearence of Broker Payments 
       Given admin Login to the application with valid <userName> and <password>
       And I search for firstbroker <firstBroker> and login to the firstbroker portal
       And I click Payments link and  Validate the Payments information details appears correctly
       
       
       
    Examples: 
      | userName   | password                |   firstBroker|
      | vignesh    | 0$B4h1rn3XG_gZS+mF-PitDf|  Vigneshbroker1|   