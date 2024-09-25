package com.mma.skilltracker.ui;

import com.mma.skilltracker.models.Fighter;
import com.mma.skilltracker.models.Lift;
import com.mma.skilltracker.models.Skill;

public class MmaSkillTrackerApplication {
    public static void main(String[] args) {
        // Create an instance of Fighter
        Fighter fighter = new Fighter("Conor Mcgregor", 35, 170.5, "5'8");
        Skill muayThai = new Skill("Muay Thai", 7, 150);
        Skill boxing = new Skill("Boxing", 9, 300);
        Skill bjj = new Skill("Brazilian Jiu-Jitsu", 6, 120);
        fighter.addSkill(muayThai);
        fighter.addSkill(bjj);
        fighter.addSkill(boxing);
        Lift benchPress = new Lift("Bench Press", 225, 4, 10);
        fighter.addLift(benchPress);
        
        
        // Test the Fighter object
        System.out.println("Fighter's Name: " + fighter.getName());
        System.out.println("Fighter's Age: " + fighter.getAge());
        System.out.println("Fighter's Weight: " + fighter.getWeightLbs());

        for (Skill skill : fighter.getSkills()) {
        	System.out.println(skill.getName() + " (level: " + skill.getLevel() + ")");
        }
        for (Lift lift : fighter.getLifts()) {
        	System.out.println(lift.getName() + " Weight: " + lift.getWeight() + " (sets: " + lift.getSets() + ", reps: " + lift.getReps() + ")");
        }
    }
}