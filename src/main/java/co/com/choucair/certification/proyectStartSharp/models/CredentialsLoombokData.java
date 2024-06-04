package co.com.choucair.certification.proyectStartSharp.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CredentialsLoombokData {
    String username;
    String password;

    public static List<CredentialsLoombokData> setData(DataTable table){
        List<CredentialsLoombokData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, CredentialsLoombokData.class));
            System.out.println(new ObjectMapper().convertValue(map, CredentialsLoombokData.class));
        }
        return data;
    }

    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}
}
