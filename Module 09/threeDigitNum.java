                    // multiple conditions using && or ||
//take positive integer input and tell if it is a three digits number or not
// import java.util.Scanner;
// public class threeDigitNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number:");
//         int n = sc.nextInt();

//         if (n > 99 && n < 999) {
//             System.out.println("3 digit number...");
//         } else {
//             System.out.println("Not an 3 digit number");
//         }
//     }
// }


//take a positive integer input and tell if it is a five digit number or not..
// import java.util.Scanner;
// public class threeDigitNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number:");
//         int num = sc.nextInt();
//          // Checking if it is a five-digit number
//         if (num > 10000 && num < 99999) {
//             System.out.println(num + " is a five-digit number.");
//         } else {
//             System.out.println(num + " is NOT a five-digit number.");
//         }
//     }
// }


//take a positive integer input and tell if it is divisible by 5 0r 3...
import java.util.Scanner;
public class threeDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        //checking if it is divisible by 5 or 3
        if (n%5 == 0 || n%3 == 0) {
            System.out.println("Divisible by 5 or 3 both...");
        } else {
            System.out.println("Not divisible by 5 or 3");
        }
    }
}