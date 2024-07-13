public class Enemy {
<<<<<<< HEAD
=======
    private AliveTypes aliveTypes;
    private int speed;
    private int Hp;
    private double AttackDamage;
    private int bulletSpeed;
    private String img;

    public Enemy() {
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
        return AttackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        AttackDamage = attackDamage;
    }

    public int getBulletSpeed() {
        return bulletSpeed;
    }

    public void setBulletSpeed(int bulletSpeed) {
        this.bulletSpeed = bulletSpeed;
    }
>>>>>>> 5499546 (First commit)
}
