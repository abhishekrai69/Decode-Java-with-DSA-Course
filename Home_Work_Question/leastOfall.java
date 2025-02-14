package Home_Work_Question;
//take 3 positive integers input and print the least of them...
import java.util.Scanner;
public class leastOfall {
    public static void main(String[] args) {
        //create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        //taking three positive integer as input from the user
        System.out.println("Enter 1 number: ");
        int x = sc.nextInt();
        System.out.println("Enter 2 number: ");
        int y = sc.nextInt();
        System.out.println("Enter 3 number: ");
        int z = sc.nextInt();
        //finding the least or smallest number using else if
        if (x<y && x<z) {
            System.out.println(x+" is smallest of all");
        }
        else if (y<x && y<z){
            System.out.println(y+" is smallest of all");
        }
        else {
            System.out.println(z+" is smallest of all");
        }
    }
}
