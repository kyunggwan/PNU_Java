package Collection;

import java.util.*;

public class Ch1_ArrayString {

	// string 정렬, binary search 구현
	// 1단계: string, 2단계: string 객체, Person 객체들의 list\

	public static String[] removeElement1(String[] arr, String item) {
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(item);
		return list.toArray(String[]::new);
	}

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
		list1.add("도쿄");
		list1.add("뉴욕");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("런던");
		list2.add("로마");
		list2.add("방콕");
		list2.add("북경");
		list2.add("도쿄");
		list2.add("서울");
		list2.add(1, "LA");

		// collection.sort하면 순서가 정렬된다
		// System.out.println("collection.sort()::");
		// Collections.sort(list1);
		// System.out.println("list1::");
		// for (String city : list1)
		// System.out.print(city + " ");
		// System.out.println();
		// System.out.println("list2::");
		// Collections.sort(list2);
		// for (String city : list2)
		// System.out.print(city + " ");

		// Arraylist -> 배열 -> 정렬 -> 배열 -> ArrayList출력 하기

		// Arraylist를 합침
		List<String> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);

		// Arraylist를 배열로 만듦. 배열 이름은 cities
		String cities[] = new String[0];
		cities = list3.toArray(cities);

		// cities 배열을 -> 정렬로 만들기
		// collection.sort도 있지만 다른 방법으로 정렬
		// Arrays.sort도 있지만 다른 방법으로 정렬
		String temp;
		for (int i = 0; i < cities.length; i++) {
			for (int j = i + 1; j < cities.length; j++) {
				if (cities[i].compareTo(cities[j]) > 1) {
					temp = cities[i];
					cities[i] = cities[j];
					cities[j] = temp;
				}
			}
		}
		// Arrays.sort(cities);
		System.out.println("");
		System.out.println("정렬후::");
		for (String city : cities)
			System.out.print(city + " ");

		// 배열 -> 리스트
		ArrayList<String> lst = new ArrayList<String>(Arrays.asList(cities));

		// 중복제거
		int count = cities.length;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if ((lst.get(i))==(lst.get(j))) {
					lst.remove(j); count--;
				}
			}
		}
		System.out.println("");
		System.out.println("중복제거::");

		for (String city : lst)
			System.out.print(city + " ");

	}
}
