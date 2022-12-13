import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class Demo4 implements In1
{
	public void display()
    {  
      System.out.println("Geek");  
    } 
	static void temp()
	{
		System.out.println("In temp!!");
	}
	public static void main(String[] args)
	{
		//Demo4 t = new Demo4(); 
		
		//t.display(); 
		//System.out.println(a);
		//In1.show();
		//t.fun();
		//temp();
		//Consumer<Integer> c=i-> System.out.println(i);
		List<Integer> arr=Arrays.asList(1,2,3,4,5);
		arr.forEach(i-> System.out.println(i));
		/*forEach(Consumer<Integer> c)
		{
			for(int i:arr)
			{
			c.accept(i);
			}
		}*/
		
	}

}




