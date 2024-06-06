package co.com.choucair.certification.proyectStartSharp.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.choucair.certification.proyectStartSharp.utils.GlobalData.ACTOR;
import static co.com.choucair.certification.proyectStartSharp.utils.GlobalData.URL;
import co.com.choucair.certification.proyectStartSharp.models.CredentialsLoombokData;
import co.com.choucair.certification.proyectStartSharp.tasks.Login;

public class LoginStepDefinitions {

    @Given("I need to be on the StartSharp login page")
    public void iNeedToBeOnTheStartSharpLoginPage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @And("I will enter the following credentials")
    public void iWillEnterTheFollowingCredentials(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onTheSite(CredentialsLoombokData.setData(dataTable).get(0)));
    }
}
