package NewProject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fs = new FileOutputStream("cat.txt")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            Cat cat = new Cat("Dori", 5, "Seem", "brown");
            Cat cat1 = new Cat("Mee", 5, "Frees", "white");
            Cat cat2 = new Cat("Mo", 4, "Yt", "blue");
            String jsonResult = new ObjectMapper().writeValueAsString(cat);
            String jsonResult1 = new ObjectMapper().writeValueAsString(cat1);
            String jsonResult2 = new ObjectMapper().writeValueAsString(cat2);
            os.writeObject(cat);
            os.writeObject(cat1);
            os.writeObject(cat2);
            os.close();
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}







