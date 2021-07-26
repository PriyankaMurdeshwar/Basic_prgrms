class ArithmeticOperatorsDemo{

 int add(int a, int b){
 	int resAdd=a+b;
	return resAdd;
}

 int sub(int c, int d){
 	int resSub=c-d;
	return resSub;
}
 int mul(int e, int f){
 	int resMul=e*f;
	return resMul;
}
 int div(int g, int h){
 	int resDiv=g/h;
	return resDiv;
}
 int modulus(int x, int y){
 	int resMod=x%y;
	return resMod;
}

public static void main(String args[]){

ArithmeticOperatorsDemo obj = new ArithmeticOperatorsDemo();

System.out.println(" Result of addition is : " + obj.add(5,10));

System.out.println(" Result of subtraction is :" + obj.sub(20,10));

System.out.println(" Result of multiplication is :" + obj.mul(5,10));

System.out.println(" Result of division is :" + obj.div(50,10));

System.out.println(" Result of modulus is :" + obj.modulus(50,10));
}
}





