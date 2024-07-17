public class BulletManager implements BulletService {
    static Bullet[][] bullets = new Bullet[15][5];
    @Override
    public void attack() {
        move();
        for (int j = 0; j < Tower.defenders2048[0].length; j++) {
            if (Tower.defenders2048[0][j] != null &&
                Tower.defenders2048[0][j].getAliveTypes() == AliveTypes.ARCHER) {
                bullets[14][j] = new Bullet(1,
                        Tower.defenders2048[0][j].getAttackDamage() + 10, "⤉");
            }
        }
    }

    @Override
    public void move() {
        for (int i = 1; i < bullets.length ; i++) {
            for (int j = 0; j < bullets[i].length; j++) {
                if (bullets[i][j] != null && Tower.enemies[i - 1][j] != null) {
                    Tower.enemies[i - 1][j].setHp(Tower.enemies[i - 1][j].getHp() - bullets[i][j].bulletDamage());
                    if (Tower.enemies[i - 1][j].getHp()<=0){
                        Tower.enemies[i - 1][j]=null;
                    }
                    bullets[i][j]=null;
                    continue;
                }
                if (bullets[i][j] != null && Tower.enemies[i][j] != null) {
                    Tower.enemies[i][j].setHp(Tower.enemies[i][j].getHp() - bullets[i][j].bulletDamage());
                    if (Tower.enemies[i][j].getHp()<=0){
                        Tower.enemies[i][j]=null;
                    }
                    bullets[i][j]=null;
                } else if (bullets[i][j] != null && bullets[i - 1][j] == null) {
                    bullets[i - 1][j] = bullets[i][j];
                    bullets[i][j] = null;
                }
            }
        }
    }
}
