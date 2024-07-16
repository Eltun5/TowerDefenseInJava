public class TowerDefender implements NPC {
    private final AliveTypes aliveTypes = AliveTypes.ARCHER;
    private int attackSpeed = 1;
    private double attackDamage = 10;
    private String img;
    private int level = 1;
    public TowerDefender() {
        setImg();
    }
    public void setImg(){
        if (aliveTypes == AliveTypes.KNIGHT) {
            this.img="⚝";
        } else if (aliveTypes == AliveTypes.WIZARD) {
            this.img="★";
        } else {
            this.img="✡";
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

    public String getImg() {
        return img;
    }
    public int getSpeed() {
        return attackSpeed;
    }

    public void setSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }
}