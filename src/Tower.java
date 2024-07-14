public class Tower {
     static double healthPoint=100;
    static Enemy[][] enemies=new Enemy[15][5];
    static TowerDefender[][] defenders=new TowerDefender[3][5];
    static String[] tower=new String[105];

    public static void displayTower() {
        EnemyManager enemyManager=new EnemyManager();
        RandomRespawn.respawn();
        locateTower();
        enemyManager.attack();
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
               
                _______________________________
                |%s|%s|%s|%s|%s|
                |  %s  |  %s  |  %s  |  %s  |  %s  |
                |_____|_____|_____|_____|_____|
                |%s|%s|%s|%s|%s|
                |  %s  |  %s  |  %s  |  %s  |  %s  |
                |_____|_____|_____|_____|_____|
                |%s|%s|%s|%s|%s|
                |  %s  |  %s  |  %s  |  %s  |  %s  |
                |_____|_____|_____|_____|_____|
                """, (Object[]) tower);
        int length=(healthPoint+"").length();
        System.out.println(" ".repeat(Math.max(0, 15-length/2))+healthPoint
                           +" ".repeat(Math.max(0, 15-length/2+(length%2==0?1:0)))+"\n\n");
        enemyManager.move();
    }
    private static void locateTower(){
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (enemies[i][j]!=null) {
                    tower[i*5+j] = enemies[i][j].getImg();
                }else{
                    tower[i*5+j]=" ";
                }
            }
        }
        for (int i = 0; i < 5; i+=2) {
            for (int j = 0; j < 5; j++) {
                if (defenders[i/2][j]!=null) {
                    int lenght=(defenders[i/2][j].getLevel()+"").length();

                    tower[(15+i)*5+j]=" ".repeat(2-lenght/2)+defenders[i/2][j].getLevel()+
                            " ".repeat(2-lenght/2+(lenght%2==0 ? 1 : 0))   ;
                    tower[(16+i)*5+j]=defenders[i/2][j].getImg();
                }else{
                    tower[(15+i)*5+j]="     ";
                    tower[(16+i)*5+j]=" ";
                }
            }
        }
    }
}