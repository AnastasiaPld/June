package NewProject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;

public class Serialization {
    private static FileWriter file;

    public static void main(String[] args) throws IOException {
        JSONObject car = new JSONObject();
        car.put("Model", "Volvo");
        car.put("Model", "BMW");
        car.put("Model", "Fiat");

        JSONArray store = new JSONArray();
        store.add("Store: Sofia");
        store.add("Store: Plovdiv");
        store.add("Store: Varna");
        store.add("Store: Veliko Tarnovo");
        car.put("Cars list", store);

        try {
            file = new FileWriter("car.txt");
            file.write(car.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}







