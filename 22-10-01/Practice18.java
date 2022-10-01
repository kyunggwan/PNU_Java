package SelfStudy;

import java.util.Scanner;
//프로그래밍 수업의 학점은 아래와 같은 기준으로 결정됩니다. 주어진 성적 변수에 대한 학점을 반환하는 메소드 grade() 를 완성하여, 출력 예와 같은 결과를 얻으세요
//A+: 95점 이상, A0: 90점 이상, B+: 85점 이상, B0: 80점 이상
//C+: 75점 이상, C0: 70점 이상, D+: 65점 이상, D0: 60점 이상, F : 그 외
//
//출력 예
//96점 -> A+
//85점 -> B+
//76점 -> C+

class St {
	private String name; // 학생 이름
	private int kor; // 국어
	private int eng; // 영어

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	// 생성자
	public St() {
		name = "";
		kor = 0;
		eng = 0;
	}

	public St(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public double Avg() {
		return (kor + eng) / 3;
	}

	// 성적 함수
	public String gradeKor() {
		if (kor >= 95) {
			return "A+";
		} else if (kor >= 90) {
			return "A";
		} else if (kor >= 85) {
			return "B+";
		} else if (kor >= 80) {
			return "B";
		} else if (kor >= 75) {
			return "C+";
		} else if (kor >= 70) {
			return "C";
		} else if (kor >= 65) {
			return "D+";
		} else if (kor >= 60) {
			return "D";
		} else {
			return "F";
		}
	}

	public String gradeEng() {
		if (eng >= 95) {
			return "A+";
		} else if (eng >= 90) {
			return "A";
		} else if (eng >= 85) {
			return "B+";
		} else if (eng >= 80) {
			return "B";
		} else if (eng >= 75) {
			return "C+";
		} else if (eng >= 70) {
			return "C";
		} else if (eng >= 65) {
			return "D+";
		} else if (eng >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
}

public class Practice18 {

	public static void main(String[] args) {
		St a = new St();
		Scanner sc = new Scanner(System.in);

		System.out.print("[학생이름을 입력하세요!]");
		a.setName(sc.next());
		System.out.print("[국어 성적을 입력하세요!]");
		a.setKor(sc.nextInt());
		System.out.print("[영어 성적을 입력하세요!]");
		a.setEng(sc.nextInt());

		System.out.println("학생 " + a.getName() + "의 성적 >> [국어 = " + a.getKor() + "], [영어 = " + a.getEng() + "], [평균 = "
				+ a.Avg() + "]");
		System.out.println("학생 " + a.getName() + "의 학점 >> [국어 >> " + a.gradeKor() + "], [영어 >> " + a.gradeEng() + "]");
	}
}
