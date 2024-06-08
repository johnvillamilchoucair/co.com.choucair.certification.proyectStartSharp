package co.com.choucair.certification.proyectStartSharp.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.core.steps.Instrumented;

import co.com.choucair.certification.proyectStartSharp.models.MeetingLoombokData;
import static co.com.choucair.certification.proyectStartSharp.userinterfaces.FormCreationMeetingPage.*;


public class CreateMeeting implements Task{

    MeetingLoombokData meetingLoombokData;

    public CreateMeeting(MeetingLoombokData meetingLoombokData){this.meetingLoombokData = meetingLoombokData;}

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(meetingLoombokData.getMeetingName()).into(INPUT_MEETING_NAME),

                Click.on(DIV_MEETINGTYPE_LIST),
                Enter.theValue(meetingLoombokData.getMeetingType()).into(INPUT_MEETINGTYPE_LIST),
                Click.on(SPAN_TYPE_MEETINGTYPE_LIST),

                Enter.theValue(meetingLoombokData.getMeetingNumber()).into(INPUT_MEETING_N),
                Enter.theValue(meetingLoombokData.getStartDate()).into(INPUT_MEETING_STARTDATE),
                Enter.theValue(meetingLoombokData.getEndDate()).into(INPUT_MEETING_ENDDATE),

                Click.on(SPAN_MEETING_LOCATION_LIST),
                Enter.theValue(meetingLoombokData.getLocation()).into(INPUT_MEETING_LOCATION_LIST),
                Click.on(SPAN_MEETING_ELEMENT_LOCATION_LIST),

                Click.on(SPAN_MEETING_UNIT_LIST)
//     Enter.theValue(meetingLoombokData.getUnit()).into(INPUT_MEETING_UNIT_LIST),
//     Click.on(SPAN_MEETING_ELEMENT_UNIT_LIST),

//     Click.on(SPAN_MEETING_ORGANIZEDBY_LIST),
//     Enter.theValue(meetingLoombokData.getOrganizedBy()).into(INPUT_MEETING_ORGANIZEDBY_LIST),
//     Click.on(SPAN_MEETING_ELEMENT_ORGANIZEDBY_LIST),

//     Click.on(SPAN_MEETING_REPORTER_LIST),
//     Enter.theValue(meetingLoombokData.getReporter()).into(INPUT_MEETING_REPORTER_LIST),
//     Click.on(SPAN_MEETING_ELEMENT_REPORTER_LIST),

//     Click.on(SPAN_MEETING_ATTENDEELIST_LIST),
//     Enter.theValue(meetingLoombokData.getAttendeeList()).into(INPUT_MEETING_ATTENDEELIST_LIST),
//     Click.on(SPAN_MEETING_ELEMENT_ATTENDEELIST_LIST),

                //Click.on(BNT_SAVE)

        );
    }

    public static CreateMeeting onTheSite(MeetingLoombokData meetingLoombokData){
        return Instrumented.instanceOf(CreateMeeting.class).withProperties(meetingLoombokData);
    }
}
