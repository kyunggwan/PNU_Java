package Array;
import java.util.ArrayList;

public class Listt {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add("대전");
		list.add("대구");
		
		//list 목록을 한번에 출력
		System.out.println(list);
		
		//list 목록 내의 요소들을 하나씩 출력
		for(int i = 0 ; i < list.size(); i++) {
		System.out.println(list.get(i));
		}
		System.out.println("1: " + list.toString());
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(899);
		list1.add(59);
		list1.add(46);
		list1.add(43);
		list1.add(26);
		
		System.out.println(list1);
	}
}
