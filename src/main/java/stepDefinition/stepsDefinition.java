package stepDefinition;

import org.junit.Assert;

import ObjectPage.HomePageObjects;
import cucumber.api.java.en.*;

public class stepsDefinition {

	HomePageObjects hp;
	
	@Given("^user navigates to HomePage$")
	public void user_navigates_to_HomePage() throws Throwable {
		hp = new HomePageObjects();
	}

	@When("^user enters the \"([^\"]*)\" in the subscription box$")
	public void user_enters_the_in_the_subscription_box(String arg1) throws Throwable {
		 hp.setnewsLetter(arg1) ;
	}

	@When("^clicks on next$")
	public void clicks_on_next() throws Throwable {
		 hp.clickNext();
	}

	@Then("^subscription message should be displayed$")
	public void subscription_message_should_be_displayed() throws Throwable {
		 Assert.assertTrue(hp.newsLetterSuccess().contains("You have successfully subscribed " ));
		  
}
	
}
	
	
	
	
	
	
	



