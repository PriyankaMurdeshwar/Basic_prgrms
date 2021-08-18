package instance_of;

public class FindCottonSilk {
	public static void main(String args[]) {
		Cotton cotton = new Cotton();
		Silk silk = new Silk();
		
		ClothCheck clothcheck = new ClothCheck();
		clothcheck.check(silk);
		clothcheck.check(cotton);
	}

}
