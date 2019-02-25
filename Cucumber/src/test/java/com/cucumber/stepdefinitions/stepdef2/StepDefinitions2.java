package com.cucumber.stepdefinitions.stepdef2;

import com.cucumber.libs.Names;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitions2 {
	private Names name = new Names();
	@Given("^That my name is rose$")
	public void that_my_name_is_rose() throws Throwable {
	    name.rose();
	}

	@Then("^I think my name should be rose$")
	public void i_think_my_name_should_be_rose() throws Throwable {
	    name.shouldBeRose();
	}
}
