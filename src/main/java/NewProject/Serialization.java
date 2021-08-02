package NewProject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;

public class Serialization {
    @SuppressWarnings("unchecked")
    private static FileWriter file;

    public static void main(String[] args) throws IOException {
        JSONObject car = new JSONObject();
        car.put("Model", "Volvo");
        car.put("Model1", "BMW");
        car.put("Model2", "Fiat");

        JSONObject carObject = new JSONObject();
        carObject.put("Model",car);

        JSONObject store = new JSONObject();
        store.put("Store","Sofia");
        store.put("Store1","Plovdiv");
        store.put("Store2","Varna");

        JSONObject storeObject = new JSONObject();
        store.put("Store",storeObject);

        JSONArray stores = new JSONArray();
        stores.add(carObject);
        stores.add(storeObject);


        try {
            file = new FileWriter("car.json");
            file.write(stores.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

    }








