package inheritance;

public class Animal_Hierarchical {
	int numberOfLeg = 4;
	
	void type()
	{
		System.out.println("Different types of animal");
	}

}

class Doggy extends Animal_Hierarchical
{
	void speak()
	{
		System.out.println("Bark");
	}
	
	void type()
	{
		System.out.println("Different types of Doggy");
	}
}

class BabyDoggy extends Animal_Hierarchical
{
	
	public static void main(String args[])
	{
		BabyDoggy bd = new BabyDoggy();
		System.out.println(bd.numberOfLeg);
		bd.type();
		Doggy d = new Doggy();
		d.speak();
		Animal_Hierarchical ah = new Doggy();
		ah.type();
	}
}