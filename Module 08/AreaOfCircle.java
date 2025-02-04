
// public class AreaOfCircle {
//                          // a = pi r square that is a = 3.1415 * r * r
//     public static void main(String[]args){
//         double r = 6.9;
//         double a = 3.1415 * r * r;
//         System.out.println("Area of circle is: "+a);
//     } 
// }

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[]args){
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        //write value
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        //print output
        System.out.println(a);
    }
}
