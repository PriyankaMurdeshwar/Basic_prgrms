class Scizzlers{

		String name;
		String place;
		int age;
 		
		void disCharacter(){
		System.out.println(name + " from " + place + " and " + age + " years old ");
		}
	public static void main(String args[]){
	Scizzlers student = new Scizzlers();
	student.name = "Priyanka";
	student.place = "Sirsi";
	student.age = 24;
	student.disCharacter();

	Scizzlers student1 = new Scizzlers();
	student1.name = "Muskan";
	student1.place = "Hubli";
	student1.age = 23;
	student1.disCharacter();
	
	Scizzlers student2 = new Scizzlers();
	student2.name = "Abhishek";
	student2.place = "Bangalore";
	student2.age = 24;
	student2.disCharacter();

	Scizzlers student3 = new Scizzlers();
	student3.name = "Ruhi";
	student3.place = "Bangalore";
	student3.age = 22;
	student3.disCharacter();

	Scizzlers student4 = new Scizzlers();
	student4.name = "Sushma";
	student4.place = "Gadag";
	student4.age = 23;
	student4.disCharacter();


}
}
