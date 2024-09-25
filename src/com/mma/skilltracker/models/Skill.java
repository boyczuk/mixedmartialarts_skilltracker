package com.mma.skilltracker.models;

public class Skill {
	String name;
	int level;
	int experiencePoints;
	
	public Skill(String name, int level, int experiencePoints) {
		this.name = name;
		this.level = level;
		this.experiencePoints = experiencePoints;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getExperiencePoints() {
		return experiencePoints;
	}
	
	public void setName(String setName) {
		this.name = setName;
	}
	
	public void setLevel(int setLevel) {
		this.level = setLevel;
	}
	
	public void setExperiencePoints(int setExperiencePoints) {
		this.experiencePoints = setExperiencePoints;
	}
	
	
}
