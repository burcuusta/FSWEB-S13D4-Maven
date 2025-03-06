package org.example;

public enum Weapon {
    SWORD(15, 1.5),
    AXE(20, 0.9),
    SHIELD(5, 0.5),
    BOW(10, 1.0);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage() {
        return damage;
    }
    public double getAttackSpeed() {
        return attackSpeed;
    }
}
