package BindingOfIsaac.CardClasses;

import BindingOfIsaac.Effects.Effect;

public abstract class Card {
    private boolean eternal;
    private String name;




    public boolean isEternal() { return eternal;}
    public boolean isInDeck(){ return isInDeck();}
    public String getName(){return name;}

    public Card(){
    }

    public String deckType(){
        return "None";
    }
}
