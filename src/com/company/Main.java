package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossHealth (700);
        boss.setBossDamage(50);
        boss.setBossDefenceType("Magical");
        System.out.println(boss.getBossHealth() + " " + boss.getBossDamage() + " " + boss.getBossDefenceType());
    }
}
