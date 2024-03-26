
import java.util.Scanner;
public class gradecalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the subjects number: ");
		int totalSubjects = scanner.nextInt();
		int totalMarks = 0;

		for (int i = 1; i <= totalSubjects; i++) {
			System.out.print("Enter marks obtained in subject " + i + ": ");
			int subjectMarks = scanner.nextInt();
			totalMarks += subjectMarks;
		}

		double avgPercentage = (double) totalMarks / (totalSubjects * 100) * 100;

		String grade;
		if (avgPercentage >= 90) {
			grade = "A+";
		} else if (avgPercentage >= 80) {
			grade = "A";
		} else if (avgPercentage >= 70) {
			grade = "B";
		} else if (avgPercentage >= 60) {
			grade = "C";
		} else if (avgPercentage >= 50) {
			grade = "D";
		} else {
			grade = "F";
		}

		// Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Percentage: " + avgPercentage + "%");
		System.out.println("Grade: " + grade);

		scanner.close();
	}
}
