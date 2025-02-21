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

//write a program to print days of week by using switch statement...
// import java.util.Scanner;
// public class SwitchStatement {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int button = sc.nextInt();

//     switch (button) {
//     case 1 :
//        System.out.println("Monday");
//        break;
//    case 2 :
//        System.out.println("Tuesday");
//        break;
//    case 3 :
//        System.out.println("Wednesday");
//        break;
//    case 4 :
//        System.out.println("Thursday");
//        break;
//    case 5:
//        System.out.println("Friday");
//        break;
//    case 6 :
//        System.out.println("Saturday");
//        break;
//    case 7 :
//        System.out.println("Sunday");
//        break;
//        default : System.out.println("Invalid number");
//      }       
//    }
// }


//Ask the user to enter the number of the month & print the name of the month.ex - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
import java.util.Scanner;
public class SwitchStatement {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    switch (button) {
    case 1 :
       System.out.println("January");
       break;
   case 2 :
       System.out.println("Febuary");
       break;
   case 3 :
       System.out.println("March");
       break;
   case 4 :
       System.out.println("April");
       break;
   case 5:
       System.out.println("May");
       break;
   case 6 :
       System.out.println("June");
       break;
   case 7 :
       System.out.println("July");
       break;
    case 8 :
       System.out.println("August");
       break;
    case 9 :
       System.out.println("September");
       break;
    case 10 :
       System.out.println("October");
       break;
    case 11 :
       System.out.println("November");
       break;
    case 12 :
       System.out.println("DECEMBER");
       break;
       default : System.out.println("Invalid number");
    }       
  }
}