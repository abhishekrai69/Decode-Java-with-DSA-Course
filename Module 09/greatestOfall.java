//take 3 positive integer input and print the greatest of them...
import java.util.Scanner;
public class greatestOfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numbers: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd numbers: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd numbers: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a+" is greatest");
        }
        else if (b > a && b > c) {
            System.out.println(b+" is greatest");
        } 
        else{
            System.out.println(c+" is greatest");
        }
    }
}
