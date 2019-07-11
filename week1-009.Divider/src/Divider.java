
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        double x = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        double y = Integer.parseInt(reader.nextLine());

        double z = x / y;
        String result = "Division: " + x + " / " + y + " = " + z;
        System.out.println(result);
    }
}
