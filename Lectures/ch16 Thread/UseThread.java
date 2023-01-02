package ch16;

public class UseThread {

    public static void main(String[] args) {

        Food work1 = new Food();
        Phone work2 = new Phone();

        // start() 메소드로 아래의 run()을 호출
        work1.start();
        work2.start();

        for(int i = 1; i <= 1000; i++){
            System.out.println("TV 보기 : " + i);
        }
    }
}

// Thread를 상속받은 Food 클래스로 run()메소드를 통해서 구현할 내용 생성.
class Food extends Thread{
    public void run(){
        for(int i = 1; i <= 1000; i++){
            System.out.println("음식 먹기 : " + i);
        }
    }
}

// 마찬가지로 Thread로 구현한 Phone 클래스
class Phone extends Thread{
    public void run(){
        for(int i = 1; i <= 1000; i++){
            System.out.println("전화 받기" + i);
        }
    }
}