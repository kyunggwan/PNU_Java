package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class MergeList {

	public static String[] merge(String[] lst1, String[] lst2, String[] list3) {
		
		String [] arr1 = new String[0];
		arr1 = lst1;
		String [] arr2 = new String[0];
		arr2 = lst2;
		String [] arr3 = new String[20];
		arr3 = list3;
		
		int i = 0, j = 0, k = 0;		
		int c = arr1.length;
		int d = arr2.length;
	
		while(i < c && j < d) {
			if( i < c) {
				arr3[k] = arr1[i];
				k++; i++;
			} else if( j < d) {
				arr3[k]= arr2[j];
				k++; j++;
			} else (a[i] == a[j]){
				
			}
		}
	}
//교수님이 짜주신 코드 mergeList
//	public static List<String> mergeList(List<String> list1, List<String> list2, List<String> list3) {
//		int i = 0;
//		int j = 0;
//		int k = 0;
//
//		while (i < list1.size() && j < list2.size()) {
//			if ((list1.get(i)).compareTo(list2.get(j)) < 0) {
//				list3.add(list1.get(i));
//				i++;
//			} else {
//				list3.add(list2.get(j));
//				j++;
//			}
//		}
//
//		while (i < list1.size() && j == list2.size()) {
//			list3.add(list1.get(i));
//			i++;
//		}
//		while (i == list1.size() && j < list2.size()) {
//			list3.add(list2.get(j));
//			j++;
//		}
//
//		String[] arr3 = new String[0];
//		arr3 = list3.toArray(arr3);
//		list3 = removeDuplicate(arr3);
//
//		return list3;
//	}

	// removeElement는 배열을 리스트로 만들어서 요소 제거
	public static String[] removeElement(String[] arr, String item) {
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(item);
		return list.toArray(String[]::new);
	}

	// removeDupicate는 중복 부분 제거
	public static String[] removeDuplicate(String[] lst) {
		int count = lst.length;
		for (int i = 0; i < count; i++) {
			int j = i + 1;
			while (j < count) {
				if (lst[i].compareTo(lst[j]) == 0) {
					lst = removeElement(lst, lst[j]);
					count--;
					System.out.println("j = " + j + "count = " + count);
				} else
					j++;
			}
		}
		return lst;
	}

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("북경");
		list1.add("상해");
		list1.add("서울");
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
		list2.add("서울");
		list2.add("서울");
		list2.add(1, "LA");

		// 리스트를 정렬함.
		System.out.println("collection.sort()::");
		Collections.sort(list1);
		Collections.sort(list2);

		// list1과 list2를 배열로 만듦.
		String[] lst1 = new String[0];
		lst1 = list1.toArray(lst1);
		String[] lst2 = new String[0];
		lst2 = list2.toArray(lst2);

		// 중복 삭제 전의 list1, list2 출력
		System.out.println("기존 list1::");
		for (String city : list1)
			System.out.print(city + " ");
		System.out.println("");
		System.out.println("기존 list2::");
		for (String city : list2)
			System.out.print(city + " ");
		System.out.println("");

		// 중복 제거
		// 중복 제거의 선행작업 : 리스트로 만들기, 정렬하기
		// 위의 메소드 2개로 표현
		lst1 = removeDuplicate(lst1);
		lst2 = removeDuplicate(lst2);

		// 중복 제거 후 lst1, lst2를 배열 형태로

		// 출력
		System.out.println("");
		System.out.println("중복 제거 후 lst1::");
		for (String city : lst1)
			System.out.print(city + " ");
		System.out.println("");
		System.out.println("");
		System.out.println("중복 제거 후 lst2::");
		for (String city : lst2)
			System.out.print(city + " ");

		// list3 배열 생성
		String[] list3 = new String[20];
		// merge하기
		merge(lst1, lst2, list3);

//		int i=0, j=0, k=0;
//		while(i < lst1.length && j < lst2.length) {
//
//		}
//		
		// merge한 list3 출력
		System.out.println("");
		System.out.println("merge:: ");
		for (String city : list3)
			System.out.print(city + " ");

//		//list3배열을 list로 만들어서 정렬하기
//		String[] lst3 = new String[20];
//		lst3 = list3.toArray(lst3);
//		Collections.sort(lst3);
//		
//		//merge를 정렬한 lst3 출력
//		System.out.println("");
//		System.out.println("merge:: ");
//		for (String city : lst3)
//			System.out.print(city + " ");

		
		
	      
//      merge 교수님이 짜주신 코드
//     List<String> list3 = new ArrayList<String>();
//     list3 = mergeList(list1, list2, list3);
//     
//     System.out.print("\nmergeList \nlist3 : ");
//     
//     for(String city: list3) {
//        System.out.print(city+ " ");
//     }
//     
//     
//     Iterator는 배열을 쓰지 않는다. ArrayList만 쓴다.
		
//     Iterator<String> iter1 = list1.iterator();
//     Iterator<String> iter2 = list2.iterator();
//     String s1 = iter1.next();
//     String s2 = iter2.next();
//     while(iter1.hasNext() && iter2.hasNext()) {
//        if((s1.compareTo(s2))<0) {
//           list3.add(s1);
//        s1 = iter1.next();
//        }
//        else if ((s2.compareTo(s1))<0) {
//           list3.add(s2);
//        s2 = iter2.next();
//        }
//        else {
//           
//     
// 
//        }
//        System.out.println("\n Iterator : ");
//		
		
	}
}

//if(lst1[i]  ==  lst2[j]) {
//list3[k] = lst1[i];
//k++;
//i++;
//j++;
//} else {
//list3[k] = lst1[i];
//list3[k+1] = lst2[j];
//k++;
//k++;
//i++;
//j++;
//}
