package assignment4_1;
/*
 * program to demonstrate the use of method overloading and method overriding.
 */

class Assignment4 //Parent Class
{
	//Showing How Method Overloading Occurs
     public int add(int a, int b) //2 Integer parameter with Integer Return Type
     {
    	 System.out.println("Two Integer Parameters with Integer Return Type");
    	 return a+b;
     }
     public int add(int a, int b, int c)//3 Integer parameter with Integer Return Type
     {
    	 System.out.println("Three Integer Parameters with Integer Return Type");
    	 return a+b+c;
     }
     public double add(double a, double b)//2 Double parameter with Double Return Type
     {
    	 System.out.println("Two Double Parameters with Double Return Type");
    	 return a+b;
     }
     public void Show()// Overridden Method
     {
    	 System.out.println("Showing Method Overloading");
     }
}
class Assignment4_1 extends Assignment4//Child Class
{
	public void Show()//Overriding method
    {
   	 System.out.println("Showing Method Overridden");
    }
	public static void main(String[] args)//Start of Main Class
	{
		System.out.println("Method Overloading Occurs");
		Assignment4_1 a=new Assignment4_1();
		a.add(2, 3);//Calling Overloaded Methods of Parent Class
		a.add(2, 3, 4);//Calling Overloaded Methods of Parent Class
		a.add(2d, 3d);//Calling Overloaded Methods of Parent Class
		a.Show();//call to the child class method Show() to show occurrence of Method Overridden
	}//Close of Main Class
}

