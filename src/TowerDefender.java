public class TowerDefender {

    private AliveTypes aliveTypes;
    private int attackSpeed;
    private double attackDamage;
    private int bulletSpeed;
    private String img;

    public TowerDefender() {
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
        return attackSpeed;
    }

    public void setSpeed(int speed) {
        this.attackSpeed = attackSpeed;
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
