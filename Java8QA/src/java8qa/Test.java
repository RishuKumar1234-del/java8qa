package java8qa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	
	
	Runnable runnable=new Runnable() {
		
		@Override
		public void run() {
			System.out.println("this is the run method of runnable interface");
			
		}
	};
	
	
	
   
	
	public static void main(String[] args) {
		
		
//		MyFunction mfi= i-> System.out.println("test method implementation");
//		mfi.test(5);
		
//		MyFunction mf= ( i)-> i;
//		System.out.println(mf.test(45));
		
		
		
	List<Integer> numList=Arrays.asList(20,3,4,1,8);
	
	//Predicate<Integer> predicate=  (t)->t%2==0;
	numList.stream().filter((t)->t%2==0).sorted().forEach(System.out::println);
	
	


		List<Employee> employees= Stream.of(
				new Employee(1, "Basant","Dev", 50000),
				new Employee(8, "Santosh","Dev", 80000),
				new Employee(3, "pratik","QA", 60000),
				new Employee(9, "Dipak","QA", 90000),
				new Employee(4, "vikash","Devops", 40000)
				).collect(Collectors.toList());
		
		
		//approach-1
		
		Comparator<Employee> compareBySal=Comparator.comparing(Employee::getSallary);
		
		Map<String, Optional<Employee>> emploeeByHighestSal = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(compareBySal))));
		
		System.out.println(emploeeByHighestSal);
		
	
		List<User> userList=Stream.of(
				new User("user1", 8765430l, Arrays.asList("abcd@gmail.com","def@gmail.com")),
				new User("user2", 85465430l, Arrays.asList("rishk525@gmail.com","user123@gmail.com"))
				).collect(Collectors.toList());
		
		
	//userList.stream().mapToLong(t->t.getPhone()).forEach(System.out::println);
		userList.stream().map(t->t.getEmails()).forEach(System.out::println);
		
		//to find frequency of each character in a string
		
		String input="access";
	Map<String, Long> countMap=	Arrays.stream(input.split(""))
			                    .collect(
			                    	Collectors
			                    	.groupingBy(Function.identity(), Collectors.counting())
			                    		);
	
	System.out.println(countMap);
	
	
	
	IntStream.rangeClosed(1, 10).forEach(e->System.out.println(Thread.currentThread().getName() +e));
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	
	IntStream.rangeClosed(1, 10).parallel().forEach(e->System.out.println(Thread.currentThread().getName() + e));
	
	
	System.out.println("++++++++++++++++++++++++++++++++++++++");
	Object obj=new Object();
	Runnable th1= new EvenOddPrintThread(obj);
	Runnable th2= new EvenOddPrintThread(obj);
	
	new Thread(th1).start();
	new Thread(th2).start();
	
	
	}
	
	
	

}
