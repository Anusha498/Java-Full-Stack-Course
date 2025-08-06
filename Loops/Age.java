
import java.util.Scanner;
public class Age{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
   
     //read text
    //System.out.println("What is your name:");
    //String name = sc.next();
    //System.out.println("Welcome:"+name);

    //Simulate while loop
    //System.out.println("Welcome,Do you want to continue? (yes/no)");
    //String user_choice = sc.next();
    //while (user_choice.equals("yes")) {
      //  System.out.println("Do this work");

    // }
    //while
    int count = 1;
    while (count <= 5) {
            System.out.println("Hi: " + count);
            count++;
        }
        
        // Simulate do-while loop
        
        do {
            System.out.println("Hi: " +count);
           count++;
        } while (count<=4 );
        
        sc.close();
    }
}
