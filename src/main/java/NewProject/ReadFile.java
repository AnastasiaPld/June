package NewProject;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.*;

public class ReadFile {
    @SuppressWarnings("unchecked")


    public static void main(String[] args) throws Exception {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("car1.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray cars = (JSONArray) obj;
            System.out.println(cars);

            cars.forEach(car -> parseCarsObject((JSONObject) car));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    private static void parseCarsObject(JSONObject car) {
        //Get employee object within list
        JSONObject cars = (JSONObject) car.get("List");

        //Get model
        String model = (String) cars.get("Model");
        //System.out.println(model);

        //Get store
        String store = (String) cars.get("Store");
        //System.out.println(store);


        //Get year
        String year = (String) cars.get("Year");
      //  System.out.println(year);

    }
}
