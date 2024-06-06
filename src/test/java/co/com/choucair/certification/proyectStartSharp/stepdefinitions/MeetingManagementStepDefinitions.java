package co.com.choucair.certification.proyectStartSharp.stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.GivenWhenThen;


import co.com.choucair.certification.proyectStartSharp.tasks.GoToSection;
import co.com.choucair.certification.proyectStartSharp.models.TypeViewData;
import co.com.choucair.certification.proyectStartSharp.tasks.CreateMeeting;
import co.com.choucair.certification.proyectStartSharp.models.MeetingLoombokData;

public class MeetingManagementStepDefinitions {
    @Given("^Im in the meeting (.*) view")
    public void imInTheMeetingTypeView(String typeView) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToSection.onTheSite(new TypeViewData(typeView)));
    }

    @When("I fill out the new meeting form with the following information")
    public void iFillOutTheNewMeetingFormWithTheFollowingInformationForNewMeeting(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateMeeting.onTheSite(MeetingLoombokData.setData(dataTable).get(0)));
    }

    @Then("I search and validate the new meeting data on the tree")
    public void iSearchAndValidateTheNewMeetingDataOnTheTree(DataTable dataTable) {

    }
}
