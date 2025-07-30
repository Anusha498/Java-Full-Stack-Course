public class Demo {
    public static void main(String[] args) {
        int number = 10;

        // Using if-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Using switch statement
        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            case 10:
                System.out.println("The number is ten.");
                break;
            default:
                System.out.println("The number is something else.");
        }

        // Using for loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //using terinary operator
        String result = (number % 2 == 0) ? "The number is even." : "The number is odd.";
        System.out.println(result);

        //using else if ladder
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }


        //switch case
        switch (number) {
            case 0:
                System.out.println("The number is zero.");
                break;
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            default:
                System.out.println("The number is greater than two.");
                break;
        }

        

    }

}