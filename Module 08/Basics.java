                    //first program in java

// public class Basics {
//     public static void main(String[] args) {

//         System.out.println("mera village");
//         System.out.print("hamar village");
        
//     }
// }

                    // normal variable
// public class Basics {
//     public static void main(String[] args){

//         int x;  //declaration
//         x = 69; //initialization
//         int y = 24;
//         System.out.print(y);
//     }
// }

                    //updating variable
// public class Basics {
//     public static void main(String[]args){
        
//         int x = 8;
//         System.out.println(x);
//         x = 12;
//         System.out.println(x);
//         x = x + 5;
//         System.out.println(x);
//         x = x - 9;
//         System.out.println(x);
//     }
// }

                    //arithmetic operation
// public class Basics {
//     public static void main(String[]args){
//         double x = 9, y = 8;
//         System.out.println(x+y);
//         System.out.println(x-y);
//         System.out.println(x*y);
//         System.out.println(x/y);
//     }
// }

                    //how to take input in java

// import java.util.Scanner;
// public class Basics {
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         System.out.println(n*n);
//     }
// }

                    //sum of two numbers input from user
// import java.util.Scanner;
// public class Basics {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter 1st number: ");
//         int a = sc.nextInt();
//         System.out.print("enter 2nd number: ");
//         int b = sc.nextInt();
//         System.out.println(a+b);
//     }
// }

                    // character data type
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character: ");
        char ch = sc.next().charAt(0);
        int x = (int)ch;
        System.out.println(x);
    }
}