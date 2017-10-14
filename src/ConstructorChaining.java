/**
 * Program to demonstrate Constructor Chaining
 * When one constructor calls other then it is referred as Constructor chaining.
 * this and super keywords are used to call a constructor from another constructor.
 * Constructor Chaining is an important OOPS concept
 * @author Soham Dixit 
 */


public class ConstructorChaining {                         //public class

	public static void main(String[] args) {
		// testing our code
		System.out.println("Constructor Chaining is illustrated between: \n1)Same class \n2)Child and Parent class");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("1)Constructor Chaining between Same class :\n"); 
		Base object = new Base();   //creating object of base class. when object is created default constructor of base class is called
		System.out.println("------------------------------------------------------------------------");
		System.out.println("1)Constructor Chaining between Child and Parent class :\n"); 
		Derived obj = new Derived("Soham");        //creating object of derived class. when object is created parameterized constructor of derived class is called
		System.out.println("------------------------------------------------------------------------");
	}

}


class Base{                    //Base class
	
	public String name;        //initializing variable name
	
	public Base() 			   //constructor with no argument
	{            
		this("");                  //one argument constructor of same class is called
		System.out.println("We are inside constructor with no argument of Base class"); //printing statement
	}
	
	public Base(String name) 	//constructor with one argument of same class
	{       
		this.name=name;  //use of this is used to initialize variable
		System.out.println("We are inside constructor with one argument of Base class"); //printing statement
	}

}


class Derived extends Base      //derived class is inherited from base class
{
	 public Derived()   //constructor of derived class with no argument
	 {             
	       System.out.println("We are inside constructor with no argument of Derived class"); //printing statement
	 }
	  
	 public Derived(String name)    //constructor of derived class with one argument
	 {
	       super(name);             //calling one argument constructor of super class
	       System.out.println("We are inside one arg constructor of Derived class");  //printing statement
     }
}
