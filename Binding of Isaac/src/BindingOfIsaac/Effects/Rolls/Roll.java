package BindingOfIsaac.Effects.Rolls;

import BindingOfIsaac.CardClasses.Card;
import BindingOfIsaac.Effects.Effect;

import java.util.Random;

public class Roll extends Effect {
    public int result;

    public String effectType;

    public Roll(Card source) {
        super(source);
    }

    public void roll(){
        Random random=new Random();
        result= random.nextInt(6)+1;
    }

    public void boost(int i){
        result+=i;
        if(result>6) result=6;
        if(result<1) result=1;
    }
    
}
