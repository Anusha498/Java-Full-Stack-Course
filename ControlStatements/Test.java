public class Test {
    public static void main(String[] args){
        //0 to 4 -> Toddler
        //5 to 12 -> Child
        //13 to 19 -> Teenager
        //20 to 26 -> Young Adult
        //27 Above-> Adult
        int age = 10;
        if (age >= 0 && age <= 4) {
            System.out.println("Toddler");
        } else if (age >= 5 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 26) {
            System.out.println("Young Adult");
        } else if (age >= 27) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid age");
        }

        // Using switch statement
        switch (age) {
            case 0:
                   
            
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Toddler");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Child");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println("Teenager");
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                System.out.println("Young Adult");
                break;
            default:
                System.out.println("Adult");
                break;
        }

        System.out.println(age);


        //switch case - using arrow operator (from java 8 supports)


        switch (age) {
            case 0, 1, 2, 3, 4 -> System.out.println("Toddler");
            case 5, 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Child");
            case 13, 14, 15, 16, 17, 18, 19 -> System.out.println("Teenager");
            case 20, 21, 22, 23, 24, 25, 26 -> System.out.println("Young Adult");
            default -> System.out.println("Adult");
        };
        System.out.println(age);
    }
    
}
