package sec04_stackandqueue.EX02_QueueMethod;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

// 양방향 Queue
// 삽입과 삭제를 양쪽에서 할 수 있음
// 동기화 처리가 안되어 있음
// 자바 6에서 나온거라, 지금 나온 Queue 중에 가장 빠름
// 그래서 동기화 처리를 하려면 직접 쳐야하는데,
// 오류를 낼 가능성이 높으므로
// ConcurrentLinkedDeque 사용을 권장함
public class DequeMethod {	
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // First : 앞에서 넣음
        deque.addFirst("밤");
        // Last : 뒤에서 넣음
        deque.addLast("별");
        deque.addFirst("달");

        System.out.println(deque); // [달, 밤, 별]
        deque.removeLast();        // "별" 제거
        System.out.println(deque); // [달, 밤]
        
        // 동기화 필요시 ConcurrentLinkedDeque<>() 사용
        Deque<String> dequeSynch = new ConcurrentLinkedDeque<>();

        dequeSynch.add("사과");
        dequeSynch.addFirst("바나나");
        dequeSynch.addLast("딸기");
        
        System.out.println(dequeSynch);
        while (!dequeSynch.isEmpty()) {
            System.out.println(dequeSynch.pollFirst());  // FIFO 순으로 출력
        }
    }
}