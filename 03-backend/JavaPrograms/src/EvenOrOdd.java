import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //using ternary operator
//        String evenOdd = (num % 2 ==0)?"even":"odd";
//        System.out.println(num +" is "+ evenOdd);

        if(num % 2==0) {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
