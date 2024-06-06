package co.com.choucair.certification.proyectStartSharp.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MeetingLoombokData {

    private String meetingName;
    private String meetingType;
    private String meetingNumber;
    private String startDate;
    private String endDate;
    private String location;
    private String unit;
    private String organizedBy;
    private String reporter;
    private String attendeeList;
    private String typeView;

    public MeetingLoombokData(){}

    public MeetingLoombokData(DataTable dataTable){
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        Map<String, String> row = data.get(0);

        this.meetingName = row.get("meetingName");
        this.meetingType = row.get("meetingType");
        this.meetingNumber = row.get("meetingNumber");
        this.startDate = row.get("startDate");
        this.endDate = row.get("endDate");
        this.location = row.get("location");
        this.unit = row.get("unit");
        this.organizedBy = row.get("organizedBy");
        this.reporter = row.get("reporter");
        this.attendeeList = row.get("attendeeList");
    }

    public static List<MeetingLoombokData> setData(DataTable table){
        List<MeetingLoombokData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, MeetingLoombokData.class));
        }
        return data;
    }

    public String getMeetingName() {return meetingName;}
    public String getMeetingType() {return meetingType;}
    public String getMeetingNumber() {return meetingNumber;}
    public String getStartDate() {return startDate;}
    public String getEndDate() {return endDate;}
    public String getLocation() {return location;}
    public String getUnit() {return unit;}
    public String getOrganizedBy() {return organizedBy;}
    public String getReporter() {return reporter;}
    public String getAttendeeList() {return attendeeList;}
    public String getTypeView() {return typeView;}

    public void setMeetingName(String meetingName) {this.meetingName = meetingName;}
    public void setMeetingType(String meetingType) {this.meetingType = meetingType;}
    public void setMeetingNumber(String meetingNumber) {this.meetingNumber = meetingNumber;}
    public void setStartDate(String startDate) {this.startDate = startDate;}
    public void setEndDate(String endDate) {this.endDate = endDate;}
    public void setLocation(String location) {this.location = location;}
    public void setUnit(String unit) {this.unit = unit;}
    public void setOrganizedBy(String organizedBy) {this.organizedBy = organizedBy;}
    public void setReporter(String reporter) {this.reporter = reporter;}
    public void setAttendeeList(String attendeeList) {this.attendeeList = attendeeList;}
    public void setTypeView(String typeView) {this.typeView = typeView;}

}
