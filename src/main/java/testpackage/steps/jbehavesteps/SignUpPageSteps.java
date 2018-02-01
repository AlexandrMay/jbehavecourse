package testpackage.steps.jbehavesteps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import testpackage.steps.serenitysteps.SignUpSteps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class SignUpPageSteps {

    @Steps
    SignUpSteps steps;

    public SignUpPageSteps() throws MalformedURLException {
    }

    @Given("I open signup page")
    public void openPage() {
        steps.aaa();
    }

    @When("I set date: $table")
    public void setDate(ExamplesTable table) {
        Map<String, String> date = table.getRow(0);
        if (table.getHeaders().contains("month")) {
        steps.set_month(date.get("month"));
        }
        steps.set_year(date.get("year"));
        steps.set_day(date.get("day"));
    }

    @When("I set month \"$month\"")
    public void setMonth(String month) {
        steps.set_month(month);
    }

    @When("I set day \"$day\"")
    public void setDay (String day) {
        steps.set_day(day);
    }

    @When("I set year \"$year\"")
    public void setYear(String year) {
        steps.set_year(year);
    }

    @When("I check share")
    public void checkShare() {
        steps.set_share(true);
    }

    @When("I uncheck share")
    public void uncheckShare() {
        steps.set_share(false);
    }

    @When("I type email \"$email\"")
    public void typeEmail(String mail) {
        steps.type_email(mail);
    }

    @When("I type confirmation email \"$mail\"")
    public void typeEmailConfirmation(String mail) {
        steps.type_confirmation_email(mail);
    }

    @When("I type name \"$name\"")
    public void typeName(String name) {
        steps.type_mane(name);
    }

    @When("I type password \"$password\"")
    public void typePassword(String password) {
        steps.type_password(password);
    }

    @When("I click signup")
    public void clickSignUp() {
        steps.click_SignUp();
    }

    @When("I select sex \"$sex\"")
    public void selectSex(String sex) {
        steps.select_sex(sex);
    }

    @Then("I see error \"$message\"")
    public void shouldSeeErrorByText (String text) {
        steps.should_see_error(text);
    }

    @Then("I do not see error \"$message\"")
    public void shouldNotSeeErrorByText (String text) {
        steps.should_not_see_error(text);
    }

    @Then("I see \"$value\" errors")
    public void shouldSeeErrorsCount (int value) {
        steps.should_see_errors_count(value);
    }

    @Then("I see that \"$value\" error has text \"$message\"")
    public void shouldSeeErrorByNumber (String message, int value) {
        steps.should_see_error_by_number(value,message);
    }
}
