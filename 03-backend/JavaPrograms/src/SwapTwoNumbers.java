public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("--Before Swap--");
        int a = 25;
        int b = 45;
        System.out.println("First Number:" +a);
        System.out.println("Second Number:" +b);
        System.out.println("--After Swap--");
        int temp = a;
        a=b;
        b=temp;
        System.out.println("First Number:" +a);
        System.out.println("Second Number:" +b);
    }
}
