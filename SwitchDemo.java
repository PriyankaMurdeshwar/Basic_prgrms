class SwitchDemo{
 public static void main(String args[]){
	String trafficSignal = "red";

	switch(trafficSignal) {
	case "red" : System.out.println(" stop");
		break;
	case "yello" : System.out.println(" ready to go");
		break;
	case "green" : System.out.println("  move");
		break;
	default : System.out.println(" invalid statement ");
	}
}
}
