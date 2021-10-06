package com.xworkz.java.collection.set_interface;

import java.util.Objects;

public class Perfume {
	
	String brand;
	String flavor;
	double price;
	String type;
	
	Perfume(String brand, String flavor, double price, String type){
		this.brand = brand;
		this.flavor = flavor;
		this.price = price;
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, flavor, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfume other = (Perfume) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(flavor, other.flavor)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Perfume [brand=" + brand + ", flavor=" + flavor + ", price=" + price + ", type=" + type + "]";
	}

}
