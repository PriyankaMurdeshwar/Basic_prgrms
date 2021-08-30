package com.xworkz.java.object_class.equals_Demo;

import java.util.Objects;

public class Trainer {
	String name;
	String gender;
	int yearOfExperience;
	
	Trainer(String name, String gender, int yearOfExperience){
		this.name = name;
		this.gender = gender;
		this.yearOfExperience = yearOfExperience;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gender, name, yearOfExperience);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainer other = (Trainer) obj;
		return Objects.equals(gender, other.gender) && Objects.equals(name, other.name)
				&& yearOfExperience == other.yearOfExperience;
	}

}
