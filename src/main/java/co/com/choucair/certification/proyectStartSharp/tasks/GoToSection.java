package co.com.choucair.certification.proyectStartSharp.tasks;

import co.com.choucair.certification.proyectStartSharp.models.TypeViewData;
import static co.com.choucair.certification.proyectStartSharp.userinterfaces.CreationContactPage.*;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToSection implements Task{
    TypeViewData typeViewData;

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(this.typeViewData.getTypeView().equals("creationContactView")){
            actor.attemptsTo(
                    Click.on(HEADER_MENU),
                    Click.on(ORGANIZATION_MENU),
                    Click.on(CONTACTS_VIEW),
                    Click.on(BUTTON_NEWCONTACT_ON_CONTACTS_TREE)
                    //WaitUntil.the(SOME_ELEMENT_ON_NEXT_PAGE, isVisible()).forNoMoreThan(10).seconds()
            );
        }else if(this.typeViewData.getTypeView().equals("another")){
            System.out.println("otro");
        }
    }

    public GoToSection(TypeViewData typeViewData) {this.typeViewData = typeViewData;}

    public static GoToSection onTheSite(TypeViewData typeViewData){
        return Instrumented.instanceOf(GoToSection.class).withProperties(typeViewData);
    }
}
