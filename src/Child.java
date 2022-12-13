
public class Child extends Parent implements Interfc{
	public void sample()
	{
		System.out.println("In child class");
	}
	public void fun()
	{
		System.out.println("Hiii");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Child obj= new Child();
		obj.sample();
		obj.fun();
	}

}
