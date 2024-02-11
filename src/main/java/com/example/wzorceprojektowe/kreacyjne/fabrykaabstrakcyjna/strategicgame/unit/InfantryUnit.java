package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.strategicgame.unit;

public abstract class InfantryUnit {
    private final int hp;
    private final int exp;
    private final int dmgDone;

    protected InfantryUnit(int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmgDone() {
        return dmgDone;
    }
}
