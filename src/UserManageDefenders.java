import java.util.Scanner;

public class UserManageDefenders {
    static Scanner sr = new Scanner(System.in);
    static char c;

    static void moveDefenders() {
        input();
        switch (c) {
            case 'w' -> {
            }
            case 'a' -> {
            }
            case 's' -> {
            }
            case 'd' -> {
            }
        }
    }

    private static void input() {
        System.out.print("Please enter only w,a,s,d:");
        String input = sr.nextLine();
        c = input.toLowerCase().charAt(0);
        if (!(c == 'w' || c == 'a' || c == 's' || c == 'd')) {
            System.out.println("Invalid input!!!");
            input();
        }
    }
}
