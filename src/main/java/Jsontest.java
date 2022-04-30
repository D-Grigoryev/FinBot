
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.net.URL;
import java.util.Iterator;
import java.util.Scanner;

public class Jsontest {

    static String date;
    static String name;
    static Double value;

    public Rate parser() {

        //Rate rate = new Rate();
        JSONParser parser = new JSONParser();

        try (FileReader fileReader = new FileReader("/Users/dmitriy/IdeaProjects/FinBot/src/main/resources/rate.json")) {

            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            JSONObject js2 = (JSONObject) jsonObject.get("Valute");
            JSONObject jsUSD = (JSONObject) js2.get("USD");
            date = (String) jsonObject.get("Date");
            name = (String) jsUSD.get("Name");
            value = (Double) jsUSD.get("Value");


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }
}


