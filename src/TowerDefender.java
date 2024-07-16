public class TowerDefender {

    private AliveTypes aliveTypes = AliveTypes.ARCHER;
    private int attackSpeed = 1;
    private double attackDamage = 10;
    private String img;
    private int level = 1;

    public TowerDefender() {
        if (aliveTypes == AliveTypes.KNIGHT) {
            setImg("⚝");
        } else if (aliveTypes == AliveTypes.WIZARD) {
            setImg("★");
        } else {
            setImg("✡");
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

}
