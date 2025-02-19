import java.util.Scanner;
public class BasicProgramer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of student:");
        String name = input.nextLine();
        System.out.print("Enter the score of student:");
        int score = input.nextInt();
        System.out.print(name + " has score " + score + ".");
    }
}
