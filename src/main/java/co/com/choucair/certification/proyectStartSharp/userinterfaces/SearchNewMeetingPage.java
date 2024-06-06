package co.com.choucair.certification.proyectStartSharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchNewMeetingPage {

    public SearchNewMeetingPage(){}

    private static String TREE = "div#GridDiv > div:nth-child(3) > div:nth-child(5) > div > div > ";

    public static final Target INPUT_SEARCH_MEETING = Target.the("Input element to search a meeting").
            located(By.cssSelector("input#Serenity_Pro_Meeting_MeetingGrid0_QuickSearchInput"));

    public static final Target MEETING_NAME = Target.the("Input element to search a meeting name").
            located(By.cssSelector(TREE+"div:nth-child(2) > a"));

    public static final Target MEETING_NUMBER = Target.the("Input element to search a meeting number").
            located(By.cssSelector(TREE+"div:nth-child(3)"));

    public static final Target MEETING_TYPE = Target.the("Input element to search a meeting type").
            located(By.cssSelector(TREE+"div:nth-child(4)"));

    public static final Target MEETING_STARTDATE = Target.the("Input element to search a meeting startdate").
            located(By.cssSelector(TREE+"div:nth-child(5)"));

    public static final Target MEETING_ENDDATE = Target.the("Input element to search a meeting enddate").
            located(By.cssSelector(TREE+"div:nth-child(6)"));

    public static final Target MEETING_LOCATION = Target.the("Input element to search a meeting location").
            located(By.cssSelector(TREE+"div:nth-child(7)"));

    public static final Target MEETING_UNIT = Target.the("Input element to search a meeting unit").
            located(By.cssSelector(TREE+"div:nth-child(8)"));

    public static final Target MEETING_ORGANIZEDBY = Target.the("Input element to search a meeting organized by").
            located(By.cssSelector(TREE+"div:nth-child(9)"));

    public static final Target MEETING_REPORTER = Target.the("Input element to search a meeting reporter").
            located(By.cssSelector(TREE+"div:nth-child(10)"));






}
