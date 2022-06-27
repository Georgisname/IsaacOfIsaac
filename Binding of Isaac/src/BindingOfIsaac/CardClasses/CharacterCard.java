package BindingOfIsaac.CardClasses;

public abstract class CharacterCard extends Card {
    private int health;
    private int attack;

    public CharacterCard(String name) {

    }

    public int getHealth(){return health;}
    public int getAttack(){return attack;}

    public void tap(){

    }

    @Override
    public String deckType() {
        return "Character";
    }
}
