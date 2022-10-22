package Collection;

import java.util.*;

public class Ch1_ArrayString {
	// Arraylist -> 배열 -> 정렬 -> 배열 -> ArrayList출력 하기
	// string 정렬, binary search 구현
	// 1단계: string, 2단계: string 객체, Person 객체들의 list\

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("뉴욕");
		list1.add("도쿄");
		list1.add("도쿄");
		list1.add("도쿄");
		list1.add("도쿄");

		// ArrayList 상태에서의 정렬
		// collection.sort하면 순서가 정렬된다
		// System.out.println("collection.sort()::");
		// Collections.sort(list1);

		// Arraylist를 배열로 만듦. 배열 이름은 cities
		String cities[] = new String[0];
		cities = list1.toArray(cities);

		// cities 배열을 -> 정렬로 만들기
		// collection.sort(ArrayList상태)도 있지만 다른 방법으로 정렬
		// Arrays.sort도 있지만 다른 방법으로 정렬
		
		//배열의 정렬
		String temp;
		for(int i = 0; i < cities.length; i++ ) {
			for (int j = i+1 ; j< cities.length; j++) {
				if( cities[i].compareTo(cities[j]) >0 ) {
					temp = cities[i];
					cities[i] = cities[j];
					cities[j] = temp; 
				}
			}
		}
		
		// cities 배열 출력
		System.out.println("");
		System.out.println("정렬후::");
		for (String city : cities)
			System.out.print(city + " ");

		// 배열 -> 리스트
		ArrayList<String> lst = new ArrayList<String>(Arrays.asList(cities));

		// 리스트로 만들어서 중복제거, 리스트는 수동으로 크기를 줄여줘야함.
		int count = cities.length;
		for (int i = 0; i < count; i++) {
			int j = i + 1;
			while (j < count) {
				if ((lst.get(i)) == (lst.get(j))) {
					lst.remove(j);
					count--;
				} else
					j++;
			}
		}
		System.out.println("");
		System.out.println("중복제거::");

		for (String city : lst)
			System.out.print(city + " ");

	}
}
