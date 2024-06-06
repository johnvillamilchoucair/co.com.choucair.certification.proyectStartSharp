package co.com.choucair.certification.proyectStartSharp.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;

import co.com.choucair.certification.proyectStartSharp.models.ContactLoombokData;
import static co.com.choucair.certification.proyectStartSharp.userinterfaces.SearchNewContactPage.*;

import java.util.concurrent.TimeUnit;

public class ValidateNewContactData implements Question<Boolean> {
    ContactLoombokData contactLoombokData;

    public ValidateNewContactData(ContactLoombokData contactLoombokData) {
        this.contactLoombokData = contactLoombokData;
    }

    public static ValidateNewContactData AfterSearching(ContactLoombokData contactLoombokData){
        return new ValidateNewContactData(contactLoombokData);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean isValid = false;

        String title = contactLoombokData.getTitle();
        String firstName = contactLoombokData.getFirstName();
        String lastName = contactLoombokData.getLastName();
        String email = contactLoombokData.getEmail();
        String identityNum = contactLoombokData.getIdentityNum();
        String userName = contactLoombokData.getUserName();

        actor.attemptsTo(
                Enter.theValue(firstName+" "+lastName).into(INPUT_SEARCH_CONTACT)
                //,WaitUntil.the(INPUT_SEARCH_CONTACT, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds()
        );

        try {TimeUnit.SECONDS.sleep(2);}
        catch (InterruptedException e) {e.printStackTrace();}

    String findingTitleOnPage = Text.of(TITLE_DATA_TABLE_CONTACT).answeredBy(actor).toString();
        String findingFirstnameOnPage = Text.of(FIRSTNAME_DATA_TABLE_CONTACT).answeredBy(actor).toString();
        String findingLastnameOnPage = Text.of(LASTNAME_DATA_TABLE_CONTACT).answeredBy(actor).toString();
        String findingEmailOnPage = Text.of(EMAIL_DATA_TABLE_CONTACT).answeredBy(actor).toString();
        String findingIdentityNOnPage = Text.of(IDENTITY_N_DATA_TABLE_CONTACT).answeredBy(actor).toString();
        String findingUsernameOnPage = Text.of(USERNAME_DATA_TABLE_CONTACT).answeredBy(actor).toString();


        isValid = (title != null && !title.isEmpty()) && title.equals(findingTitleOnPage) &&
                (firstName != null && !firstName.isEmpty()) && firstName.equals(findingFirstnameOnPage) &&
                (lastName != null && !lastName.isEmpty()) && lastName.equals(findingLastnameOnPage) &&
                (email != null && !email.isEmpty()) && email.equals(findingEmailOnPage) &&
                (identityNum != null && !identityNum.isEmpty()) && identityNum.equals(findingIdentityNOnPage) &&
                (userName != null && !userName.isEmpty()) && userName.equals(findingUsernameOnPage);
        return isValid;
    }
}
