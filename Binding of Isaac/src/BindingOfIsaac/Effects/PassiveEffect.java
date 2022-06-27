package BindingOfIsaac.Effects;

import BindingOfIsaac.CardClasses.Card;

public class PassiveEffect extends Effect {
    public PassiveEffect(Card source) {
        super(source);
    }
    public String effectType(){ return "passive";}
}
