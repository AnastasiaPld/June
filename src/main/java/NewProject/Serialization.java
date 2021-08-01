package NewProject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {
    public static void main(String[] args) throws JsonProcessingException{
        Cat cat = new Cat("Dori",5,"Seem","brown");
        String jsonResult= new ObjectMapper().writeValueAsString(cat);
        System.out.println(jsonResult);
    }




}
