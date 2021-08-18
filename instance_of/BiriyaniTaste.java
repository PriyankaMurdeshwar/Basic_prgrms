package instance_of;

public class BiriyaniTaste {
	public static void main(String args[]) {
		ChickenBiriyani chickenbiriyani = new ChickenBiriyani();
		VegBiriyani veg = new VegBiriyani();
		
		Priyanka priya = new Priyanka();
		priya.mouth(chickenbiriyani);
		priya.mouth(veg);;
		
	}

}
