package instance_of;

public class ClothCheck {
	
	void check(Cloth cloth) {
		if(cloth instanceof Cotton) {
			System.out.println(" it is a cotton piece");
		}
		else {
			System.out.println("it is a silk piece");
		}
	}

}
