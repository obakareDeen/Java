package com.cucumber.stepdefinitions.stepdef1;

import com.cucumber.libs.Names;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitions1 {
	private Names name = new Names();
	
	@Given("^That my name is deen$")
	public void that_my_name_is_deen() throws Throwable {
	    name.deen();
	}

	@Then("^I think my name should be deen$")
	public void i_think_my_name_should_be_deen() throws Throwable {
	    name.shouldBeDeen();
	}
}
