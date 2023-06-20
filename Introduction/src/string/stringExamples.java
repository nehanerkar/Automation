package string;

import java.util.Arrays;

public class stringExamples {

	public static void main(String[] args) {
		
		//Convert characters into string		
		char[] ch = {'N','e','h','a'};
		String s = new String(ch); // Creating a string by new keyword
		String t = new String("Nerkar"); // Creating a string by String literal
		System.out.println("Char to String: "+s);
		System.out.println("----------------------------------------------------");
		
		//String Comparison
		String s1="Sachin";  
		String s2="Sachin";  
		String s3=new String("Sachin");  
		String s4="Ratan";  
		String s5="SAURAV";  
		System.out.println("s1.equals(s2) = "+ s1.equals(s2));//true  
		System.out.println("s1.equals(s3) = "+ s1.equals(s3));//true  
		System.out.println("s1.equals(s4) = "+ s1.equals(s4));//false  
		System.out.println("s4.equalsIgnoreCase(s5) = "+ s4.equalsIgnoreCase(s5));//true 
		System.out.println("----------------------------------------------------");
		System.out.println("s1 == s2 = "+ s1 == s2);//true  
		System.out.println("s1 == s3 = "+ s1 == s3);//false
		System.out.println("----------------------------------------------------"); 
		System.out.println("s1.compareTo(s2) = "+ s1.compareTo(s2));//0  
		System.out.println("s1.compareTo(s4) = "+ s1.compareTo(s4));//1(because s1>s3)  
		System.out.println("s4.compareTo(s1) = "+ s4.compareTo(s1));//-1(because s3 < s1 ) 
		System.out.println("s5.compareTo(s4) = "+ "hello".compareTo("meklo"));//-5 because "h" is 5 times lower than "m" 
		System.out.println("----------------------------------------------------"); 
		
		//String Concatenation
		String s6 = "Sachin";
		String s7 = " Tendulkar";  
		System.out.println("String Concatination by + operator = "+ s6+s7);//Sachin Tendulkar - By + (String concatenation) operator
		  
		String s8=s6.concat(s7);  //By concat() method
		System.out.println("String Concatination by concat() method = "+ s8);//Sachin Tendulkar 
		
		String s9=50+30+"Sachin"+40+40;  
		System.out.println(s9);//80Sachin4040  
		 
		//String Concatenation using StringBuilder
		StringBuilder s10 = new StringBuilder(s6);     
        StringBuilder s11 = new StringBuilder(s7);    
        StringBuilder s12 = s10.append(s11); 
        System.out.println("String Concatenation using StringBuilder = "+ s12.toString()); 
        //toString() is used to convert text into string.Otherwise it will print hashcode
        System.out.println("String concatenation using format() method(String) = "+ String.format("%s%s",s6,s7));
        System.out.println("String concatenation using join() method(String) = "+ String.join("",s6,s7));
        
		//subString
        System.out.println("Substring starting from index 6: " +s12.substring(6));//Tendulkar    
        System.out.println("Substring starting from index 0 to 6: "+s12.substring(0,6)); //Sachin  
        
        //split - Below example converts text into array
        String text= new String("Hello, My name is Sachin");  
        String[] sentences = text.split("\\.");  
        System.out.println(Arrays.toString(sentences));  
        
        //toUpperCase() and toLowerCase()
        System.out.println("toUpperCase() = "+ s6.toUpperCase());
        System.out.println("toLowerCase() = "+ s6.toLowerCase());
        
        //trim()
        System.out.println("Before trim() = "+ s7);
        System.out.println("After trim() = "+ s7.trim());
        
        //startsWith() and endsWith()
        System.out.println("startsWith() = "+ s6.startsWith("s")); //false - Case-Sensitive
        System.out.println("startsWith() = "+ s6.startsWith("S")); //true
        System.out.println("endsWith() = "+ s6.endsWith("n"));
		
        //charAt()
        System.out.println("charAt() = "+ s6.charAt(0));
       // System.out.println("charAt() = "+ s6.charAt(6)); //StringIndexOutOfBoundsException: String index out of range: 6
        
        //length()
        System.out.println("length() = "+ s6.length());
        
        //valueOf() - converts given type such as int, long, float, double, boolean, char and char array into String
        int a = 10;
        long b = 20;
        float c = 1.1f;
        double d = 56.7d;
        char e = 'W';
        boolean f = true;
        char[] g = {'a','b','c'};
        		
        String s13=String.valueOf(a);    
        System.out.println("valueOf() = "+ s13);   
        
        String s14=String.valueOf(b);    
        System.out.println("valueOf() = "+ s14);   
        
        String s15=String.valueOf(c);    
        System.out.println("valueOf() = "+ s15);   
        
        String s16=String.valueOf(d);    
        System.out.println("valueOf() = "+ s16);   
        
        String s17=String.valueOf(e);    
        System.out.println("valueOf() = "+ s17);   
        
        String s18=String.valueOf(f);    
        System.out.println("valueOf() = "+ s18);   
        
        String s19=String.valueOf(g);    
        System.out.println("valueOf() = "+ s19);   
	}

}
