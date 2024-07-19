public class UpgradeMainDefenders {
    static void upgrade() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (Tower.defender2048[i][j] != null) {
                    for (int k = 0; k < 5; k++) {
                        if (Tower.defender2048[i][j].getLevel() > Tower.defenders[k].getLevel()) {
                            Tower.defenders[k] = Tower.defender2048[i][j];
                            Tower.defender2048[i][j] = null;
                            break;
                        }
                    }
                }
            }
        }
    }
    static void dynamicChange() {
        for (int i = 0; i < 4; i++)
            if (Tower.defenders[i].getLevel() != Tower.defenders[i + 1].getLevel()) {
                boolean hasEnemy = false;
                int enemyColumn = 0;
                double highHp = 0;
                for (int j = 14; j >= 0 && !hasEnemy; j--) {
                    for (int k = 0; k < 5; k++) {
                        if (Tower.enemies[j][k] != null) {
                            if (highHp <= Tower.enemies[j][k].getHp()) {
                                highHp = Tower.enemies[j][k].getHp();
                                hasEnemy = true;
                                enemyColumn = k;
                            }
                        }
                    }
                }
                if (hasEnemy) {
                    if (highHp / Tower.defenders[i].getAttackDamage() != highHp / Tower.defenders[i + 1].getAttackDamage()) {
                        if (Tower.defenders[i].getAttackDamage() > Tower.defenders[i + 1].getAttackDamage()) {
                            if (i != enemyColumn && Tower.defenders[i].getLevel() != Tower.defenders[enemyColumn].getLevel()) {
                                System.out.println("need to change 1");
                                TowerDefender towerDefender = Tower.defenders[enemyColumn];
                                Tower.defenders[enemyColumn] = Tower.defenders[i];
                                Tower.defenders[i] = towerDefender;
                            }
                        } else {
                            if ((i + 1) != enemyColumn && Tower.defenders[i + 1].getLevel() != Tower.defenders[enemyColumn].getLevel()) {
                                System.out.println("need to change 2a");
                                TowerDefender towerDefender = Tower.defenders[enemyColumn];
                                Tower.defenders[enemyColumn] = Tower.defenders[i + 1];
                                Tower.defenders[i + 1] = towerDefender;
                            }
                        }
                    }
                }
            }
    }
}
