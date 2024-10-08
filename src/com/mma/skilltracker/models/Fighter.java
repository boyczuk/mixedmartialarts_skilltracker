package com.mma.skilltracker.models;
import java.util.ArrayList;
import com.mma.skilltracker.models.Lift;
import com.mma.skilltracker.models.Skill;

public class Fighter {
    String name;
    int age;
    double weightLbs;
    String heightIn;
    ArrayList<Skill> skills;
    ArrayList<Lift> lifts;

    public Fighter(String name, int age, double weightLbs, String heightIn) { 
    	this.name = name;
    	this.age = age;
    	this.weightLbs = weightLbs;
    	this.heightIn = heightIn;
    	this.skills = new ArrayList<>();
    	this.lifts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int newAge) {
    	this.age = newAge;
    }
    
    public double getWeightLbs() {
    	return weightLbs;
    }
    
    public void setWeightLbs(double newWeightLbs) {
    	this.weightLbs = newWeightLbs;
    }
    
    public String getHeightIn() {
    	return heightIn;
    }
    
    public void setHeightIn(String newHeightIn) {
    	this.heightIn = newHeightIn;
    }
    
    public void addSkill(Skill newSkill) {
    	this.skills.add(newSkill);
    }
    
    public ArrayList<Skill> getSkills() {
    	return skills;
    }
    
    public void addLift(Lift newLift) {
    	this.lifts.add(newLift);
    }
    
    public ArrayList<Lift> getLifts(){
    	return lifts;
    }

}


