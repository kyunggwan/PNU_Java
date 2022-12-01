package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap02 {
	public static void main(String[] args) {

		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("고진감래", "고생 끝에 즐거움이 옴");
		dic.put("분골쇄신", "몸이 부서질정도로 노력을 다함");
		dic.put("권토중래", "실패를 발판삼아 재기함");
		dic.put("교학상자", "가르치고 배우면서 서로 성장함");
		dic.put(null, null); // HashMap은 null값 저장 가능

		// 방법 1 : Iterator = 값을 가져오거나 삭제하는 collection
		//Iterator<데이터타입> 명명 = 컬렉션.iterator();
		//3가지만 기억 
		//Iterator.hasNext() : 값이 있으면 true, 없으면 false
		//Iterator.Next() : Iterator의 다음값 가져오기
		//Iterator.remove() : Next()로 가져온 값을 삭제, 반드시 Next()가 선행되어야함.
		Iterator<String> keys = dic.keySet().iterator();	//keys 를 키셋으로 정의
		while (keys.hasNext()) {	//모든 키 값들을 출력 
			String key = keys.next();	//key는 값 가져오기.
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}

		// 방법 2 : Map.Entry를 사용하여 처리. 
		//elem을 entryset()으로 명명하고, 키와 값을 elem.getKey(), elem.getValue()로 출력
		for (Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.println(String.format("%s : %s", elem.getKey(), elem.getValue()));
		}

		// 방법 3 : 확장 for문으로 출력, dic.keySet()을 key로 정하고 처음부터 끝까지 출력함. 
		for (String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
	}
}
