package co.com.choucair.certification.proyectStartSharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreationContactPage {
    public CreationContactPage(){}

    public static final Target HEADER_MENU = Target.the("Header Menu").
            located(By.cssSelector("header > button > i"));

    public static final Target ORGANIZATION_MENU = Target.the("Organization Menu").
            located(By.cssSelector("ul#nav_menu1_3 > li > a"));

    public static final Target CONTACTS_VIEW_LIST = Target.the("Contacts view").
            located(By.cssSelector("ul#nav_menu1_3_1 > li:last-child >a"));

    public static final Target BUTTON_NEW_CONTACT_ON_CONTACTS_TREE = Target.the("Contacts view").
            located(By.cssSelector("i.fa.fa-plus-circle.text-green"));






}
