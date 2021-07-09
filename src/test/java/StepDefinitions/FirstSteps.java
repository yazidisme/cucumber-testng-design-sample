package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstSteps {
    @Given("Start with valid data input")
    public void startWithValidDataInput() throws InterruptedException {
        Thread.sleep(1000);
    }

    @When("It's processing")
    public void itSProcessing() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("Output should be equal expected result")
    public void outputShouldBeEqualExpectedResult() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Given("Other input with invalid data")
    public void otherInputWithInvalidData() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Then("Output should not be equal expected result")
    public void outputShouldNotBeEqualExpectedResult() throws InterruptedException {
        Thread.sleep(500);
    }
}
