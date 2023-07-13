package inheritance;
//Multilevel Inheritance
public class Animal_Multilevel {
	int numberOfLeg = 4;
	
	void type()
	{
		System.out.println("Different types of animal");
	}
}

class Dog extends Animal_Multilevel
{
	void speak()
	{
		System.out.println("Bark");
	}

}

class BabyDog extends Dog
{
	void size()
	{
		System.out.println(super.numberOfLeg);
		super.type();
		super.speak();
	}
	
	public static void main(String args[]) {
		BabyDog bd = new BabyDog();
		bd.size();
	}
}