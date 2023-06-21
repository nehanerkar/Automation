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
        System.out.println(Arrays.toString(sentences));  // [Hello, My name is Sachin]
        
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
        
        //2nd way
        s13=Integer.toString(a);    
        System.out.println("Integer.toString() = "+ s13);
        
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
        
        
        //toCharArray() - Convert String to Char Array
        char ch1[] = (s6+s7).toCharArray(); //Sachin Tendulkar
        int len = ch1.length;
        System.out.println("Length of String to convert toCharArray(): "+len);
        System.out.println("Char Array Elements: ");
        int i;
        for(i = 0; i<len; i++)
        {
        	System.out.println(ch1[i]);
        }
        
        //replace() - Replace all occurences old char with new char respectively
        String newt = t.replace('e', 'a');
        System.out.println("Replaced char replce(): "+ newt);
        //Replace old String with new String respectively
        String news6s7 = (s6+s7).replace(s6, "Aryan");
        System.out.println("Replaced String replace(): "+ news6s7);
        
        //replaceAll()
        String newt1 = t.replaceAll("e", "a");
        System.out.println("Replaced String as char replaceAll(): "+ newt1);
        //Replace old String with new String respectively
        String news6s71 = (s6+s7).replaceAll(s6, "Aryan");
        System.out.println("Replaced char replaceAll(): "+ news6s71);
        //replace white space
        String news6s72 = (s6+s7).replaceAll("\\s", "");
        System.out.println("Replaced white space: "+ news6s72);
        
        //indexOf() - Returns first occurrence of specified character or string
        int indext = t.indexOf('r'); //Nerkar
        System.out.println("indexOf(): "+ indext);
        int indext1 = (s+" "+t).indexOf("Nerkar");
        System.out.println("indexOf(): "+ indext1);
        int indext2 = (s+" "+t).indexOf("Nerkar",4); //returns the index of 'Nerkar' substring after 4th index
        System.out.println("indexOf(): "+ indext2);
        
        //lastIndexOf() method returns the last index of the given character value or substring. 
        //If it is not found, it returns -1. The index counter starts from zero.
        int indext3 = (s+" "+t).lastIndexOf('e');
        System.out.println("LastIndexOf(): "+ indext3);
        
        //isEmpty - Return true or false values
        boolean output;
        output = s6.isEmpty();
        System.out.println("isEmpty(): "+ output);
        
        //contains()
        output = s6.contains("Sachin");
        System.out.println("contains(): "+ output);
        
        //reverse() using StringBuffer and StringBuilder
       // StringBuilder sb = new StringBuilder("Neha");
        StringBuilder rev = s12.reverse();
        System.out.println("reverse() using StringBuilder: "+ rev);
        
        StringBuffer SB = new StringBuffer("Neha");
        StringBuffer REV = SB.reverse();
        System.out.println("reverse() using StringBuilder: "+ REV);
        
        //reverse() using String
        String sg = "nitin";
        char ch2[] = sg.toCharArray();
        String revsg = "";
        for(i = sg.length()-1; i>=0; i--)
        {
        	revsg+= ch2[i];
        }
        System.out.println(revsg);
        if(sg.equals(revsg))
        {
        	System.out.println("It is a palindrome string");
        }else
        {
        	System.out.println("It is not a palindrome string");
        }
        
       
        //Interger.parseInt() - Converting String into int
        String si = "32";
        int u = Integer.parseInt(si);
        System.out.println("Integer.parseInt(): "+u);
        
       //2nd way
        u = Integer.valueOf(si);
        System.out.println("Integer.valueOf(): "+u);
        
        
        //Count number of words in string
        String rn = " My name is Neha ";
        rn = rn.trim();
        char c1[]  = rn.toCharArray();
        System.out.println(c1);
        int count = 1;
        for(i = 0; i<=rn.length()-1;i++)
        {
        	if(c1[i] == ' ')
        	{
        		count+= 1;
        	}
        }
        System.out.println("Total words: "+count);
	}

}
