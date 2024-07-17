public class Tower {
    static double healthPoint = 100;
    static Enemy[][] enemies = new Enemy[15][5];
    static TowerDefender[]defenders = new TowerDefender[5];
    static String[] tower = new String[117];
    static TowerDefender[][] defender2048 = new TowerDefender[4][4];

    public static void displayTower() {
        EnemyManager enemyManager = new EnemyManager();
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
                   %s     %s     %s     %s     %s             _________________________
                   %s     %s     %s     %s     %s             | %s  |  %s  |  %s |  %s|
                   %s     %s     %s     %s     %s             | %s   |  %s   |     |     |
                   %s     %s     %s     %s     %s             |_____|_____|_____|_____|
                   %s     %s     %s     %s     %s             |     |     |     |     |
                   %s     %s     %s     %s     %s             |     |     |     |     |
                   %s     %s     %s     %s     %s             |_____|_____|_____|_____|
                   %s     %s     %s     %s     %s             |     |     |     |     |
                   %s     %s     %s     %s     %s             |     |     |     |     |
                _______________________________          |_____|_____|_____|_____|
                |%s|%s|%s|%s|%s|          |     |     |     |     |
                |  %s  |  %s  |  %s  |  %s  |  %s  |          |     |     |     |     |
                |_____|_____|_____|_____|_____|          |_____|_____|_____|_____|
                """, (Object[]) tower);
        int length = (healthPoint + "").length();
        System.out.println(" ".repeat(Math.max(0, 15 - length / 2)) + (healthPoint < 0 ? 0 : healthPoint)
                + " ".repeat(Math.max(0, 15 - length / 2 + (length % 2 == 0 ? 1 : 0))));
        enemyManager.move();
        UserManageDefenders.moveDefenders();
    }

    private static void locateTower() {
        int count = 0;
        int enemyCounter = 0;
        int defenderCounter = 0;
        int defenderIndexCounter = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (BulletManager.bullets[i][j] != null) {
                    tower[i * 5 + j] = BulletManager.bullets[i][j].img();
                    count++;
                } else if (enemies[i][j] == null) {
                    tower[i * 5 + j] = " ";
                }
                if (i * 5 + j < 35) {

                    if (enemies[i][j] != null) {
                        tower[i * 5 + j] = enemies[i][j].getImg();
                    } else if (BulletManager.bullets[i][j] == null) {
                        tower[i * 5 + j] = " ";
                    }
                } else {
                    if (defenderCounter < 4) {
                        for (int k = 0; k < 4; k++) {
                            defenderCounter++;
                            defenderIndexCounter++;
                            if (defender2048[defenderIndexCounter / 8][k] != null) {
                                int length = (defender2048[defenderIndexCounter / 8][k].getLevel() + "").length();
                                tower[(i* 5 + j)+defenderIndexCounter] = " ".repeat(2 - length / 2) + defender2048[defenderIndexCounter / 8][k].getLevel() +
                                        " ".repeat(2 - length / 2 + (length % 2 == 0 ? 1 : 0));
                            } else {
                                tower[(i* 5 + j)+defenderIndexCounter] = "     ";
                            }
                        }
                        enemyCounter = 0;
                    }
                   else if(enemyCounter<8) {
                        for (int k = 0; k < 4; k++) {
                            defenderCounter++;
                            defenderIndexCounter++;
                            if (defender2048[defenderIndexCounter/8][k] != null) {
                                tower[(i* 5 + j)+defenderIndexCounter] = defender2048[defenderIndexCounter/8][k].getImg();
                            } else {
                                tower[(i* 5 + j)+defenderIndexCounter] = " ";
                            }
                        }
                        enemyCounter = 0;
                    }
                    if ((enemyCounter <= 5) || (enemyCounter<=10 && defenderCounter==8)) {
                        if (enemies[i][j] != null) {
                            tower[i * 5 + j+defenderIndexCounter] = enemies[i][j].getImg();
                        } else if (BulletManager.bullets[i][j] == null) {
                            tower[i * 5 + j+defenderIndexCounter] = " ";
                        }
                        if(enemyCounter==10) {
                            defenderCounter=0;
                        }
                        enemyCounter++;
                    }

                }
            }
            if (count == 5) {
                tower[i * 5 + 4] = BulletManager.bullets[i][4].img() + " ";
            }
            count = 0;
        }
            for (int j = 0; j < 5; j++) {
                if (defenders[j] != null) {
                    int length = (defenders[j].getLevel() + "").length();
                    tower[(15 * 5) +8* 3 + j] = " ".repeat(2 - length / 2) + defenders[j].getLevel() +
                            " ".repeat(2 - length / 2 + (length % 2 == 0 ? 1 : 0));
                    tower[(15 * 5) +8* 3 + j] = defenders[j].getImg();
                } else {
                    tower[(15 * 5) +8* 3 + j] = "     ";
                    tower[(15 * 5) +8* 3 + j] = " ";
                }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (defender2048[i][j] != null) {
                    int length = (defender2048[i][j].getLevel() + "").length();

                } else {

                }
            }
        }
    }
}