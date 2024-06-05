package co.com.choucair.certification.proyectStartSharp.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContactLoombokData {

    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String identityNum;
    private String userName;
    private String typeView;

    public ContactLoombokData() {
    }

    public ContactLoombokData(DataTable dataTable) {
        // Convert the DataTable to a List of Maps
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        Map<String, String> row = data.get(0);

        this.title = row.get("title");
        this.firstName = row.get("firstName");
        this.lastName = row.get("lastName");
        this.email = row.get("email");
        this.identityNum = row.get("identityNum");
        this.userName = row.get("userName");
        this.typeView = row.get("typeView");
    }

    public static List<ContactLoombokData> setData(DataTable table){
        List<ContactLoombokData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, ContactLoombokData.class));
        }
        return data;
    }


    public String getTitle() {return title;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getEmail() {return email;}
    public String getIdentityNum() {return identityNum;}
    public String getUserName() {return userName;}
    public String getTypeView() {return typeView;}

    public void setTitle(String title) {this.title = title;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setEmail(String email) {this.email = email;}
    public void setIdentityNum(String identityNum) {this.identityNum = identityNum;}
    public void setUserName(String userName) {this.userName = userName;}
    public void setTypeView(String typeView) {this.typeView = typeView;}

}
