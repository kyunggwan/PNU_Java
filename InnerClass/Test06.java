package InnerClass;
//제너릭 인터페이스
interface MyFunc<T> {		//인터페이스<타입 인자> 을 써야하는데 T라는 제너릭 타입을 넣었다.
	T modify(T t); 			//아래서 보면 str, n 이 들어오는데 제너릭이라서 다 받을 수 있음.
}

public class Test06 {

	public static void main(String[] args) {

			
		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();
		System.out.println(mf1.modify("java"));
		System.out.println(mf1.modify("java programming"));

		MyFunc<Integer> mf2 = (n) -> n * 2; //integer =
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
	}
}