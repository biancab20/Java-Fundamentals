import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Main myProgram = new Main();
        myProgram.start();
    }
    void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String course = scanner.nextLine();
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.println();
        double averageGrade =0;
        int maximumGrade = 0;
        //numberOfStudents +=1;
        String[] students = new String[numberOfStudents];
        for (int i = 0; i<numberOfStudents; i++){
            System.out.printf("Enter name of student %d: ", i+1);
            students[i] = scanner.next();
        }
        int[] grades = new int[numberOfStudents];
        System.out.println();
        for (int i = 0; i<numberOfStudents; i++){
            System.out.printf("Enter grade of %s: ", students[i]);
            grades[i] = scanner.nextInt();
            averageGrade += (double)grades[i];
            if(grades[i]>maximumGrade) {
                maximumGrade = grades[i];
            }
        }
        averageGrade /= (double)numberOfStudents;
        System.out.printf("\nAverage grade: %.1f: \n", averageGrade);
        for (int i = 0; i<numberOfStudents; i++) {
            if (grades[i] == maximumGrade) {
                System.out.printf("Student %s has maximum grade: %d \n\n", students[i], maximumGrade);
                break;
            }
        }
        for (int i = 0; i<numberOfStudents; i++){
            System.out.printf("Grade for student %s (course %s): %d \n", students[i], course, grades[i]);
        }
    }
}