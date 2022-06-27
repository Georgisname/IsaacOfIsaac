package BindingOfIsaac.Effects;

import BindingOfIsaac.CardClasses.Card;
import BindingOfIsaac.Condition;
import BindingOfIsaac.Field;
import BindingOfIsaac.Player;

public class GainCent extends Effect{
    private final int value;
    private Player target;
    private Field field;

    public GainCent(int i, Player target, Card source){
        super(source);
        this.value=i;
        this.target=target;
        this.field=target.getField();
    }

    public void resolve(){
        int payOut=value;
        if(this.field.getBank()>value){
            this.field.changeBank(value);
            this.target.addMoney(value);
        }
        else{
            payOut=field.getBank();
            this.target.addMoney(payOut);
            this.field.setBank(0);
        }
    }
}
