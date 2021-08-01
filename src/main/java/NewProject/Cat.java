package NewProject;
import java.io.Serializable;

 public class Cat implements Serializable {
     private static final long serialVersionUID = 4L;
    private String name;
    private int age;
    private String breed;
    private String color;

    public Cat(){

    }
    public Cat(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
}
