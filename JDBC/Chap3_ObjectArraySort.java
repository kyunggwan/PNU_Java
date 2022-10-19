package New;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

class Fruit implements Comparator<Fruit> {
	private String name;
	private int price;

	public int compare(T o1, T o2) {
		if (o1.price > o2.price) {
			return 1;
		} else if (o1 < o2) {
			return -1;
		} else {
			return 0;
		}
	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "<" + name + ", " + price + ">";
	}

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		return 0;
	}

}

public class Chap3_ObjectArraySort {

public static void main(String[] args) {
	
		Fruit[] arr = { new Fruit("사과", 200), new Fruit("키위", 500), new Fruit("오렌지", 200), new Fruit("바나나", 50),
				new Fruit("수박", 880), new Fruit("체리", 10) };

		System.out.println();
		System.out.println("정렬전::");
		for (Fruit city : arr)
			System.out.print(" " + city);
		
		Arrays.sort(arr);

//구현 - 정렬
		System.out.println();
		System.out.println("정렬후::");
		for (Fruit city : arr)
			System.out.print(" " + city);

		ArrayList<Fruit> lst1 = new ArrayList<Fruit>(Arrays.asList(arr));
		ArrayList<Fruit> lst2 = new ArrayList<Fruit>();
		lst2.add(new Fruit("복숭아", 200));
		lst2.add(new Fruit("포도", 300));
		lst2.add(new Fruit("참외", 100));
		lst2.add(new Fruit("딸기", 50));
		lst2.add(new Fruit("블루베리", 500));
		lst2.add(new Fruit("구지뽕", 300));
		System.out.println();
		System.out.println("새로운 리스트2::");
		for (Fruit city : lst2)
			System.out.print(" " + city);
//    Arrays.sort(lst2);
		Collections.sort(lst2);
		System.out.println();
		System.out.println("새로운 리스트2::");
		for (Fruit city : lst2)
			System.out.print(" " + city);

		// 리스트를 배열로 만듦.

		String[] list1 = new String[0];
		list1 = lst1.toArray(list1);
		String[] list2 = new String[0];
		list2 = lst2.toArray(list2);

		List<String> list3 = new ArrayList<String>();

	
	

//구현- merge를 iterator 사용


	// binary search - Comparator를 사용한 구현

//		System.out.println();
//		if (Collections.binarySearch(list3, newFruit, cc) < 0)
//			System.out.println("조회결과 없다");
//		else
//			System.out.println("조회 결과 " + newFruit);
//

}
}
