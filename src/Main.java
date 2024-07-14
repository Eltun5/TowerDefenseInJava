public class Main {
    public static void main(String[] args) {
        while (Tower.healthPoint!=0) {
            Tower.displayTower();
            wait(2);
        }
    }
    private static void wait(int second){
        try{
            Thread.sleep(second*1000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}