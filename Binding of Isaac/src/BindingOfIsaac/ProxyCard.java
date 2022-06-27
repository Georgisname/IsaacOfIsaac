package BindingOfIsaac;

import BindingOfIsaac.CardClasses.Card;
import BindingOfIsaac.Cards.Bonus.SoulOfGluttony;

public class ProxyCard {
    private String name;


    public ProxyCard(String name){
        this.name=name;
    }

    public Card callCard(){
        switch(name){
            case "SoulOfGluttony":{ return new SoulOfGluttony();}
        }

        return new SoulOfGluttony();
    }


}
