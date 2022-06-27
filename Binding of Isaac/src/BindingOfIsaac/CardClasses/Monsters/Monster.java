package BindingOfIsaac.CardClasses.Monsters;
import BindingOfIsaac.Effects.Effect;

public abstract class Monster extends MonsterCard {
    private int health;
    private int attack;
    private int diceThreshold;
    private final int baseHealth;
    private final int baseAttack;
    private final int baseDiceThreshold;

    private Effect reward;

    public int getHealth(){return this.health;}
    public int getAttack(){return this.attack;}
    public int getDiceThreshold(){return this.diceThreshold;}
    public int getBaseHealth(){return this.baseHealth;}
    public int getBaseAttack(){return this.baseAttack;}
    public int getBaseDiceThreshold(){return this.baseDiceThreshold;}

    public void Heal(int i){this.health=this.health+i>this.baseHealth?this.baseHealth:this.health+i; }
    public void HealPastBase(int i){ this.health+=i; }
    public void takeDamage(int i){ this.health=this.health-i>=0?this.health-i:0;}
    public void setHealth(int i){this.health=i;}

    public void RaiseAttack(int i){this.attack=+i;}
    public void LowerAttack(int i){this.attack=this.attack-i<0?0:this.attack-i;}
    public void setAttack(int i){this.attack=i;}

    public void raiseDiceThreshold(int i){this.diceThreshold=this.diceThreshold+i>6?6:this.diceThreshold+i;}
    public void lowerDiceThreshold(int i){this.diceThreshold=this.diceThreshold-i<1?1:this.diceThreshold-i;}
    public void setDiceThreshold(int i){this.diceThreshold=i;}

    public Monster(int baseHealth, int baseAttack, int baseDiceThreshold, int health, int attack, int diceThreshold){
        super();
        this.baseHealth=baseHealth;
        this.baseAttack=baseAttack;
        this.baseDiceThreshold=baseDiceThreshold;
        this.health=health;
        this.attack=attack;
        this.diceThreshold=diceThreshold;
    }



    @Override
    public String deckType() {
        return "Monster";
    }





}
