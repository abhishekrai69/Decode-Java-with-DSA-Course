// import java.util.Scanner;
// public class SwitchStatement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number:");
//         int a = sc.nextInt();
//         char op = sc.next().charAt(0);
//         int b = sc.nextInt();

//         switch (op) {
//             case '+':
//                 System.out.println(a+b);
//                 break;
//             case '-':
//                 System.out.println(a-b);
//                 break;
//             case '*':
//                 System.out.println(a*b);
//                 break;
//             case '/':
//                 System.out.println(a/b);
//                 break;
//             default:
//                 System.out.println("Invalid operator");
//         }
//     }
// }

                    //write a program to print days of week
import java.util.Scanner;
public class SwitchStatement {
public static void main(String[] args) {
    int day = 5;
    String dayName;

    switch (day) {
        case 1:
            dayName = "Sunday";
            break;
        case 2:
            dayName = "Monday";
            break;
        case 3:
            dayName = "Tuesday";
            break;
        case 4:
            dayName = "Wednesday";
            break;
        case 5:
            dayName = "Thursday";
            break;
        case 6:
            dayName = "Friday";
            break;
        case 7:
            dayName = "Saturday";
            break;
        default:
            dayName = "Invalid day";
            break;
    }
    System.out.println("The day is: " + dayName);
    }
}
