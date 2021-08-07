package com.xworkz.java.inheritance.multilevel_inheritance;

public class MultilevelInheritanceB {
	public static void main(String args[]) {
		ShopKeeper shopkeeper = new ShopKeeper();
		
		shopkeeper.produceProduct();
		shopkeeper.implement();
		shopkeeper.buysProduct();
		shopkeeper.sellsProduct();
		shopkeeper.takingCustomerPayments();
		shopkeeper.givingChange();
		shopkeeper.helpingCustomer();
	}

}
