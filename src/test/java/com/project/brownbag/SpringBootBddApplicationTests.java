package com.project.brownbag;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.project.brownbag", plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
public class SpringBootBddApplicationTests {

	@Test
	public void contextLoads() {
	}

}
