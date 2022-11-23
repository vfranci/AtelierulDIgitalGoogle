package oop.pb1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public void attack(Fighter f){
        f.health = f.health - this.damagePerAttack;
    }

    public Fighter (String name, int health, int damagePerAttack){
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    public int getHealth(){
        return health;
    }

    public String toString(){
        return name;
    }
}
