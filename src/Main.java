public class Main {
    public static void main(String[] args) {
        TowerDefender towerDefender = new TowerDefender();
        Tower.defenders[0] = towerDefender;
        Tower.defenders[1] =towerDefender;
        Tower.defenders[2] =towerDefender;
        Tower.defenders[3] =towerDefender;
        Tower.defenders[4] =towerDefender;

        BulletManager bulletManager = new BulletManager();

        while (Tower.healthPoint > 0) {
            Tower.displayTower();
            bulletManager.attack();
        }
        System.out.println("Game Over");

    }

//    private static void wait(int second) {
//        try {
//            Thread.sleep(second * 1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

}