package com.project.brownbag;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Created by Avitesh Kesharwani on 05/28/2019.
 */

public class RestAssuredConfiguration {

	public void configure() {
		RestAssured.baseURI = "http://http://localhost";
		RestAssured.port = 8080;
		// RestAssured.basePath = "/books";
	}

	public RequestSpecification getRequestSpecification() {
		return RestAssured.given().contentType(ContentType.JSON);
	}

	public Response getResponse(RequestSpecification requestSpecification, String endpoint, int status) {
		Response response = requestSpecification.get(endpoint);
		Assert.assertEquals(response.getStatusCode(), status);
		response.then().log().all();
		return response;
	}
}
