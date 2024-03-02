import java.util.ArrayList;
import java.util.stream.Stream;

public class Sample {
	public static void main(String[] args) {
//		long count =Stream.of("vinitha").filter(s-> s.length()>3).count();
//		System.out.println(count);
		//loop  with lambda
		Stream.of("vinitha","Mini").filter(s-> s.length()>3).forEach(s -> System.out.print(s));
	}
 
}


