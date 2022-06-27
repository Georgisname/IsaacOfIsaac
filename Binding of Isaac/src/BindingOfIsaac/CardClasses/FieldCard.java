package BindingOfIsaac.CardClasses;

import BindingOfIsaac.CardClasses.Card;
import BindingOfIsaac.Effects.Effect;
import BindingOfIsaac.Effects.GainCent;
import BindingOfIsaac.Effects.Rolls.AttackRoll;
import BindingOfIsaac.Effects.Rolls.NonAttackRoll;
import BindingOfIsaac.Field;
import BindingOfIsaac.Player;

public class FieldCard extends Card {
    private String name="FieldCard";
    private boolean eternal=true;
    private final Field field;


    public FieldCard(Field field){
        super();
        this.field=field;
    }

    public String CardType(){
        return "field";
    }

    public Effect callAttackRoll(){
        return new AttackRoll(this);
    }

    public Effect callNonAttackRoll(){
        return new NonAttackRoll(this);
    }

    public Effect callGainCent(int i, Player player,Card source){
        return new GainCent(i,player,source);
    }

















    public Field getField() {
        return field;
    }
}
