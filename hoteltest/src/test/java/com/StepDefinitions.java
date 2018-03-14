package com;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

import org.hamcrest.CoreMatchers;
import  com.Baseclass;
import com.loginPage;


public class StepDefinitions extends Baseclass {



    @Given("User is on Hotel application login page")
   public void setup() {
            initialiseDriver();
    }
    @When("User enters Login and Password")
    public void user_enter( String Username,String Password) {
            loginPage.enterloginDetails( Username,Password);
           }
    @Then("User should see hotel entries")
           public void seehotelentries(String expectedOutput) {
             assertThat(ExpectedValue.equals(ActualValue));
    }
    @Given("user sees hotel entry list")
           public void checkhotelentrylist(){

    }

    @When("User enter create Entry")
    public void user_enter(String  hotel, String address, String owner, String number, String email) {
        loginPage.enterhotelname(hotel, address, owner, number, email);

        loginPage.clickCreate();
    }
    @Then("User should see Hotel name")
    public void verify hotel name(String Expected hotel name)
    {
        assertThat(expectedValue.equals(ActualValue));
    }

    @Given("User is in hotel entry Page")
    public void hotelnameExists() {

    }
    @When("User deletes entry")
    public void deleteentry(String entry) {
               loginPage.deleteHotelentry();
           }

    @Then("hotel entry should be deleted")
    public void confirmdeletion(String hotel) {
              loginPage.hotelnamedelteconfirmation());
    }



}
