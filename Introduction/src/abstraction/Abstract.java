package abstraction;

abstract class Abstract {
	int num = 30;
	
	Abstract() 
	{
		System.out.println("It's an Abstract Constructor");
	}
	abstract void noBody();
	
	void body()
	{
		System.out.println("Inside non-Abstract Method");
	}
}

class subAbstract extends Abstract
{
	void noBody()
	{
		System.out.println("Inside subAbstract Class");
	}
}

class subAbstract2 extends Abstract
{
	void noBody()
	{
		//super.noBody(): Cannot directly invoke the abstract method noBody() for the type Abstract
		System.out.println("Inside subAbstract2 Class");
		System.out.println(super.num);
	}

	public static void main(String[] args) {
		Abstract a;
		subAbstract sa = new subAbstract();
		sa.noBody();
		subAbstract2 sa2 = new subAbstract2();
		sa2.noBody();
		
		a = new subAbstract2();
		a.noBody();
		
		a = new subAbstract();
		a.noBody();
		
	}

}
