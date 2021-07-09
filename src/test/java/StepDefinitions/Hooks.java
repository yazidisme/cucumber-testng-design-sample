package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void testSetup() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Before - testSetup");
    }

    @After
    public void testTeardown() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("After - testTeardown");
    }
}
