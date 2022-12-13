import java.util.stream.Stream;
 
public class StreamIteration
{

	public boolean isPrime(int num)
	{
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub  
		System.out.println("Stream iteration for for first five numbers divisible by 5:");
		Stream.iterate(1, element->element+1)  
		      .filter(element->element%5==0)  
		      .limit(5)  
		      .forEach(System.out::println); 
		StreamIteration o=new StreamIteration();
		System.out.println("first 5 prime numbers:");
		Stream.iterate(2,i->i+1)
			  .filter(o::isPrime)
			  .limit(5)
			  .forEach(System.out::println);
	}

}
