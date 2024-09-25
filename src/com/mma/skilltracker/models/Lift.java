package com.mma.skilltracker.models;

public class Lift {
	String name;
	double weight;
	int sets;
	int reps;
	
	public Lift(String name, double weight, int sets, int reps) {
		this.name = name;
		this.weight = weight;
		this.sets = sets;
		this.reps = reps;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getSets() {
		return sets;
	}
	
	public int getReps() {
		return reps;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setSets(int sets) {
		this.sets = sets;
	}
	
	public void setReps(int reps) {
		this.reps = reps;
	}
	
	
}
