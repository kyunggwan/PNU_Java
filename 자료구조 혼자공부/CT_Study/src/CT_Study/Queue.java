package CT_Study;
import java.util.NoSuchElementException;

public class Queue <T>{

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }
    private Node<T> first;
    private Node<T> last;

    public void add(T item){
        Node<T> t = new Node<T> (item);

        // last 노드가 없다면 그 뒤에 새로 생성한 노드를 붙인다.
        if(last != null){
            last.next = t;
        }
        last = t;
        // 데이터가 없을떄는 첫번째 node도 null이므로 같은 값을 할당
        if(first == null){
            first = last;
        }

    }

    // Queue에서 데이터를 꺼냄
    public T remove(){
        // Queue가 비어있으면 Exception
        if(first == null){
            throw new NoSuchElementException();
        }
        // Queue의 맨앞의 녀석을 출력하기 전에 두번째 노드를 first로 만들어줌
        // first를 백업하고
        T data = first.data;
        // 두번째 녀석을 first로 만듦
        first = first.next;
        // Queue 마지막 부분
        if(first == null){
            last = null;
        }
        return data;
    }

    public T peek() {
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}
