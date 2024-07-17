import java.util.Random;
import java.util.Scanner;

public class UserManageDefenders {
    static Scanner sr = new Scanner(System.in);
    static char c;
    static void moveDefenders() {
        RandomRespawn.randomUser();
        input();
        Random random=new Random();
        int row=0,column=0;
        switch (c) {
            case 'w' -> {
                for(int i=0;i<Tower.defender2048.length-1;i++) {
                   for(int j=0;j<Tower.defender2048.length-1;j++) {
                       if( Tower.defender2048[i][j]!=null && Tower.defender2048[i+1][j]!=null  &&Tower.defender2048[i+1][j].getLevel()==Tower.defender2048[i][j].getLevel()) {
                           Tower.defender2048[i][j]=null;
                       Tower.defender2048[i+1][j].setLevel(Tower.defender2048[i+1][j].getLevel()+1);
                       }
                       if (Tower.defender2048[i+1][j]==null && Tower.defender2048[i][j]!=null) {
                           Tower.defender2048[i+1][j]=Tower.defender2048[i][j];
                           Tower.defender2048[i][j]=null;
                       }
                   }
                }

            }
            case 'a' -> {
                if(column-1>0) {

                }
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
