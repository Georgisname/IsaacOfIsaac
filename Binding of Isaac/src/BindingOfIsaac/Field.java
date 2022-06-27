package BindingOfIsaac;
import BindingOfIsaac.CardClasses.Card;
import BindingOfIsaac.CardClasses.FieldCard;
import BindingOfIsaac.CardClasses.Treasure.TreasureCard;
import BindingOfIsaac.Effects.Effect;

import java.util.LinkedList;

public class Field {
    private BindingOfIsaac.MonsterField MonsterField;
    private Card[] TreasureField;

    private Deck MonsterDeck;
    private Deck TreasureDeck;
    private Deck LootDeck;
    private Deck RoomDeck;
    private Deck SoulDeck;

    private Deck MonsterDiscardPile;
    private Deck TreasureDiscardPile;
    private Deck LootDiscardPile;
    private Deck RoomDiscardPile;
    private Deck SoulDiscardPile;


    private int bank;

    private LinkedList<Effect> stack;
    private LinkedList<Effect> globalBuffs;
    private LinkedList<Condition> waitList;

    private PlayerPool playerPool;

    private boolean combatOngoing=false;

    private final FieldCard fieldCard= new FieldCard(this);





    public Field(int playerNumb){
        this.MonsterField= new MonsterField();
        this.TreasureField= new Card[2];

        this.MonsterDeck= new Deck();
        this.TreasureDeck= new Deck();
        this.LootDeck= new Deck();
        this.RoomDeck=new Deck();
        this.SoulDeck=new Deck();

        this.MonsterDiscardPile=new Deck();
        this.TreasureDiscardPile=new Deck();
        this.LootDiscardPile=new Deck();
        this.RoomDiscardPile= new Deck();
        this.SoulDiscardPile= new Deck();


        this.stack=new LinkedList<Effect>();
        this.bank=100-3*playerNumb;
    }


    public void addToStack(Effect effect){
        this.stack.addLast(effect);
    }

    public void removeFromStack(){
        this.stack.removeLast();
    }


























    public void replaceTreasure(TreasureCard card){
        for(int i=0; i<TreasureField.length;i++){
            if(card.equals(TreasureField[i])){
                TreasureField[i]=null;
                TreasureField[i]= TreasureDeck.draw();
                if(TreasureDeck.isEmpty()) restockTreasureDeck();
                break;
            }
        }
    }
    public void replenishTreasureDeck(){

        for( int i=0; i<TreasureField.length;i++){
            if(TreasureField[i]==null){
                TreasureField[i]=TreasureDeck.draw();
                if(TreasureDeck.isEmpty()) restockTreasureDeck();
            }
        }
    }
    public void removeTreasure(Card card){
        for(int i=0; i<TreasureField.length;i++){
            if(card.equals(TreasureField[i])){
                TreasureField[i]=null;
                break;
            }
        }
    }

    public void setCombat(){combatOngoing=true;}
    public void endCombat(){combatOngoing=false;}


    public MonsterField getMonsterField(){return MonsterField;}
    public Card[] getTreasureField(){return TreasureField;}

    public Deck getMonsterDeck() {return MonsterDeck;}
    public Deck getTreasureDeck() {return TreasureDeck;}
    public Deck getLootDeck(){return LootDeck;}
    public Deck getRoomDeck(){return RoomDeck;}
    public Deck SoulDeck(){return this.SoulDeck;}

    public Deck getMonsterDiscardPile(){return MonsterDiscardPile;}
    public Deck getTreasureDiscardPile(){return TreasureDiscardPile;}
    public Deck getLootDiscardPile(){return LootDiscardPile;}
    public Deck getRoomDiscardPile(){return RoomDiscardPile;}
    public Deck getSoulDiscardPile(){return SoulDiscardPile;}

    public int getBank(){return bank;}
    public void changeBank(int i){
        this.bank+=i;
    }
    public void setBank(int i){this.bank=i;}

    public void restockMonsterDeck(){
        MonsterDiscardPile.shuffleDeck();
        MonsterDeck=MonsterDiscardPile;
        MonsterDiscardPile=new Deck();
    }
    public void restockTreasureDeck(){
        TreasureDiscardPile.shuffleDeck();
        TreasureDeck=TreasureDiscardPile;
        TreasureDiscardPile=new Deck();
    }
    public void restockLootDeck(){
        LootDiscardPile.shuffleDeck();
        LootDeck=LootDiscardPile;
        LootDiscardPile=new Deck();
    }

    public LinkedList<Effect> getStack(){return stack;}
    public LinkedList<Effect> getGlobalBuffs(){return globalBuffs;}
    public LinkedList<Condition> getWaitList(){return waitList;}

    public PlayerPool getPlayerPool(){return playerPool;}

    public boolean isCombatOngoing(){return combatOngoing;}

    public FieldCard getFieldCard() {return fieldCard;}
}
