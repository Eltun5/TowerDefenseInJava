import java.util.Random;
public class RandomRespawn {
    static int rate=1,callTime=0,eachMonsterLevel=3;
    static void respawn(){
        for (int i = 0; i < (int) (Math.random() * 5) ; i++) {
            int a;
            do {
                a=(int)(Math.random()*5);
            }while (Tower.enemies[0][a]!=null);
            int hp= (int) (Math.random() * rate) + 100;
            Tower.enemies[0][a]=new Enemy(1,hp,20);
        }
        callTime++;
        if (callTime%10==0){
            rate+=(int)(Math.random()*eachMonsterLevel);
        }
    }
    static void randomUser() {
        Random random = new Random();
        for(int i=0;i<random.nextInt(2);i++) {
            int row,column;
            do{
                row=random.nextInt(2);
                column=random.nextInt(5);

            }while (Tower.defender2048[row][column]!=null);
        Tower.defender2048[row][column]=new TowerDefender();
        }
    }
}
