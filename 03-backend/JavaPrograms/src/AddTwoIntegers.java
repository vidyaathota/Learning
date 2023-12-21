import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum is:" +(num1+num2));
    }
}
