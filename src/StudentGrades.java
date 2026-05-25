import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Student name: ");
            names[i] = sc.nextLine();

            System.out.print("Grade: ");
            grades[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n--- Grade List ---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + ":" + grades[i]);
        }
    }
}
