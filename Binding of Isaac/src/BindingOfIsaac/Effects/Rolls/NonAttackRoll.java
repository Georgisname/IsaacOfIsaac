package BindingOfIsaac.Effects.Rolls;

import BindingOfIsaac.CardClasses.Card;

public class NonAttackRoll extends Roll {
    public NonAttackRoll(Card source) {
        super(source);
    }

    public String effectType(){
        return "nonAttackRoll";
    }
}
