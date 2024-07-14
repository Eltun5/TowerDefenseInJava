public class Enemy {

    private AliveTypes aliveTypes=AliveTypes.KNIGHT;
    private int speed=50;
    private int Hp=100;
    private double attackDamage=20;
    private int bulletSpeed=50;
    private String img;

    public Enemy() {
      Img();
    }

    public Enemy(int speed, int hp, double attackDamage, int bulletSpeed) {
        this.speed = speed;
        Hp = hp;
        this.attackDamage = attackDamage;
        this.bulletSpeed = bulletSpeed;
        Img();
    }
public void  Img() {
    if(aliveTypes==AliveTypes.KNIGHT) {
        setImg("■");
    }
    else if(aliveTypes==AliveTypes.WIZARD) {
        setImg("◆");
    }
    else {
        setImg("▲");
    }
}
    public AliveTypes getAliveTypes() {
        return aliveTypes;
    }

    public void setAliveTypes(AliveTypes aliveTypes) {
        this.aliveTypes = aliveTypes;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getBulletSpeed() {
        return bulletSpeed;
    }

    public void setBulletSpeed(int bulletSpeed) {
        this.bulletSpeed = bulletSpeed;
    }
}
