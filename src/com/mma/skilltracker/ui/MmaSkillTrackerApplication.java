package com.mma.skilltracker.ui;

import com.mma.skilltracker.models.Fighter;

public class MmaSkillTrackerApplication {
    public static void main(String[] args) {
        // Create an instance of Fighter
        Fighter fighter = new Fighter("Conor Mcgregor", 35, 170.5, "5'8");

        // Test the Fighter object
        System.out.println("Fighter's Name: " + fighter.getName());
        System.out.println("Fighter's Age: " + fighter.getAge());
        System.out.println("Fighter's Weight: " + fighter.getWeightLbs());

        fighter.addSkill("Muay Thai");
        System.out.println("Skills: " + fighter.getSkills());
    }
}