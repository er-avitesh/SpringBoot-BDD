package com.project.brownbag;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.springframework.http.HttpStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AccountStepdefs {

	Response response;
	String url;
	Account[] account;
	RequestSpecification requestSpecification = new RestAssuredConfiguration().getRequestSpecification();

	@Given("^the apis are up and running for \"([^\"]*)\"$")
	public void the_apis_are_up_and_running(String url) throws Throwable {
		this.url = url;
		response = RestAssured.given().accept(ContentType.JSON).get(url);
		Assert.assertThat(response.getStatusCode(), Matchers.equalTo(200));
	}

	@When("^CustomerId is \"([^\"]*)\"$")
	public void CustomerID_is(String customerID) throws Throwable {
		requestSpecification.pathParam("CustomerID", customerID).log().all();
	}

	@And("^a user performs a get request to \"([^\"]*)\"$")
	public void a_user_performs_a_get_request(String getCustomerEndpoint) throws Throwable {
		account = RestAssured.given().spec(requestSpecification).get(this.url + getCustomerEndpoint).then().assertThat()
				.statusCode(HttpStatus.OK.value()).extract().as(Account[].class);
	}

	@Then("^the Customer Should be \"([^\"]*)\"$")
	public void the_Customer_Should_be(String customerName) throws Throwable {
		System.out.println("hey");
		Assert.assertThat(account[0].getName(), Matchers.equalTo(customerName));
	}
}
