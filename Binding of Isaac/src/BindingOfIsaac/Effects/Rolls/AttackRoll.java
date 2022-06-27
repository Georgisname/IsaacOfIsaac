package BindingOfIsaac.Effects.Rolls;

import BindingOfIsaac.CardClasses.Card;

public class AttackRoll extends Roll {
    public AttackRoll(Card source) {
        super(source);
    }
    public String effectType(){
        return "attackRoll";
    }
}
