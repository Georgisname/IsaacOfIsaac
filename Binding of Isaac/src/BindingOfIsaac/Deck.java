package BindingOfIsaac;

import BindingOfIsaac.CardClasses.Card;

import java.util.*;

public class Deck {
    private LinkedList<ProxyCard> deck;

    public Deck(){
        this.deck=new LinkedList<>();
    }

    public void shuffleDeck(){
        LinkedList<ProxyCard> newDeck=new LinkedList<ProxyCard>();
        Random random= new Random();
        int size = this.deck.size();
        for(int i = size; i>0; i--){
            int index=random.nextInt(i);
            newDeck.add(deck.get(index));
            deck.remove(index);
        }
        this.deck=newDeck;
    }

    public Card draw(){
        Card card=this.deck.getFirst().callCard();
        this.deck.removeFirst();
        return card;
    }
    public void putBack(Card card){
        this.deck.addFirst(new ProxyCard(card.getName()));
    }

    public boolean contains(Card card){
        if(this.deck.contains(card)) return true;
        else return false;
    }
    public boolean isEmpty(){
        return this.deck.isEmpty();
    }




    public void supplyMonsterDeck(){

    }
    public void supplyTreasureDeck() {

    }
    public void supplyLootDeck(){

    }
    public void supplyCharacterDeck(){

    }
    public void supplySoulDeck(){

    }
    public void supplyRoomDeck(){

    }


    public void supplyRatioMonsterDeck(){

    }
    public void supplyRatioTreasureDeck(){

    }
    public void supplyRatioLootDeck(){

    }




}
