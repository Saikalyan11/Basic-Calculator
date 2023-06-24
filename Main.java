import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        System.out.println();
        System.out.println("First lets do Addition");

        // Add

        calculator cal = new calculator();
        System.out.println("First Number:");
        cal.first_number = sc.nextDouble();
        System.out.println("Second Number:");
        cal.second_number = sc.nextDouble();
        cal.addtwono();

        System.out.println("Now lets do Subtraction");
        System.out.println();

        // Sub

        calculator cal1 = new calculator();
        System.out.println("First Number:");

        cal1.first_number = sc.nextDouble();
        System.out.println("Second Number:");

        cal1.second_number = sc.nextDouble();
        cal1.subtwono();

        System.out.println("Now lets go with Multiplication");
        System.out.println();

        // Multiplication

        calculator cal2 = new calculator();
        System.out.println("First Number:");

        cal2.first_number = sc.nextDouble();
        System.out.println("Second Number:");

        cal2.second_number = sc.nextDouble();
        cal2.Multwono();

        System.out.println("Now lets go with Division");
        System.out.println();

        // Division

        calculator cal3 = new calculator();
        System.out.println("First Number:");

        cal3.first_number = sc.nextDouble();
        System.out.println("Second Number:");

        cal3.second_number = sc.nextDouble();
        cal3.Divtwono();

        System.out.println("Now lets go with Bitwise operator");

        System.out.println();

        // Bitwise
        calculator cal4 = new calculator();
        System.out.println("First Number:");

        cal4.first_number = sc.nextDouble();
        System.out.println("Second Number:");

        cal4.second_number = sc.nextDouble();
        cal4.addtwono();

    }
}
