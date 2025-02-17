package Home_Work_Question;
// import java.util.Scanner;
// public class YoungestOfall {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //input ages of abhishek,sanskar and aayush
//         System.out.println("Enter the age of abhishek: ");
//         int abhishek = sc.nextInt();

//         System.out.println("Enter the age of sanskar: ");
//         int sanskar = sc.nextInt();

//         System.out.println("Enter the age of aayush: ");
//         int aayush = sc.nextInt();
//         //determine the youngest age
//         if (abhishek < aayush && abhishek < sanskar) {
//             System.out.println(abhishek+ " is youngest");
//         }
//         else if (aayush < abhishek && aayush < sanskar){
//             System.out.println(aayush+" is youngest");
//         }
//         else {
//             System.out.println(sanskar+" is youngest");
//         }
//     }
// }

                    //ANOTHER METHOD
import java.util.Scanner;
public class YoungestPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ages of ABHISHEK, SANSKAR, and AAYUSH
        System.out.print("Enter the age of Abhishek: ");
        int ageAbhishek = scanner.nextInt();

        System.out.print("Enter the age of Sanskar: ");
        int ageSanskar = scanner.nextInt();

        System.out.print("Enter the age of Aayush: ");
        int ageAayush = scanner.nextInt();

        // Determine the youngest age
        int youngestAge = Math.min(ageAbhishek, Math.min(ageSanskar, ageAayush));

        // Determine who is the youngest
        if (youngestAge == ageAbhishek) {
            System.out.println("Abhishek is the youngest.");
        } else if (youngestAge == ageSanskar) {
            System.out.println("Sanskar is the youngest.");
        } else {
            System.out.println("Aayush is the youngest.");
        }

        scanner.close();
    }
}
