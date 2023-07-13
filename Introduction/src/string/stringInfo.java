package string;

public class stringInfo {
	
//String is an object that represents sequence of char values. An array of characters works same as Java string.
		
//Why String objects are immutable in Java? - As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin". If one reference variable changes the value of the object, it will be affected by all the reference variables.
		
//We can compare String in Java on the basis of content and reference.

//It is used in authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator) etc.

//In Java, String concatenation forms a new String that is the combination of multiple strings.
//By + (String concatenation) operator
//By concat() method
//By format() method
//By join() method
		
//StringBuilder is fastest way to concatenate strings in Java. 
//It is mutable class which means values stored in StringBuilder objects can be updated or changed.

//String.format() method allows to concatenate multiple strings using format specifier like %s followed by the string values or objects.

//Difference between replace() and replaceAll() - replace() method returns a string replacing all the old char whereas replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.
//The method replaceAll(String, String) in the type String is not applicable for the arguments (char, char)
//If the regex is invalid then the it will throw PatternSyntaxException
	
//The contains() method should not be used to search for a character in a string. Doing so results in an error.

	
//String: 
//1.The String class is immutable.
//2.String is slow and consumes more memory when we concatenate too many strings because every time it creates new instance.
//3.String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.

//StringBuffer:
//1.The StringBuffer class is mutable.
//2.StringBuffer is fast and consumes less memory when we concatenate two strings.
//3.StringBuffer class doesn't override the equals() method of Object class.
//4.StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
//5.StringBuffer is less efficient than StringBuilder.
//6.StringBuffer provides reverse() to reverse the string unlike String
	
//StringBuilder:
//1.StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
//2.StringBuilder is more efficient than StringBuffer.
//3.StringBuilder provides reverse() to reverse the string unlike String	
	
}
