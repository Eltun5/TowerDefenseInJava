public class Tower {
     static double healthPoint=100;
    static Enemy[][] enemies=new Enemy[15][5];
    static TowerDefender[][] defenders=new TowerDefender[3][5];
    static String[][] tower=new String[18][5];
    public static void displayTower() {
        RandomRespawn.respawn();
        locateTower();
        System.out.printf("""
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
                """, (Object) tower);
        int length=(healthPoint+"").length();
        System.out.println(" ".repeat(Math.max(0, 15-length/2))+healthPoint
                           +" ".repeat(Math.max(0, 15-length/2+(length%2==0?1:0)))+"\n\n");
    }
    private static void locateTower(){
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                tower[i][j]=enemies[i][j].getImg();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                tower[15+i][j]=defenders[i][j].getImg();
            }
        }
    }
}