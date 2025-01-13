package hellocucumber;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    private String today;
    private String answer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    @Given("qu'aujourd'hui c'est {string}")
    public void aujourd_hui_c_est(String day) {
        today = day;
    }

    @When("je demande si c'est vendredi")
    public void je_demande_si_c_est_vendredi() {
        answer = IsItFriday.isItFriday(today);
    }

    @Then("on devrait me dire {string}")
    public void on_devrait_me_dire(String expectedAnswer) {
        assertEquals(expectedAnswer, answer);
    }
}