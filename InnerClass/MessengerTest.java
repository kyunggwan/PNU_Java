package InnerClass;

interface Messenger{
	public abstract String getMessage();

	public abstract void setMessage(String msg);

}

//익명 클래스
public class MessengerTest {

	public static void main(String[] args) {
		Messenger test = new Messenger() { //인터페이스를 new 하게 되면 (익명)클래스를 만든다.
											//test는 객체, 불러서 쓴다. 익명클래스의 객체
											//코딩을 간단하게 하려고 만든다.
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다 : " + msg);
			}

			public String getMessage() {
				return "test";
			}
		};
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");

	}
}
