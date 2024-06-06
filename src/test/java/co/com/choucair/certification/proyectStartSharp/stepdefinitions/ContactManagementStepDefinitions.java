package co.com.choucair.certification.proyectStartSharp.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.GivenWhenThen;

import co.com.choucair.certification.proyectStartSharp.models.ContactLoombokData;
import co.com.choucair.certification.proyectStartSharp.models.TypeViewData;
import co.com.choucair.certification.proyectStartSharp.tasks.GoToSection;
import co.com.choucair.certification.proyectStartSharp.tasks.CreateContact;
import co.com.choucair.certification.proyectStartSharp.questions.ValidateNewContactData;

public class ContactManagementStepDefinitions {
    //@Given("I need to be on the StartSharp login page")
    //public void iNeedToBeOnTheStartSharpLoginPage() {
    //    OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    //}
    //@And("I will enter the following credentials")
    //public void iWillEnterTheFollowingCredentials(DataTable dataTable) {
    //    OnStage.theActorInTheSpotlight().attemptsTo(Login.onTheSite(CredentialsLoombokData.setData(dataTable).get(0)));
    //}
    @Given("^Im in the contact (.*) view")
    public void imInTheContactTypeView(String typeView) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToSection.onTheSite(new TypeViewData(typeView)));
    }
    @When("I fill out the new contact form with the following information")
    public void iFillOutTheNewContactFormWithTheFollowingInformationForNewContact(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateContact.onTheSite(ContactLoombokData.setData(dataTable).get(0)));
    }

    @Then("I search and validate the new contact data on the tree")
    public void iSearchAndValidateTheNewContactDataOnTheTree(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateNewContactData.AfterSearching(new ContactLoombokData(dataTable))));
    }

}
