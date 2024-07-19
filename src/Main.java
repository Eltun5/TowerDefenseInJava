public class Main {
    public static void main(String[] args) {
        Tower.defenders[0] =new TowerDefender();
        Tower.defenders[1] =new TowerDefender();
        Tower.defenders[2] =new TowerDefender();
        Tower.defenders[3] =new TowerDefender();
        Tower.defenders[4] =new TowerDefender();
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