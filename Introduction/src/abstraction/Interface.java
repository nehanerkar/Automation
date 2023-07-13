package abstraction;

interface Interface {
	void print();
	
}
class subInterface implements Interface
{
	public void print() {
		System.out.println("Interface Method");
	}

	public static void main(String[] args) {
		subInterface si = new subInterface();
		si.print();

	}

}
