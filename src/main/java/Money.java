//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.URL;
//import java.util.Iterator;
//import java.util.Scanner;
//
//public class Money {
//    static String date;
//    static String valute;
//    static String name;
//    static Double value;
//
////    public static Rate getMoney() throws IOException {
////////        URL url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
//////        Scanner in = new Scanner((InputStream) url.getContent());
//////        FileWriter fileWriter = new FileWriter("/Users/dmitriy/IdeaProjects/FinBot/src/main/resources/rate.json");
//////        fileWriter.write(String.valueOf(in));
//////
//////        JSONObject object = new JSONObject(in);
//////        JSONArray arr = new JSONArray(object.get("Valute"));
//////        Iterator i  = arr.iterator();
//////
//////        while (i.hasNext()){
//////
//////            if (i.next().equals("USD")){
//////                JSONObject inerObj = (JSONObject) i.next();
//////                valute = "Доллар США";
//////                name = inerObj.getString("Name");
//////                value = inerObj.getDouble("Value");
//////                //return new Rate(date, valute, name, value);
//////            }
//////
//////        }
//////       return null;
//////    }
////
////}
