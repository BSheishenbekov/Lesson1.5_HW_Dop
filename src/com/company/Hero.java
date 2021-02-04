package com.company;

public class Hero {
    private int heroesHealth;
    private int  heroesDamage;
    private  String superpower;


    public Hero(int heroesHealth, int heroesDamage, String superpower) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.superpower = superpower;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public void setHeroesDamage(int heroesDamage) {
        this.heroesDamage = heroesDamage;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
}
