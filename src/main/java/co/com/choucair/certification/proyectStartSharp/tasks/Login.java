package co.com.choucair.certification.proyectStartSharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.core.steps.Instrumented;

import co.com.choucair.certification.proyectStartSharp.models.CredentialsLoombokData;
import static co.com.choucair.certification.proyectStartSharp.userinterfaces.LoginPage.*;

public class Login implements Task{
    CredentialsLoombokData credentialsLoombokData;

    public Login(CredentialsLoombokData credentialsLoombokData){
        this.credentialsLoombokData = credentialsLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credentialsLoombokData.getUsername()).into(INPUT_USERNAME),
                Enter.theValue(credentialsLoombokData.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_SUBMIT)
        );
    }

    public static Login onTheSite(CredentialsLoombokData credentialsLoombokData){
        return Instrumented.instanceOf(Login.class).withProperties(credentialsLoombokData);
    }
}
