package SelfStudy;

abstract class Drinks {
	private String name; // 음료 이름
	private int num; // 가격

	public Drinks(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public abstract void drink();
}

class Juice extends Drinks {
	public Juice() {
		super("망고", 10000);

	}

	public Juice(String name, int num) {
		super(name, num);
	}

	public void drink() {
		System.out.printf("%d원 짜리 %s를 마십니다.\n", getName(), getNum());
	}
}

public class Order {

	public static void main(String[] args) {

		Juice j = new Juice("오렌지 쥬스", 1000);
		j.drink();

		Juice j1 = new Juice();
		j1.drink();

	}

}

