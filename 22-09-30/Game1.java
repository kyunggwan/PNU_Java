package SelfStudy;

import java.util.ArrayList;
import java.util.List;

abstract class Unit1 {
	private String name; // 유닛 이름
	private int num; // 유닛 개수

	public Unit1() {
		name = "";
		num = 2;
	}

	public Unit1(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public abstract void attack();
}

class Tank1 extends Unit1 {
	private String weapon;

	public Tank1() {
		super("시즈", 3);
	}

	public Tank1(String tname, int tnum, String tweapon) {
		super(tname, tnum);
		weapon = tweapon;
	}

	public void attack() {
		System.out.printf("%s는 %d발의 %s공격을 한다.", getName(), getNum(), weapon);
	}

}

public class Game1 {

	public static void main(String[] args) {
//		Tank1 t = new Tank1("시즈탱크", 5, "모드");  //출력 방법 1
//		t.attack();	

//		List<Unit1> list = new ArrayList<>(); 	//출력 방법 2
//		list.add(new Tank1("땅크", 4, "시즈"));
//
//		for (Unit1 u : list) {					
//			u.attack();
//		}		
//		
		Unit1[] u1 = new Unit1[1]; // 출력 방법 3
		u1[0] = new Tank1("땅크", 4, "시즈모드");

		for (int i = 0; i < u1.length; i++) { // 출력 방법 3-1
			u1[i].attack();
		}
//for 입력은 두 방법 중 하나지만 위의 방법이 더 좋은듯하다.	
//		for (Unit1 a : u1) {					//출력 방법 3-2
//			a.attack();
//		}

	}

}
