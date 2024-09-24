package com.mma.skilltracker.models;
import java.util.ArrayList;


public class Fighter {
    String name;
    int age;
    double weightLbs;
    String heightIn;
    ArrayList<String> skills;

    public Fighter(String name, int age, double weightLbs, String heightIn) { 
    	this.name = name;
    	this.age = age;
    	this.weightLbs = weightLbs;
    	this.skills = new ArrayList<>();
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
    
    public void addSkill(String newSkill) {
    	this.skills.add(newSkill);
    }
    
    public ArrayList<String> getSkills() {
    	return skills;
    }
    

}


