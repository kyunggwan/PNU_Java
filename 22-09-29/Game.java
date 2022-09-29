package SelfStudy;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public static void main(String[] args) {

		Unit[] u = new Unit[4];

		u[0] = new Tank("땅크", 4);
		u[1] = new Airplane("뱅기", 3);
		u[2] = new Submarine("잠수함", 2);
		u[3] = new Soldier("땅개", 3);

		{
			List<Unit> list = new ArrayList<>();
			list.add(new Tank("땅크", 4));
			list.add(new Airplane("뱅기", 3));
			list.add(new Submarine("잠수함", 2));
			list.add(new Soldier("땅개", 3));

			for (Unit a : list)
				// a.move();
				a.attack();
		}

	}
}

class Unit {
	private String name;
	private int num;

	public Unit() {
		name = " ";
		num = 0;
	}

	public Unit(String name) {
		this();
		this.name = name;
	}

	public Unit(String name, int num) {
		this(name);
		this.num = num;
	}

	public void attack() {
		System.out.print(name + "은(는) " + num + "발의 ");
	}

	public void move() {
		System.out.println(name + "은(는) 이동해라");

	}

}

class Tank extends Unit {

	public Tank(String name, int num) {
		super(name, num);
	}

	public void attack() {
		super.attack();
		System.out.print("[포를 쏜다!]");
		System.out.println();
	}

	public void move() {
		super.move();

	}
}

class Airplane extends Unit {
	public Airplane(String name, int num) {
		super(name, num);
	}

	public void attack() {
		super.attack();
		System.out.print("[미사일을 발사한다!]");
		System.out.println();
	}

	public void move() {
		super.move();
	}
}

class Submarine extends Unit {
	public Submarine(String name, int num) {
		super(name, num);
	}

	public void attack() {
		super.attack();
		System.out.print("[어뢰를 쏜다!]");
		System.out.println();
	}

	public void move() {
		super.move();
	}
}

class Soldier extends Unit {
	public Soldier(String name, int num) {
		super(name, num);
	}

	public void attack() {
		super.attack();
		System.out.print("[총을 쏜다!]");
		System.out.println();
	}

	public void move() {
		super.move();
	}
}
