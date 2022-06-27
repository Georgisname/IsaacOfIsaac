package BindingOfIsaac.CardClasses.Monsters;

public abstract class Bosses extends Monster {
    public Bosses(int baseHealth, int baseAttack, int baseDiceThreshold, int health, int attack, int diceThreshold) {
        super(baseHealth, baseAttack, baseDiceThreshold, health, attack, diceThreshold);
    }
}
