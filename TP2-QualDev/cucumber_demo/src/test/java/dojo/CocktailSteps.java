package dojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;
import java.util.List;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void person_who_wants_to_buy_a_drink(String person) {
        order = new Order();
        order.declareOwner(person);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_person(String target) {
        order.declareTarget(target);
    }

    @When("{int} cocktails are added to the order")
    public void cocktails_are_added_to_the_order(int numberOfCocktails) {
        for (int i = 0; i < numberOfCocktails; i++) {
            order.addCocktail("Cocktail " + (i + 1));
        }
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_number_of_cocktails_in_the_order(int expectedNumberOfCocktails) {
        List<String> cocktails = order.getCocktails();
        assertEquals(expectedNumberOfCocktails, cocktails.size());
    }

    @When("a message saying {string} is added")
    public void a_message_saying_is_added(String message) {
        order.addMessage(message);
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String expected) {
        String ticket = order.getTicket();
        assertEquals(expected, ticket);
    }
}