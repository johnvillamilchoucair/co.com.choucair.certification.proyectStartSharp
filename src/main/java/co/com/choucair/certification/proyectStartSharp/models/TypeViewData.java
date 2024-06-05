package co.com.choucair.certification.proyectStartSharp.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TypeViewData {
    private String typeView;

    public TypeViewData(String typeView) {this.typeView = typeView;}

    public static List<TypeViewData> setData(DataTable table){
        List<TypeViewData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, TypeViewData.class));
        }
        return data;
    }

    public String getTypeView() {return typeView;}
    public void setTypeView(String typeView) {this.typeView = typeView;}
}
