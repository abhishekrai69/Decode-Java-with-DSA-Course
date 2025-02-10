                    //EVEN & ODD
//write a java program to check whether a given number is even or odd.
// import java.util.Scanner;
// public class EvenOdd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();

//         if(n % 2 == 0) {
//         System.out.println("even");
//         }
//         if (n % 2 == 1) {
//             System.out.println("odd");
//         }
//     } 
// }


//write a java program to print all even and odd numbers from 1 to 10.
// import java.util.Scanner;
// public class EvenOdd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         System.out.println("even numbers:");
//         for (int i = 1; i <= n; i++) {
//             //checking if number is even
//             if (i % 2 == 0) System.out.println(i + " ");
//         }
//         System.out.println("odd numbers: ");
//         for (int i = 1; i <= n; i++){
//             //checking if number is odd
//             if(i % 2 != 0) System.out.println(i + " ");
//         }
//     }
// }


//Write a Java program to calculate the sum of all even numbers and sum of all odd numbers from 1 to N
// import java.util.Scanner;
// public class EvenOdd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number: ");
//         int n = sc.nextInt();

//         int evenSum = 0, oddSum = 0; //variables to store the sums

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 0) {//checking if number is even
//                 evenSum += i; //add to even sum
//             } else {          // if number is odd
//                 oddSum += i; //add to odd sum
//             }
//         }
//         System.out.println("Sum of even number is: " + evenSum);
//         System.out.println("Sum of odd number is: " + oddSum);
//     }
// }


//write a Java Program to Check If a Number is Divisible by 5 or not.
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a positive number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {//check if it is divisible by 5
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 5.");
        }
    }
}