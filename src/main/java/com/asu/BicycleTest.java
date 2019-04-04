package com.asu;

public class BicycleTest {

	public static void main(String[] args) {
		
		Bicycle b = new Bicycle(10, 20, 30);
		b.printDescription();
		
		MountainBike m = new MountainBike(21, 23, 45, 25);
		m.printDescription();
		
		Bicycle g1= new MountainBike(12, 32, 54, 52);
		g1.printDescription();
		System.out.println(g1.gear);

	}

}
