public class Enemy implements NPC{
    private final AliveTypes aliveTypes = AliveTypes.KNIGHT;
    private int speed = 50;
    private double hp = 10;
    private double attackDamage = 20;
    private String img = "c ";

    public Enemy() {
        setImg();
    }

    public Enemy(int speed, int hp, double attackDamage) {
        this.speed = speed;
        this.hp = hp;
        this.attackDamage = attackDamage;
        setImg();
    }

    public void setImg() {
        if (aliveTypes == AliveTypes.KNIGHT) {
            this.img = "■";
        } else if (aliveTypes == AliveTypes.WIZARD) {
            this.img = "◆";
        } else {
            this.img = "▲";
        }
    }

    public AliveTypes getAliveTypes() {
        return aliveTypes;
    }

    public String getImg() {
        return img;
    }

    public int getSpeed() {
        return speed;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttackDamage() {
        return attackDamage;
    }
}