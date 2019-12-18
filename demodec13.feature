Feature: Refund of a product

Background: 
   Given online store is open
   
@RegressionTest
Scenario Outline: Refund of a microwave
Given Sara purchased microwave for <price> dollors
And she has a receipt
When Sara returns damaged microwave
Then Sara should get refund of <price> dollors

Examples:
|price|
|100|
|50|

@Data
Scenario: Datatable data
Given Mike provides customerdetails
|Mike|John|BDC|India|
|Mary|jane|HDC|India|
|Peter|Parker|PDC|India|

@FunctionalTest @RegressionTest
Scenario: Refund of gift voucher
Given Mike purchased gift voucher 
