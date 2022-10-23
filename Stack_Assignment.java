package Chap5_Recursive;

public class Stack_Assignment {

}
package Chap4_StackQueue;

import java.lang.RuntimeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	//--- 실행시 예외: 스택이 비어있음 ---//
	// generic class는 Throwable을 상속받을 수 없다 - 지원하지 않는다
	public class EmptyStackException extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public EmptyStackException() {
			super();
		}
	}

	//--- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {
		}
	}

//private T data[];           // 스택용 배열
	private List<T> data;
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터

//--- 생성자(constructor) ---// 133페이지 밑쪽에 생성자 있음. 책은 배열인데 여긴 리스트니까 고쳐서 밑에 완성 트라이캐치는 주석처리하고
	public Stack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}

	}

//--- 스택에 x를 푸시 ---//
	public int push(T x) {
		if ( ptr >= capacity )
			throw new OverflowIntStackException();
		return stk[ptr++] = x;

	}
	
//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public T pop()  {
			if (ptr <= 0)
				throw new EmptyIntStackException();
			return[--stk];

	}

//--- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public T peek() {

	}

//--- 스택을 비움 ---//
	public void clear() {
		top = 0;
	}

//--- 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 ---//
	public int indexOf(T x) {
		for (int i = ptr -1; i >=0; i--)
			if (stk[i] == x)
				return i;
		
		return -1;
	}

//--- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return top;
	}

//--- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

//--- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return top >= capacity;
	}

//--- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.println(stk[i] + " ");
			System.out.println()
		}

	}
}