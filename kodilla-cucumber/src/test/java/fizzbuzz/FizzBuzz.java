package fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz {
    private int number;
    private String result;

    @Given("I have the number {int}")
    public void i_have_the_number(Integer number) {
        this.number = number;
    }

    @When("I evaluate the number")
    public void i_evaluate_the_number() {
        result = evaluateFizzBuzz(number);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expectedResult) {
        assertEquals(expectedResult, result);
    }

    private String evaluateFizzBuzz(int number) {
        if (number % 15 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return "None";
    }
}