import java.util.Scanner;
import java.util.HashMap;
public class app2 {
    public static void main(String[] args) {
        HashMap<String, String> cars = new HashMap<>();

        cars.put("Civic", "Honda");
        cars.put("Range", "Toyota");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("what model are you looking for?");
        String answer = scanner.nextLine();

        //some method to look for string answer inside the hashmap

        
    }
}
