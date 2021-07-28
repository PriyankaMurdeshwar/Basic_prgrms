class ArithmaticOperatorsDemo{

static int add(int a, int b){
 	int resAdd=a+b;
	return resAdd;
}

static int sub(int c, int d){
 	int resSub=c-d;
	return resSub;
}
static int mul(int e, int f){
 	int resMul=e*f;
	return resMul;
}
static int div(int g, int h){
 	int resDiv=g/h;
	return resDiv;
}
static int modulus(int x, int y){
 	int resMod=x%y;
	return resMod;
}

public static void main(String args[]){

System.out.println(" Result of addition is : " +add(5,10));

System.out.println(" Result of subtraction is :" +sub(20,10));

System.out.println(" Result of multiplication is :" +mul(5,10));

System.out.println(" Result of division is :" +div(50,10));

System.out.println(" Result of modulus is :" +modulus(50,10));
}
}





