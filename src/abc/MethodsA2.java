package abc;

public class MethodsA2 {
	
	
	public static  void m1() 
	{
		System.out.println("sachin pawar void static method ");
	}
	public static void main(String[] args) {
		m1();
		MethodsA c=new MethodsA();   //to call non static method 
		c.m1();
	}
}
