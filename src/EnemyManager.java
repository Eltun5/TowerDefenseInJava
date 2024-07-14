public class EnemyManager implements EnemyService{
    @Override
    public void move() {
    for(int i=0;i<Tower.enemies.length-1;i++) {
for(int j=0;j<Tower.enemies[i].length;j++) {
if(Tower.enemies[i][j]!=null && Tower.enemies[i+1][j]==null) {
    Tower.enemies[i+1][j] = Tower.enemies[i][j];
    Tower.enemies[i][j]=null;

}
}
    }
    }

    @Override
    public void attack() {
            for(int j=0;j<Tower.enemies[Tower.enemies.length-1].length;j++) {
                if(Tower.enemies[Tower.enemies.length-1][j]!=null) {
                    Tower.healthPoint = Tower.healthPoint -Tower.enemies[Tower.enemies.length-1][j].getAttackDamage();
                }
        }
    }
}
