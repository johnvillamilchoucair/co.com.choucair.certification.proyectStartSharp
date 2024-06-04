package co.com.choucair.certification.proyectStartSharp.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;


import static co.com.choucair.certification.proyectStartSharp.utils.GlobalData.*;
import co.com.choucair.certification.proyectStartSharp.models.CredentialsLoombokData;
import co.com.choucair.certification.proyectStartSharp.models.TypeViewData;
import co.com.choucair.certification.proyectStartSharp.tasks.Login;
import co.com.choucair.certification.proyectStartSharp.tasks.GoToSection;


public class ContactManagementStepDefinitions {
    @Given("I need to be on the StartSharp login page")
    public void iNeedToBeOnTheStartSharpLoginPage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
        System.out.println("Background Given");
    }
    @And("I will enter the following credentials")
    public void iWillEnterTheFollowingCredentials(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onTheSite(CredentialsLoombokData.setData(dataTable).get(0)));
    }
    @Given("^Im in the (.*) view")
    public void imInTheContactCreationView(String typeView) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToSection.onTheSite(new TypeViewData(typeView)));
    }
    @When("I fill out the new contact form with the following information")
    public void iFillOutTheNewContactFormWithTheFollowingInformation(DataTable dataTable) {

    }

    @Then("^I search the (.*) contact on the tree$")
    public void iSearchTheUserNameContactOnTheTree(String user) {
        // Write code here that turns sthe phrase above into concrete actions
        System.out.println("Scenario1 Then "+user);
    }
    @And("Validate the contact information")
    public void validateTheContactInformation() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario1 And");
    }

}
