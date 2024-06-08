package co.com.choucair.certification.proyectStartSharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormCreationMeetingPage {

    public static final Target INPUT_MEETING_NAME = Target.the("Input element for Meeting name").
            located(By.cssSelector("input#Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));



    //Meeting Type List
    public static final Target DIV_MEETINGTYPE_LIST = Target.the("Element for Meeting type list").
            located(By.cssSelector("div#s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId > a"));
    public static final Target INPUT_MEETINGTYPE_LIST = Target.the("Input element for Meeting type list").
            located(By.cssSelector("div#select2-drop > div:first-child > input"));
    public static final Target SPAN_TYPE_MEETINGTYPE_LIST = Target.the("Span element Type for Meeting type list").
            locatedBy("//div[@id='select2-drop']//ul//li");
            //located(By.cssSelector("div#select2-drop > ul > li > div >span"));


    public static final Target INPUT_MEETING_N = Target.the("Input element for Meeting number").
            located(By.cssSelector("input#Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));

    public static final Target INPUT_MEETING_STARTDATE = Target.the("Input element for Meeting start date").
            located(By.cssSelector("input#Serenity_Pro_Meeting_MeetingDialog10_StartDate"));

    public static final Target INPUT_MEETING_ENDDATE = Target.the("Input element for Meeting end date").
            located(By.cssSelector("input#Serenity_Pro_Meeting_MeetingDialog10_EndDate"));

    //Meeting Location List
    public static final Target SPAN_MEETING_LOCATION_LIST = Target.the("Span element for Meeting location list").
            located(By.cssSelector("span#select2-chosen-7"));
    public static final Target INPUT_MEETING_LOCATION_LIST = Target.the("Input element for Meeting location list").
            located(By.cssSelector("div#select2-drop > div > input#s2id_autogen7_search"));
    public static final Target SPAN_MEETING_ELEMENT_LOCATION_LIST = Target.the("Span element for Meeting location list").
            locatedBy("//div[@id='select2-drop']//ul//li//div");
            //located(By.cssSelector("div#select2-drop > ul > li > div > span"));

    //Meeting Unit List
    public static final Target SPAN_MEETING_UNIT_LIST = Target.the("Span element for Meeting unit list").
            located(By.cssSelector("span#select2-chosen-8"));
    public static final Target INPUT_MEETING_UNIT_LIST = Target.the("Input element for Meeting unit list").
            located(By.cssSelector("div#select2-drop > div > input#s2id_autogen8_search"));
    public static final Target SPAN_MEETING_ELEMENT_UNIT_LIST = Target.the("Span element for Meeting unit list").
            locatedBy("//div[@id='select2-drop']//ul//li");
            //located(By.cssSelector("div#select2-drop > ul > li > div > span"));


    //Meeting organizedBy List
    public static final Target SPAN_MEETING_ORGANIZEDBY_LIST = Target.the("Span element for Meeting organized by list").
            located(By.cssSelector("span#select2-chosen-9"));
    public static final Target INPUT_MEETING_ORGANIZEDBY_LIST = Target.the("Input element for Meeting organized by list").
            located(By.cssSelector("div#select2-drop > div > input#s2id_autogen9_search"));
    public static final Target SPAN_MEETING_ELEMENT_ORGANIZEDBY_LIST = Target.the("Span element for Meeting organized by list").
            locatedBy("//div[@id='select2-drop']//ul//li");
            //located(By.cssSelector("div#select2-drop > ul > li > div > span"));


    //Meeting reporter List
    public static final Target SPAN_MEETING_REPORTER_LIST = Target.the("Span element for Meeting reporter list").
            located(By.cssSelector("span#select2-chosen-10"));
    public static final Target INPUT_MEETING_REPORTER_LIST = Target.the("Input element for Meeting reporter list").
            located(By.cssSelector("div#select2-drop > div > input#s2id_autogen10_search"));
    public static final Target SPAN_MEETING_ELEMENT_REPORTER_LIST = Target.the("Span element for Meeting reporter list").
            locatedBy("//div[@id='select2-drop']//ul//li");
            //located(By.cssSelector("div#select2-drop > ul > li > div > span"));

    //Meeting attendeeList List
    public static final Target SPAN_MEETING_ATTENDEELIST_LIST = Target.the("Span element for Meeting attendeeList list").
            located(By.cssSelector("span#select2-chosen-12"));
    public static final Target INPUT_MEETING_ATTENDEELIST_LIST = Target.the("Input element for Meeting attendeeList list").
            located(By.cssSelector("div#select2-drop > div > input#s2id_autogen12_search"));
    public static final Target SPAN_MEETING_ELEMENT_ATTENDEELIST_LIST = Target.the("Span element for Meeting attendeeList list").
            locatedBy("//div[@id='select2-drop']//ul//li");
            //located(By.cssSelector("div#select2-drop > ul > li > div > span"));






    public static final Target SELECT_MEETING_ELEMENT_ATTENDEELIST_LIST = Target.the("Select element for Meeting attendeeList list").
            //located(By.cssSelector("div#Serenity_Pro_Meeting_MeetingDialog10_AttendeeList > div + div > div:nth-child(5) > div > div > div:nth-child(3) > select"));
            locatedBy("//div[@id='Serenity_Pro_Meeting_MeetingDialog10_AttendeeList']//div//following-sibling::div[1]//div[5]//div//div[3]//select");

    public static final Target OPTION_MEETING_ELEMENT_ATTENDEELIST_LIST = Target.the("Select element for Meeting attendeeList list").
            //located(By.cssSelector("div#Serenity_Pro_Meeting_MeetingDialog10_AttendeeList > div + div > div:nth-child(5) > div > div > div:nth-child(3) > select >option+option"));
            locatedBy("//div[@id='Serenity_Pro_Meeting_MeetingDialog10_AttendeeList']//div[5]//div//div[3]//select//option[@value='2']");


    public static final Target BNT_SAVE = Target.the("Button for save and create the new meeting").
            located(By.cssSelector("div#Serenity_Pro_Meeting_MeetingDialog10_Toolbar > div > div > span > i"));



//div#Serenity_Pro_Meeting_MeetingDialog10_AttendeeList > div + div > div:nth-child(5) > div > div > div:nth-child(3) > select


















}
