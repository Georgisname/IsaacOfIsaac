package BindingOfIsaac.Effects;

import BindingOfIsaac.CardClasses.Card;

public abstract class Effect {
    private boolean isActive;
    private final Card source;
    private boolean locked=false;//in case certain conditions are required, such as effect that require you to destroy the card itself, before using said card
    private final Effect lock=null;   //the effect this locks
    private final Effect key=null;     //the effect that this is locked by

    public void activate(){this.isActive=true;}
    public void deactivate(){this.isActive=false;}
    public boolean isActive(){return isActive;}
    public Card getSource(){return this.source;}
    public boolean isLocked(){return this.locked;}
    public void lock(){this.locked=true;}
    public void unlock(){this.locked=false;}

    public Effect(Card source){
        this.source=source;
    }

    public String effectType(){
        return "none";
    }





}
