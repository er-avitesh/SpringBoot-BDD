#Author: Avitesh.Kesharwani@capgmeini.com
#Keywords Summary : BDD, SpringBoot,BrownBag,RestAssured
Feature: Account Service

  Scenario: Get Customer from CustomerId
    Given the apis are up and running for "http://localhost:8080/"
    When CustomerId is "15478966"
    And a user performs a get request to "app/getAccount/{CustomerID}"
    Then the Customer Should be "Steve"
    
	Scenario: Validate Customer Count
    Given the apis are up and running for "http://localhost:8080/"
    And a user performs a get request to "app/getAccounts"
    Then the Customer Should be "Steve"
