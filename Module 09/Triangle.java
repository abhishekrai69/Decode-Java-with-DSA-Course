// take 3 numbers input and tell if they can be the sides of triangle or not.
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st side:");
        int a = sc.nextInt();

        System.out.print("Enter 2nd side:");
        int b = sc.nextInt();

        System.out.print("Enter 3rd side:");
        int c = sc.nextInt();

        if (a+b > c && b+c >a && c+a>b) {
            System.out.println("Valid triangle...");
        } else {
            System.out.println("Not a valid triangle");
        }
    }
}
 