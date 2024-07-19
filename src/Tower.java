public class Tower {
    static double healthPoint = 100;
    static Enemy[][] enemies = new Enemy[15][5];
    static TowerDefender[] defenders = new TowerDefender[5];
    static String[] tower = new String[117];
    static TowerDefender[][] defender2048 = new TowerDefender[2][5];
    public static void displayTower() {
        EnemyManager enemyManager = new EnemyManager();
        RandomRespawn.respawnEnemy();
        RandomRespawn.respawnDefender();
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
        int length = (healthPoint + "").length();
        System.out.println(" ".repeat(Math.max(0, 15 - length / 2)) + (healthPoint < 0 ? 0 : healthPoint)
                + " ".repeat(Math.max(0, 15 - length / 2 + (length % 2 == 0 ? 1 : 0))));
        enemyManager.move();
        UserManageDefenders.moveDefenders();
        UpgradeMainDefenders.upgrade();
        UpgradeMainDefenders.dynamicChange();
    }
    private static void locateTower() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (BulletManager.bullets[i][j]!=null) {
                    tower[i*5+j] = BulletManager.bullets[i][j].img();
                }else if(enemies[i][j]==null){
                    tower[i*5+j]=" ";
                }
                if (enemies[i][j]!=null) {
                    tower[i*5+j] = enemies[i][j].getImg();
                }else if(BulletManager.bullets[i][j]==null){
                    tower[i*5+j]=" ";
                }
            }
        }
        for (int j = 0; j < 5; j++) {
            if (defenders[j]!=null) {
                int length=(defenders[j].getLevel()+"").length();
                tower[15*5+j]=" ".repeat(2-length/2)+defenders[j].getLevel()+
                                  " ".repeat(2-length/2+(length%2==0 ? 1 : 0))   ;
                tower[16*5+j]=defenders[j].getImg();
            }else{
                tower[15*5+j]="     ";
                tower[16*5+j]=" ";
            }
        }
        for (int i = 0; i < 3; i+=2) {
            for (int j = 0; j < 5; j++) {
                if (defender2048[i/2][j]!=null) {
                    int length=(defender2048[i/2][j].getLevel()+"").length();
                    tower[(17+i)*5+j]=" ".repeat(2-length/2)+defender2048[i/2][j].getLevel()+
                                      " ".repeat(2-length/2+(length%2==0 ? 1 : 0))   ;
                    tower[(18+i)*5+j]=defender2048[i/2][j].getImg();
                }else{
                    tower[(17+i)*5+j]="     ";
                    tower[(18+i)*5+j]=" ";
                }
            }
        }
    }
}