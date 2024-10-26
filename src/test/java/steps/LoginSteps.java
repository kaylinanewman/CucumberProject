package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;
import java.time.Duration;


public class LoginSteps extends CommonMethods {

    @Given("user can access HRMS portal")
    public void userCanAccessHRMSPortal() {
        openBrowserAndLaunchApplication();
    }
    @When("user attempts to login with an incorrect userName")
    public void userAttemptsToLoginWithAnIncorrectUserName() {
        sendText(ConfigReader.read("password"), loginPage.userNameField);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
      loginPage.loginButton.click();
    }
    @Then("user can visibly see displayed error message errorMessage")
    public void user_can_visibly_see_displayed_error_message_error_message() {
   String actualMessage = loginPage.errorMessage.getText();
   Assert.assertEquals("Invalid Credentials", actualMessage);
    }

    @When("user attempts to login with an incorrect password")
    public void userAttemptsToLoginWithAnIncorrectPassword() {
    }

}