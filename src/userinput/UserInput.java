package userinput;

import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    public String input() {
        System.out.println();
        return scanner.nextLine();

    }
}
