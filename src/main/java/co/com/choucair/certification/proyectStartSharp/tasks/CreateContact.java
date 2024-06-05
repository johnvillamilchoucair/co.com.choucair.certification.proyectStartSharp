package co.com.choucair.certification.proyectStartSharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.core.steps.Instrumented;

import co.com.choucair.certification.proyectStartSharp.models.ContactLoombokData;

import static co.com.choucair.certification.proyectStartSharp.userinterfaces.FormCreationContactPage.*;

public class CreateContact implements Task{

    ContactLoombokData contactLoombokData;

    public CreateContact(ContactLoombokData contactLoombokData){this.contactLoombokData = contactLoombokData;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(contactLoombokData.getTitle()).into(INPUT_TITLE),
                Enter.theValue(contactLoombokData.getFirstName()).into(INPUT_FIRSTNAME),
                Enter.theValue(contactLoombokData.getLastName()).into(INPUT_LASTNAME),
                Enter.theValue(contactLoombokData.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(contactLoombokData.getIdentityNum()).into(INPUT_IDENTITY_N),
                Click.on(DIV_USER_RELATED_LIST),
                Enter.theValue(contactLoombokData.getUserName()).into(INPUT_USER_RELATED_LIST),
                Click.on(ELEMENT_USER_RELATED_LIST),
                Click.on(BNT_SAVE)
        );
    }

    public static CreateContact onTheSite(ContactLoombokData contactLoombokData){
        return Instrumented.instanceOf(CreateContact.class).withProperties(contactLoombokData);
    }
}
