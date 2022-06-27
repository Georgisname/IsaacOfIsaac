package BindingOfIsaac;

import BindingOfIsaac.CardClasses.Card;
import BindingOfIsaac.CardClasses.CharacterCard;
import BindingOfIsaac.CardClasses.LootCard;
import BindingOfIsaac.CardClasses.Treasure.TreasureCard;
import BindingOfIsaac.Effects.Effect;

import java.util.LinkedList;

public class Player {
    private final Field field;
    private boolean canPlay;
    private boolean tapped;

    private LinkedList<LootCard> hand;
    private LinkedList<TreasureCard> inventory;
    private LinkedList<Card> souls;
    private LinkedList<Effect> buffList;

    private int money;
    private int numSouls;
    private int health;
    private int maxHealth;
    private int attack;
    private int baseAttack;
    private int attackNumber;
    private int baseAttackNumber;
    private boolean hasPurchased;

    private int treasureCost=10;

    private final CharacterCard card;
    private PlayerPointer pointer;



    public Player(CharacterCard card, Field field){
        this.card=card;

        this.canPlay=false;
        this.tapped=true;
        this.money=3;
        this.numSouls=0;
        this.maxHealth= card.getHealth();
        this.health=maxHealth;
        this.baseAttack=card.getAttack();
        this.attack=baseAttack;
        this.attackNumber=1;
        this.baseAttackNumber=1;
        this.hasPurchased=false;

        this.hand=new LinkedList<LootCard>();
        this.inventory=new LinkedList<TreasureCard>();
        this.souls=new LinkedList<Card>();


        this.field= field;
    }






    public boolean canPurchase(){
        if(this.money>=10&&!hasPurchased) return true;
        else return false;
    }
    public void purchase(TreasureCard card){
        money-=treasureCost;
        field.changeBank(treasureCost);
        inventory.add(card);
        field.replaceTreasure(card);
    }
    public void purchaseTop(){
        money-=treasureCost;
        field.changeBank(treasureCost);
        inventory.add((TreasureCard) field.getTreasureDeck().draw());
        if(field.getTreasureDeck().isEmpty()) field.restockTreasureDeck();
    }


    public void attack(){

    }
    public void attackTop(){

    }



































    public Field getField() {return field;}
    public boolean canPlay(){return canPlay;}
    public boolean isTapped() {return tapped;}
    public boolean hasPurchased(){return hasPurchased();}

    public int getBaseAttackNumber() {return baseAttackNumber;}
    public int getBaseAttack() {return baseAttack;}
    public int getAttackNumber() {return attackNumber;}
    public int getMaxHealth() {return maxHealth;}
    public int getNumSouls() {return numSouls;}
    public int getMoney(){return money;}
    public int getHealth() {return health;}
    public int getAttack() {return attack;}

    public LinkedList<LootCard> getHand(){return hand;}
    public LinkedList<TreasureCard> getInventory() {
        return inventory;
    }
    public LinkedList<Card> getSouls() {
        return souls;
    }

    public void setCanPlay(boolean canPlay){this.canPlay=canPlay;}
    public void tap(){this.tapped=true;}
    public void activate(){this.tapped=false;}

    public void addCard(LootCard card){this.hand.add(card);}
    public void discardHand(LootCard card){this.hand.remove(card);}
    public void addTreasure(TreasureCard card){this.inventory.add(card);}
    public void destroyTreasure(TreasureCard card){this.inventory.remove(card);}
    public void addSouls(Card card){this.souls.add(card);}
    public void discardSouls(Card card){this.souls.remove(card);}
    public void Heal(int i){this.health=this.health+i>this.maxHealth?this.maxHealth:this.health+i; }
    public void HealPastBase(int i){ this.health+=i; }
    public void takeDamage(int i){ this.health=this.health-i>=0?this.health-i:0;}
    public void setHealth(int i){this.health=i;}

    public void RaiseAttack(int i){this.attack=+i;}
    public void LowerAttack(int i){this.attack=this.attack-i<0?0:this.attack-i;}
    public void setAttack(int i){this.attack=i;}

    public void addMoney(int i){this.money+=i;}
    public void setMoney(int i){this.money=i;}

    public void setPointer( PlayerPointer pointer){this.pointer=pointer;}
    public PlayerPointer getPointer(){return this.pointer;}


}
