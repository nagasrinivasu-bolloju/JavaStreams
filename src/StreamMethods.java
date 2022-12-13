import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class StreamMethods
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Float> nums=new ArrayList<>();
		nums.add(97.43f);
		nums.add(87.4f);
		nums.add(39.23f);
		nums.add(45f);
		nums.add(56.13f);
		nums.add(76.4f);
		nums.add((float) 45);
		nums.add(56.13f);
		nums.add(45f);
		
		//toList
		List<Float> list=nums.stream().filter(i-> i>50).collect(Collectors.toList());
		System.out.println("toList():"+list);
		
		//toset
		Set<Integer> arr=nums.stream().filter(i->i>50).map(i->i.intValue()).collect(Collectors.toSet());
		System.out.println("toSet() :"+arr);
		
		// max method
		System.out.println("\nMaximum number is:");
		System.out.println(nums.stream().max((i,j)->i>j?1:-1).get());
		
		// min method
		System.out.println("\nMinimum number is:");
		System.out.println(nums.stream().min((i,j)->i>j?1:-1).get());  //same syntax for max and min..
		
		//distinct
		System.out.println("\nDistinct numbers are :");
		nums.stream().distinct().forEach(System.out::println);
		
		//count
		System.out.println("\nTotal no of Distinct numbers are :"+nums.stream().distinct().count());
		
		//allmatch()
		boolean b1=nums.stream().allMatch(i->i>10);
		boolean b2=nums.stream().allMatch(i-> i>50);
		if(b1)
			System.out.println("\nAll elements are above 10 only.");
		if(b2)
			System.out.println("All elements are above 50 only.");
		
		//anyMatch
		if(nums.stream().anyMatch(i->i==45))
			System.out.println("\n45 exists in nums.");
		
		
		//forEachOrdered
		//For sequential streams both forEach and forEachOrdered will return same original order but when it comes 
		// to parallel streams the order may change for both and forEachOrdered will return the same initial  order.
		System.out.println("\nOrder using forEachOrdered:");
		nums.stream().parallel().distinct().forEachOrdered(System.out::println);
		System.out.println("\nOrder using forEach :");
		nums.stream().parallel().distinct().forEach(System.out::println);
		
		//sorted
		System.out.println("\nsorted order of nums :");
		System.out.println(nums.stream().sorted().collect(Collectors.toList()));
		
		
		//findAny
		System.out.println("\nAnyElement:"+nums.stream().parallel().findAny().orElse(0f).intValue());
		
		//findFirst
		System.out.println("\nFirst element greater than 50 is:"+nums.stream().filter(i->i>50).findFirst().orElse(0.0f));
		
		//iterating ober streams
		Iterator<Float> it=nums.stream().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
											//Stream INTERFACE STATIC METHODS
		
		//Stream.generate() it will generate an infinite stream hemce limit is used to make it finite.
		//it uses supplier interface instance 
		System.out.println("\n5 Random numbers between 1-100 :");
		Stream.generate(()->(int)(Math.random()*100)).limit(5).forEach(System.out::println);
		
		//concat
		System.out.println("\nconcat illustration :");
		List<Integer> l2=Arrays.asList(1,2,3,4,5);
		Stream<Integer> st=Stream.concat(l2.stream(),nums.stream().distinct().map(i->i.intValue()));
		st.forEach(System.out::println);
		
		
	}

	 

}
