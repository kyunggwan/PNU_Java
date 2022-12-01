package hashmap;

import java.util.HashMap;

public class Hashmap01 {

	public static void main(String[] args) {

		String word[] = { "BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER" };
		String meaning[] = { "꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다" };

		HashMap<String, String> dic = new HashMap<String, String>();
		for (int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]); // 키, 밸류를 저장
		}

		System.out.println(dic); // HashMap의 키,값들을 출력
		System.out.println(dic.size()); // 사이즈 출력

		System.out.println(dic.keySet()); // 키 출력
		System.out.println(dic.values()); // 값 출력

		System.out.println("HEAVEN: " + dic.get("HEAVEN")); // 키HEAVEN에 해당되는 값인 "꿀벌과에 속하는 호박벌" 출력
		System.out.println("=========================================");
		dic.replace("HEAVEN", "아주 행복한 감정"); // 키 HEAVEN의 값 수정
		System.out.println("HEAVEN: " + dic.get("HEAVEN"));
		System.out.println("=========================================");
		dic.put("HEAVEN", "이상적인 세상"); // 데이터 추가, 값 중복시 덮어쓰기
		System.out.println("HEAVEN: " + dic.get("HEAVEN"));
		System.out.println("=========================================");
		System.out.println(dic.containsKey("BUMBLEBEE")); // true
		System.out.println(dic.containsValue("자장가")); // false
		System.out.println("=========================================");
		dic.remove("HEAVEN"); // 키 HEAVEN에 해당하는 값 삭제, 여기서는 없음
		System.out.println(dic.containsKey("HEAVEN")); // false
		System.out.println("=========================================");
		dic.clear(); // HashMap 모든 내용 삭제
		System.out.println(dic.isEmpty()); // true
		System.out.println(dic.size()); // 0
	}
}
