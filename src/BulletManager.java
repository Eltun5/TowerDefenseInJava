public class BulletManager implements BulletService {

    @Override
    public void attack() {
        for (int j = 0; j < Tower.defenders[0].length; j++) {
            if (Tower.defenders[0][j] != null && Tower.defenders[0][j].getAliveTypes() == AliveTypes.ARCHER) {
                Bullet bullet = new Bullet(1, 10, "⤉");
                move(bullet);
            }
        }
    }

    @Override
    public boolean move(Bullet bullet) {
        for (int i = 0; i < Tower.enemies.length; i++) {
            for (int j = 0; j < Tower.enemies[i].length; j++) {
                if (Tower.enemies[i][j] != null) {
                    for (int k = 0; k < Tower.defenders[0].length; k++) {
                        if (Tower.defenders[0][k]!= null && Tower.defenders[0][k].getAliveTypes() == AliveTypes.ARCHER) {
                            double damage = Tower.defenders[0][k].getAttackDamage() + bullet.bulletDamage() -
                                    Tower.enemies[i][j].getHp();
                            if (damage > 0) {
                                Tower.enemies[i][j] = null;
                            } else {
                                Tower.enemies[i][j].setAttackDamage(damage);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
