package userinput;
import java.util.Scanner;

//Обработка всех вводов в консоль
public class UserInput {
    Scanner scanner = new Scanner(System.in);
    public String input() {
        System.out.println();
        return scanner.nextLine();

    }
}
