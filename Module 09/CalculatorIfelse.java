import java.util.Scanner;
public class CalculatorIfelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();

        if (op == '+') System.out.println(a + b);

        if (op == '-') System.out.println(a - b);

        if (op == '*') System.out.println(a * b);

        if (op == '/') System.out.println(a / b);

        else{
            System.out.println("Invalid operator");
        }
    }
}
