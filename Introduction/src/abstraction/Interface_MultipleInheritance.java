package abstraction;

interface Interface_MultipleInheritance {
	void print();
}

interface showable
{
	void print();
	void show();
}

class A1 implements Interface_MultipleInheritance,showable
{
	public void print() {
		System.out.println("Calling first Interface");
	}
	
	public void show() {
		System.out.println("Calling second Interface");
	}
	
	public static void main(String[] args) {
		
		A1 a1 = new A1();
		a1.print();
		a1.show();
	}

}
