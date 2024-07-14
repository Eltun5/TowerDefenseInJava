public class Tower {
     static double healthPoint=100;
    static Enemy[][] enemies=new Enemy[15][5];
    static TowerDefender[][] defenders=new TowerDefender[3][5];
    public static void displayTower() {
        System.out.print("""
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                   %s     %s     %s     %s     %s
                _______________________________
                |     |     |     |     |     |
                |  %s  |  %s  |  %s  |  %s  |  %s  |
                |_____|_____|_____|_____|_____|
                |     |     |     |     |     |
                |  %s  |  %s  |  %s  |  %s  |  %s  |
                |_____|_____|_____|_____|_____|
                |     |     |     |     |     |
                |  %s  |  %s  |  %s  |  %s  |  %s  |
                |_____|_____|_____|_____|_____|
                """);
        int length=(healthPoint+"").length();
        System.out.println(" ".repeat(Math.max(0, 15-length/2))+healthPoint
                           +" ".repeat(Math.max(0, 15-length/2+(length%2==0?1:0)))+"\n\n");
    }
}