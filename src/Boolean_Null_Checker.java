import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
public class Boolean_Null_Checker
{

	public static void main(String[] args)
	{
		List<Integer> arr=Arrays.asList(1,2,3,4,5);
		@SuppressWarnings("removal")
		CustomPredicate<Integer> c=i->{ return new  Boolean(i%2==0);};
		for(int i:arr)
		{
			if(c.apply(i))
			{
				System.out.println(i);
			}
		}
		
	}

}
