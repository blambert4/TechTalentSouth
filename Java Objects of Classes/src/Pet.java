//lets make a class
//oops cant capitalize that one
public class Pet{
    private String name;
    private String type;
    private int age;
    private String location;

    //my variables are private. i dont want anyone to access them.

    //one constructor without any arguments
    public Pet(){}

    public Pet(String name, String type, int age, String location) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.location = location;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(int age) {
        this.age = age;
    }
}