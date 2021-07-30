class NestedIfDemo {
public static void main(String args[]) {
	boolean haveBankAccount = true;
	boolean salried = false;

	if(haveBankAccount) {
	System.out.println( " issue debit card ");
 	
		if(salried){
		System.out.println("issue credit card");
		}
		else{
		System.out.println("cannot issue credit card");
		}
	}
	else{
	System.out.println(" card will not be issued");
}
}
}

		