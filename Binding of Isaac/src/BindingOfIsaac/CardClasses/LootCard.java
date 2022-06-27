package BindingOfIsaac.CardClasses;

import BindingOfIsaac.Effects.Effect;

public abstract class LootCard extends Card {
    private Effect effect;

    public LootCard(String name) {
        super();
    }

    @Override
    public String deckType() {
        return "Loot";
    }

}
