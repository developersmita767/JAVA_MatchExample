package Java_8;
import java.util.List;

public class MatchExample {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		System.out.println(list.stream().anyMatch(n->n%10==0));
		
		System.out.println(list.stream().allMatch(n->n%2!=0));
		
		System.out.println(list.stream().noneMatch(n->n%10!=0));;
	}

}
