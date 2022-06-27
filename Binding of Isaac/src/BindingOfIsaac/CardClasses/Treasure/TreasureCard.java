package BindingOfIsaac.CardClasses.Treasure;

import BindingOfIsaac.CardClasses.Card;

public abstract class TreasureCard extends Card {

    public void activateEffect(){

    }
    @Override
    public String deckType() {
        return "Treasure";
    }
}
