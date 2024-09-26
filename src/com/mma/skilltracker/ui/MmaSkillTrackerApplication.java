package com.mma.skilltracker.ui;

import java.util.Scanner;

import com.mma.skilltracker.models.Fighter;
import com.mma.skilltracker.models.Lift;
import com.mma.skilltracker.models.Skill;

public class MmaSkillTrackerApplication {
    public static void main(String[] args) {
        Fighter fighter = null;
        int selection;

        boolean running = true;
        Scanner input = new Scanner(System.in);
        
        while (running) {
            /*******************************************/
            System.out.println("1. Create a new fighter");
            System.out.println("2. Add a skill to the fighter");
            System.out.println("3. Add a lift to the fighter");
            System.out.println("4. Display fighter details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            selection = Integer.parseInt(input.nextLine());

            switch (selection) {
                case 1:
                    System.out.println("Enter fighter's name: ");
                    String name = input.nextLine();
                    
                    System.out.println("Enter fighter's age: ");
                    int age = Integer.parseInt(input.nextLine()); 
                    
                    System.out.println("Enter fighter's weight: ");
                    double weight = Double.parseDouble(input.nextLine()); 
                    
                    System.out.println("Enter fighter's height: ");
                    String height = input.nextLine();
                    
                    fighter = new Fighter(name, age, weight, height);
                    System.out.println("Fighter Created!");
                    break;
                    
                case 2:
                    if (fighter == null) {
                        System.out.println("Fighter not created");
                    } else {
                        System.out.println("Enter the skill name: ");
                        String skillName = input.nextLine();
                        
                        System.out.println("Enter the skill level: ");
                        int skillLevel = Integer.parseInt(input.nextLine());
                        
                        System.out.println("Enter the experience points: ");
                        int experiencePoints = Integer.parseInt(input.nextLine());
                        
                        Skill skill = new Skill(skillName, skillLevel, experiencePoints);
                        fighter.addSkill(skill);
                        System.out.println("New skill added to fighter!");
                    }
                    break;
                    
                case 3:
                    if (fighter == null) {
                        System.out.println("Fighter not created");
                    } else {
                        System.out.println("Enter lift name: ");
                        String liftName = input.nextLine();
                        
                        System.out.println("Enter weight: ");
                        double liftWeight = Double.parseDouble(input.nextLine());
                        
                        System.out.println("Enter number of sets: ");
                        int sets = Integer.parseInt(input.nextLine());
                        
                        System.out.println("Enter number of reps: ");
                        int reps = Integer.parseInt(input.nextLine());
                        
                        Lift lift = new Lift(liftName, liftWeight, sets, reps);
                        fighter.addLift(lift);
                        System.out.println("New lift added to fighter!");
                    }
                    break;
                    
                case 4:
                    if (fighter == null) {
                        System.out.println("Fighter not created");
                    } else {
                        System.out.println("\nFighter details:");
                        System.out.println("Name: " + fighter.getName());
                        System.out.println("Age: " + fighter.getAge());
                        System.out.println("Weight: " + fighter.getWeightLbs());
                        System.out.println("Height: " + fighter.getHeightIn());

                        System.out.println("\nSkills");
                        for (Skill s : fighter.getSkills()) {
                            System.out.println("- " + s.getName() + " (Level: " + s.getLevel() + ", experience: " + s.getExperiencePoints() + ")");
                        }

                        System.out.println("\nLifts");
                        for (Lift l : fighter.getLifts()) {
                            System.out.println("- " + l.getName() + ": " + l.getWeight() + " lbs for " + l.getSets() + " sets of " + l.getReps());
                        }
                    }
                    break;
                    
                case 5:
                    running = false;
                    System.out.println("Exiting!");
                    break;
                    
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
        input.close();
    }
}
