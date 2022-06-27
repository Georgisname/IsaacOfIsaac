package BindingOfIsaac.CardClasses.Monsters;

import BindingOfIsaac.CardClasses.Monsters.Monster;

public abstract class EpicBosses extends Monster {
    public EpicBosses(int baseHealth, int baseAttack, int baseDiceThreshold, int health, int attack, int diceThreshold) {
        super(baseHealth, baseAttack, baseDiceThreshold, health, attack, diceThreshold);
    }
}
