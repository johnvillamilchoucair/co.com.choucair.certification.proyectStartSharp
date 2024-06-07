package co.com.choucair.certification.proyectStartSharp.tasks;

import co.com.choucair.certification.proyectStartSharp.models.TypeViewData;
import co.com.choucair.certification.proyectStartSharp.userinterfaces.CreationMeetingPage;
import co.com.choucair.certification.proyectStartSharp.userinterfaces.CreationContactPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoToSection implements Task{
    TypeViewData typeViewData;

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(this.typeViewData.getTypeView().equals("creationContactView")){
            actor.attemptsTo(
                    //Click.on(CreationContactPage.SUB_MENU_OPTION_BUTTON.of("R")),
                    Click.on(CreationContactPage.HEADER_MENU),
                    Click.on(CreationContactPage.ORGANIZATION_MENU),
                    Click.on(CreationContactPage.CONTACTS_VIEW_LIST),
                    Click.on(CreationContactPage.BUTTON_NEW_CONTACT_ON_CONTACTS_TREE)
            );
        }else if(this.typeViewData.getTypeView().equals("creationMeetingView")){
            actor.attemptsTo(
                    Click.on(CreationMeetingPage.HEADER_MENU),
                    Click.on(CreationMeetingPage.MEETING_MENU),
                    Click.on(CreationMeetingPage.MEETINGS_VIEW_LIST),
                    Click.on(CreationMeetingPage.BUTTON_NEW_MEETING_ON_MEETINGS_TREE)
            );
        }
    }

    public GoToSection(TypeViewData typeViewData) {this.typeViewData = typeViewData;}

    public static GoToSection onTheSite(TypeViewData typeViewData){
        return Instrumented.instanceOf(GoToSection.class).withProperties(typeViewData);
    }
}
