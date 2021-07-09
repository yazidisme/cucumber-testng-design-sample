package StepDefinitions;

import io.cucumber.java.en.Given;

public class SecondSteps {
    @Given("Input {string} data")
    public void inputData(String data) throws InterruptedException {
        Thread.sleep(1000);
    }
}
