package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = clamp(healthPercentage);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage < 0) {
            this.healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        this.healthPercentage = clamp(this.healthPercentage + healthPotion);
    }

    private int clamp(int hp) {
        if (hp > 100) return 100;
        if (hp < 0) return 0;
        return hp;
    }
}
