package co.com.choucair.certification.proyectStartSharp.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;


import static co.com.choucair.certification.proyectStartSharp.utils.GlobalData.*;


public class ContactManagementStepDefinitions {
    @Given("I need to be on the StartSharp login page")
    public void iNeedToBeOnTheStartSharpLoginPage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
        System.out.println("Background Given");
    }
    @And("I will enter the following credentials")
    public void iWillEnterTheFollowingCredentials(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("Background And");
    }
    @Given("Im in the contact creation view")
    public void imInTheContactCreationView() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario1 Given");
    }
    @When("I fill out the new contact form with the following information")
    public void iFillOutTheNewContactFormWithTheFollowingInformation(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("Scenario1 When");
    }
    @Then("I search the firstname contact on the tree")
    public void iSearchTheFirstnameContactOnTheTree() {
        // Write code here that turns sthe phrase above into concrete actions
        System.out.println("Scenario1 Then");
    }
    @And("Validate the contact information")
    public void validateTheContactInformation() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario1 And");
    }

}
