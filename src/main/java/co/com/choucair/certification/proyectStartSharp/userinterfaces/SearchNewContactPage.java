package co.com.choucair.certification.proyectStartSharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchNewContactPage {

    public SearchNewContactPage(){}

    public static final Target INPUT_SEARCH_CONTACT = Target.the("Input element to search a contact").
            located(By.cssSelector("input#Serenity_Pro_Organization_ContactGrid0_QuickSearchInput"));

    public static final Target TITLE_DATA_TABLE_CONTACT = Target.the("Element for the Title of the created contact").
            located(By.cssSelector("div#GridDiv > div + div +div > div.slick-viewport > div > div > div:nth-child(2) > a"));

    public static final Target FIRSTNAME_DATA_TABLE_CONTACT = Target.the("Element for the Firstname of the created contact").
            located(By.cssSelector("div#GridDiv > div + div +div > div.slick-viewport > div > div > div:nth-child(3) > a"));
    public static final Target LASTNAME_DATA_TABLE_CONTACT = Target.the("Element for the Lastname of the created contact").
            located(By.cssSelector("div#GridDiv > div + div +div > div.slick-viewport > div > div > div:nth-child(4) > a"));



    public static final Target EMAIL_DATA_TABLE_CONTACT = Target.the("Element for the Email of the created contact").
            located(By.cssSelector("div#GridDiv > div + div +div > div.slick-viewport > div > div > div:nth-child(5)"));

    public static final Target IDENTITY_N_DATA_TABLE_CONTACT = Target.the("Element for the Identity Number of the created contact").
            located(By.cssSelector("div#GridDiv > div + div +div > div.slick-viewport > div > div > div:nth-child(6)"));

    public static final Target USERNAME_DATA_TABLE_CONTACT = Target.the("Element for the Username of the created contact").
            located(By.cssSelector("div#GridDiv > div + div +div > div.slick-viewport > div > div > div:nth-child(7)"));



}



