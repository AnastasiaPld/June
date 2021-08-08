package NewProject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;

public class Serialization {
    @SuppressWarnings("unchecked")
    private static FileWriter file;

    public static void main(String[] args) throws IOException {
        JSONObject car1 = new JSONObject();
        car1.put("Model", "Volvo");
        car1.put("Store", "Varna");
        car1.put("Year", "2020");

        JSONObject carObject1 = new JSONObject();
        carObject1.put("List",car1);

        JSONObject car2 = new JSONObject();
        car2.put("Model","Fiat");
        car2.put("Store","Plovdiv");
        car2.put("Year","2020");

       JSONObject carObject2 = new JSONObject();
        carObject2.put("List",car2);

        JSONArray stores = new JSONArray();
        stores.add(carObject1);
        stores.add(carObject2);


        try {
            file = new FileWriter("car1.json");
            file.write(stores.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

    }








