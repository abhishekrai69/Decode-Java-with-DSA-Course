//Given the length and breadth of a rectangle,write a program to find whether the area of the rectangle is greater
//then perimeter of rectangle..
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        
        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();
        
        // Calculate area and perimeter
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        
        // Compare area and perimeter
        if (area > perimeter) {
            System.out.println("The area of the rectangle is greater than its perimeter.");
        } else {
            System.out.println("not greater than its perimeter.");
        }
    }
}
