public class LMSExample {
    public static void main(String[] args) {
        //Variables
        int studentID = 12345;
        String studentName = "John Doe";
        byte age = 20;
        byte quizScore = 85;
        short assignmentScore = 90;
        byte examScore = 70;
        double attendance = 70;

        //Calculation -->Arithmatic Operators
        double totalScore = quizScore + assignmentScore + examScore;
        double averageScore = totalScore / 3;

        //Determine Student passed --->
        boolean isStudentPassed = averageScore >= 75 ;

        //update Attendance --->Increment Operator
        attendance++;

        //Evaluate student qualified--->
        //requires high attendance(80 and above) and a passing grade
        boolean isStudentQualifiedAward =  attendance >= 80 && isStudentPassed;

        System.out.println("Student Name:" +studentName);
        System.out.println("Total Score:" +totalScore);
        System.out.println("Average Score:" +averageScore);
        System.out.println("Updated Attendance:" +attendance);
        System.out.println("Student Passed:" +isStudentPassed);
        System.out.println("StudentAwarded:" +isStudentQualifiedAward);

    }
}
