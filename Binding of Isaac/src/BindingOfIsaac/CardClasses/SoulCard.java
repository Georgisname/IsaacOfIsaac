package BindingOfIsaac.CardClasses;

public abstract class SoulCard extends Card {
    public SoulCard(String name) {
        super();
    }

    public boolean conditionMet(){
        return false;
    }

    @Override
    public String deckType() {
        return "Soul";
    }
}
