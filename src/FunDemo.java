import java.io.*;
//import java.util.function.Function;
//import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
//import java.util.function.BinaryOperator;

public class FunDemo
{
	public static void main(String[] args)
	{
		List<Integer> arr=Arrays.asList(1,2,3,4,5);	 
		//System.out.println("sum of squares of 1 to 5 is:"+arr.stream().map(i->i*i).reduce(0,(c,e)->c+e));
		System.out.println(arr.stream().map(i->{
			System.out.println("hai");
			return i;}).reduce(0,(c,e)->c+e));
	}
}

