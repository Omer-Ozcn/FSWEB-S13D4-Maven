package org.example;

public enum Weapon {
    SWORD(25, 1.2),
    BOW(18, 1.5),
    DAGGER(12, 2.0),
    AXE(30, 0.9);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() { return damage; }
    public double getAttackSpeed() { return attackSpeed; }

}
