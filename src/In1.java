
public interface In1 
{
	final int a = 10; // public, static and final
    void display(); // public and abstract 
    static void show()
    {
    	System.out.println("I am in show!!!");
    }
    default void fun()
    {
    	System.out.print("I am in default method!!!");
    }
}
