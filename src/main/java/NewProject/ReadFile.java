package NewProject;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        String file = "car.json";
        String json = readFileAsString(file);
        System.out.println(json);
    }
    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}








