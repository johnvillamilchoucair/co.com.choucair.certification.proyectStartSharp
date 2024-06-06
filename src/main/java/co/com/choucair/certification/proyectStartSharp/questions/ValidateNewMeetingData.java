package co.com.choucair.certification.proyectStartSharp.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;

import co.com.choucair.certification.proyectStartSharp.models.MeetingLoombokData;

import java.util.concurrent.TimeUnit;

import static co.com.choucair.certification.proyectStartSharp.userinterfaces.SearchNewMeetingPage.*;

public class ValidateNewMeetingData implements Question<Boolean>{

    MeetingLoombokData meetingLoombokData;

    public ValidateNewMeetingData(MeetingLoombokData meetingLoombokData){
        this.meetingLoombokData = meetingLoombokData;
    }

    public static ValidateNewMeetingData AfterSearching(MeetingLoombokData meetingLoombokData){
        return new ValidateNewMeetingData(meetingLoombokData);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean isValid = false;
        String meetingName = meetingLoombokData.getMeetingName();
        String meetingNumber = meetingLoombokData.getMeetingNumber();
        String meetingType = meetingLoombokData.getMeetingType();
        String startDate = meetingLoombokData.getStartDate();
        String endDate = meetingLoombokData.getEndDate();
        String location = meetingLoombokData.getLocation();
        String unit = meetingLoombokData.getUnit();
        String organizedBy = meetingLoombokData.getOrganizedBy();
        String reporter = meetingLoombokData.getReporter();

        actor.attemptsTo(
                Enter.theValue(meetingName).into(INPUT_SEARCH_MEETING)
        );
        try {TimeUnit.SECONDS.sleep(2);}
        catch (InterruptedException e) {e.printStackTrace();}
        String findingMeetingName = Text.of(MEETING_NAME).answeredBy(actor).toString();
        String findingMeetingType = Text.of(MEETING_TYPE).answeredBy(actor).toString();
        String findingMeetingNumber = Text.of(MEETING_NUMBER).answeredBy(actor).toString();
        String findingStartDate = Text.of(MEETING_STARTDATE).answeredBy(actor).toString();
        String findingEndDate = Text.of(MEETING_ENDDATE).answeredBy(actor).toString();
        String findingLocation = Text.of(MEETING_LOCATION).answeredBy(actor).toString();
        String findingUnit = Text.of(MEETING_UNIT).answeredBy(actor).toString();
        String findingOrganizedBy = Text.of(MEETING_ORGANIZEDBY).answeredBy(actor).toString();
        String findingReporter = Text.of(MEETING_REPORTER).answeredBy(actor).toString();

        isValid = (
                meetingName != null && !meetingName.isEmpty() && meetingName.equals(findingMeetingName) &&
                meetingType != null && !meetingType.isEmpty() && meetingType.equals(findingMeetingType) &&
                        meetingNumber != null && !meetingNumber.isEmpty() && meetingNumber.equals(findingMeetingNumber) &&
                        startDate != null && !startDate.isEmpty() && startDate.equals(findingStartDate) &&
                        endDate != null && !endDate.isEmpty() && endDate.equals(findingEndDate) &&
                        location != null && !location.isEmpty() && location.equals(findingLocation) &&
                        unit != null && !unit.isEmpty() && unit.equals(findingUnit) &&
                        organizedBy != null && !organizedBy.isEmpty() && organizedBy.equals(findingOrganizedBy)&&
                reporter != null && !reporter.isEmpty() && reporter.equals(findingReporter)
                );
        return isValid;
    }
}
