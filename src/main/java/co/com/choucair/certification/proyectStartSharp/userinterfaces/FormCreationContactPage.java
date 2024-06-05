package co.com.choucair.certification.proyectStartSharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormCreationContactPage {
    public FormCreationContactPage(){}

    public static Target INPUT_TITLE = Target.the("Input element for Title").
            located(By.cssSelector("#Serenity_Pro_Organization_ContactDialog4_Title"));

    public static Target INPUT_FIRSTNAME = Target.the("Input element for contact Firstname").
            located(By.cssSelector("#Serenity_Pro_Organization_ContactDialog4_FirstName"));

    public static Target INPUT_LASTNAME = Target.the("Input element for contact Lastname").
            located(By.cssSelector("#Serenity_Pro_Organization_ContactDialog4_LastName"));

    public static Target INPUT_EMAIL = Target.the("Input element for contact Email").
            located(By.cssSelector("#Serenity_Pro_Organization_ContactDialog4_Email"));

    public static Target INPUT_IDENTITY_N = Target.the("Input element for contact Identity Number").
            located(By.cssSelector("#Serenity_Pro_Organization_ContactDialog4_IdentityNo"));


    //List element
    public static Target DIV_USER_RELATED_LIST = Target.the("Div element for contact User related list").
            located(By.cssSelector("#s2id_Serenity_Pro_Organization_ContactDialog4_UserId"));

    public static Target INPUT_USER_RELATED_LIST = Target.the("Input element for input on contact User related list").
            located(By.cssSelector("input#s2id_autogen1_search"));

    public static Target ELEMENT_USER_RELATED_LIST = Target.the("Element for contact User related on the list").
            located(By.cssSelector("div#select2-drop > ul >li > div > span"));

    public static Target BNT_SAVE = Target.the("Button for save and create the new contact").
            located(By.cssSelector("#Serenity_Pro_Organization_ContactDialog4_Toolbar > div > div > span > i"));

}
