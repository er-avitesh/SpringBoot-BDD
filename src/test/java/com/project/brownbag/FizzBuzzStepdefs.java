package com.project.brownbag;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FizzBuzzStepdefs {

	FizzBuzz fizzBuzz;
	String result;

	@Given("^Create a FizzBuzz game play$")
	public void create_a_fizzbuzz_game_play() throws Throwable {
		fizzBuzz = new FizzBuzz();
	}

	@When("^I play with number (\\d+)$")
	public void i_play_with_number(int number) throws Throwable {
		result = fizzBuzz.play(number);
	}

	@Then("^The result is \"([^\"]*)\"$")
	public void the_result_is_something(String resultString) throws Throwable {
		Assert.assertEquals(result, resultString);
	}
}
