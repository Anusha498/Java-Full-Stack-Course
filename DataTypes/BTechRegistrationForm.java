package DataTypes;

public class BTechRegistrationForm { 
    public static void main(String[] args){
        //1.Name of the Candidate
        String candidateName = "Anusha Rallabandi";

        //2.(a)Father's and (b)Mother's Name
        String fatherName = "Rallabandi Chiranjeevi";
        String motherName = "Rallabandi Padma";
        
        //2(c).Category
        String category = "GEN"; // GEN / OBC / SC / ST / Minority / Others

        //2(d).Occupation & Annual Income
        String fatherOccupation = "Mechanic";
        double annualIncome = 200000.00;
        
        //3.Address
        String address = "6-93,Vechareni,Cherial";
        String post = "Cherial";
        String city = "Cherial";
        String district = "Siddipet";
        int pincode = 506223;
        String state = "Telangana";

        //4.Mobile and Email
        String studentMobile = "9959374514";
        String parentMobile = "9959374514";
        String email = "anusha987r@gmail.com";

        //5.Resident of Pilani and Studied in Birla schools
        boolean isResidentOfpilani = false;
        boolean studiedInBirlaSchools = false;
        
        //6.State of domicile
        String domicileState = "Telangana";
        
        //7.JEE Mains
        String jeeRollNo = "12345678";
        int jeeMarks = 150;
        int jeeRank = 5000;

        //8.Branch Preference
        String branchName = "CSE";
        
        //9.Aadhar
        String aadharNumber = "1234 5678 9101";

        //10.Academic details
        //Secondary(X)
        String secondaryBoard = "TSBSE";
        int secondaryYear = 2019;
        String secondarySchool = "ZPHS";
        double secondaryCGPA = 9.5;
        double secondaryTotalMarks = 560;
        double secondaryPercentage = 95.0;
        
        //Sr.Secondary(XII)
        String srSecondaryBoard = "TSBIE";
        int srSecondaryYear = 2021;
        String srSecondarySchool = "MJC";
        double srSecondaryCGPA = 9.2;
        double srSecondaryTotalMarks = 920;
        double srSecondaryPercentage = 92.0;
         
        //Output some sample data
        System.out.println("candidate Name: " + candidateName);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Category: " + category);
        System.out.println("Father's Occupation: " + fatherOccupation);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("Address: " + address);
        System.out.println("Post: " + post);
        System.out.println("City: " + city);
        System.out.println("District: " + district);
        System.out.println("Pincode: " + pincode);
        System.out.println("State: " + state);
        System.out.println("Student Mobile: " + studentMobile);
        System.out.println("Parent Mobile: " + parentMobile);
        System.out.println("Email: " + email);
        System.out.println("Post: " + post);
        System.out.println("Is Resident Of Pilani: " + isResidentOfpilani);
        System.out.println("Studied In Birla Schools: " + studiedInBirlaSchools);
        System.out.println("Domicile State: " + domicileState);
        System.out.println("JEE Roll No.: " + jeeRollNo);
        System.out.println("JEE Marks: " + jeeMarks);
        System.out.println("JEE Rank: " + jeeRank);
        System.out.println("Branch Preference: " + branchName);
        System.out.println("Aadhar Number: " + aadharNumber);
        System.out.println("Secondary Board: " + secondaryBoard);
        System.out.println("Secondary Year: " + secondaryYear);
        System.out.println("Secondary School: " + secondarySchool);
        System.out.println("Secondary CGPA: " + secondaryCGPA);
        System.out.println("Secondary Total Marks: " + secondaryTotalMarks);
        System.out.println("Secondary Percentage: " + secondaryPercentage);

        System.out.println("Sr Secondary Board: " + srSecondaryBoard);
        System.out.println("Sr Secondary Year: " + srSecondaryYear);
        System.out.println("Sr Secondary School: " + srSecondarySchool);
        System.out.println("Sr Secondary CGPA: " + srSecondaryCGPA);
        System.out.println("Sr Secondary Total Marks: " + srSecondaryTotalMarks);
        System.out.println("Sr Secondary Percentage: " + srSecondaryPercentage);
       

    }

}




