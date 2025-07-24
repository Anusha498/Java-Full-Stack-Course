package Conditional;

public class TuitionDiscount {
    
    public static void main(String[] args) {
        int gradeLevel = 10;
        double tuitionFee = 10000.0;
        boolean isTopper = true;

        double discountPercentage = 0.0;

        if (gradeLevel >= 9 && gradeLevel <= 12) {
            if (isTopper) {
                discountPercentage = 20.0; // 20% discount for toppers
            } else {
                discountPercentage = 10.0; // 10% discount for others
            }
        }else if(gradeLevel >= 6 && gradeLevel <= 8) {
            
                discountPercentage = 5.0; // 15% discount for toppers
            } else {
                discountPercentage = 0.0; // 5% discount for others
            }
            if(gradeLevel == 10) {
                discountPercentage += 3.0; // No discount for 6th grade

            }else if(gradeLevel == 12) {
                discountPercentage += 5.0; // Additional discount for 7th grade
            } 

            double discountAmount = tuitionFee * (discountPercentage / 100.0);
            double finalTuitionFee = tuitionFee - discountAmount;
            
            System.out.println("------Tuition Discount Calculation------");
            System.out.println("Grade Level: " + gradeLevel);
            System.out.println("Base Tuition Fee: " + tuitionFee);
            System.out.println(" Total Discount Percentage: " + discountPercentage + "%");
            System.out.println("Final Tuition Fee after discount: " + finalTuitionFee);
        }     
    
}


