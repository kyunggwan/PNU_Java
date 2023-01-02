package ch16;

public class RunnableInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++){
                System.out.println("전화 받기 : " + i);
            }
        });

        t1.start();
        t2.start();
        for(int i = 1; i <= 1000; i++){
            System.out.println("TV 보기 : " + i);
        }
    }
}

// Movie는 Runnable인터페이스를 상속받음
// 스레드로 동작하는 개체
class Movie implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 1000; i++){
            System.out.println("음식 먹기 : " + i);
        }
    }
}