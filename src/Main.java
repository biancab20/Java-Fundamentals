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
        System.out.println("Please enter the size of your group and press [ENTER] ");
        int groupSize = scanner.nextInt();
        System.out.println("group size: " + groupSize);

        Student[] students = new Student[groupSize];

        for(int i=0; i<groupSize; i++){
            System.out.println("Please enter the name of student #" + (i+1) + " and press [ENTER]: ");
            String name = scanner.nextLine();
            students[i] = new Student(name);
        }
        scanner.nextLine();

        for(int i=0; i < groupSize; i++){
            System.out.println("Student #" + (i + 1) + ": " + students[i].getName());
        }
        scanner.nextLine();

        for(int i=0; i<groupSize; i++){
            System.out.println("Is student #" + (i + 1) + " (" + students[i].getName() + ") present? [Y/N + ENTER]: ");
            String attendance = scanner.nextLine();
            boolean presence = attendance.equalsIgnoreCase("Y");
            students[i].setPresent(presence);
        }
        scanner.nextLine();

        for(int i=0; i<groupSize; i++){
            System.out.printf("Student #%d: %s      | Present: %s\n", (i+1),students[i].getName(), students[i].isPresent());
        }
        scanner.close();
    }
}