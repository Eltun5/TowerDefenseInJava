public class Main {
    public static void main(String[] args) {
        TowerDefender towerDefender=new TowerDefender();
Tower.defenders[0][0]=towerDefender;

    while (Tower.healthPoint>0) {
            Tower.displayTower();
            wait(2);
        }
        System.out.println("Game Over");
    }
    private static void wait(int second){
        try{
            Thread.sleep(second*1000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}