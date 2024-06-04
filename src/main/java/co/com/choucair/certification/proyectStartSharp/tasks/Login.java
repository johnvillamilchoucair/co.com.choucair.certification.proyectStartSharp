package co.com.choucair.certification.proyectStartSharp.tasks;

import co.com.choucair.certification.proyectStartSharp.models.CredentialsLoombokData;
import co.com.choucair.certification.proyectStartSharp.userinterfaces.LoginPage;
import net.serenitybdd.core.steps.Instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


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

    public void printCredentials() {
        System.out.println("User: " + credentialsLoombokData.getUsername());
        System.out.println("Pass: " + credentialsLoombokData.getPassword());
    }
}
