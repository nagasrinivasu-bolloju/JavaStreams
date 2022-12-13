import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
public class OriginalPredicate
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,2,4,6,10,11,112);
		System.out.println("All elements:\n"+arr);
		Predicate<Integer> p=i->i>=10;
		System.out.println("elements >=10:");
		arr.stream().filter(p).forEach(System.out::println);
	}

}
