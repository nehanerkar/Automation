package inheritance;
//Single Inheritance
public class Employee_Single
{
	String project = "USCC";
		
	void location() {
		System.out.println("Mumbai");
	}
}
		
class Tester extends Employee_Single
{
	String role = "Automation Tester";
		
	void salaryPackage() {
		System.out.println("12,00,000");
	}
	
	void location() {
		super.location();
		System.out.println("Pune");
	}
	

	public static void main(String[] args) 
	{
		Tester t = new Tester();
		System.out.println(t.project);
		System.out.println(t.role);
		t.location();
		t.salaryPackage();

	}	

}

