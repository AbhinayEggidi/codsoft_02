package internship;
import java.util.Scanner;

public class GradeCaluculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = scan.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) 
        {
            System.out.println("Enter marks for Subject " + i + " (out of 100): ");
            int marks = scan.nextInt();
 
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                i--; 
                continue;
            }

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numberOfSubjects;

        char grade;
        if (averagePercentage >= 90) 
        {
            grade = 'A';
        } 
        else if (averagePercentage >= 80) 
        {
            grade = 'B';
        } 
        else if (averagePercentage >= 70) 
        {
            grade = 'C';
        }
        else if (averagePercentage >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

    }
}
