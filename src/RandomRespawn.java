public class RandomRespawn {
    static int rate=1,callTime=0,eachMonsterLevel=3;
    static void respawn(){
        for (int i = 0; i < (int) (Math.random() * 5) ; i++) {
            int a;
            do {
                a=(int)(Math.random()*5);
            }while (Tower.enemies[0][a]!=null);
            Tower.enemies[0][a]=new Enemy();
        }
        callTime++;
        if (callTime%10==0){
            rate+=(int)(Math.random()*eachMonsterLevel);
        }
    }
}
