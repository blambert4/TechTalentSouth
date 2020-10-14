import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> bobo = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter first number");
        int first = Integer.parseInt(scanner.nextLine());
        
        System.out.println(" Enter second number");
        int second = Integer.parseInt(scanner.nextLine());
       
        System.out.println(" Enter third number");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter fourth number");
        int fourth = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter fifth number");
        int fifth = Integer.parseInt(scanner.nextLine());

        bobo.add(first);
        bobo.add(second);
        bobo.add(third);
        bobo.add(fourth);
        bobo.add(fifth);

        //cant figure out these functions

        HashMap<String, String> cars = new HashMap<>();

        cars.put("Civic", "Honda");
        cars.put("Range", "Toyota");
        


}
