package sec01_list.EX05_LinkedListMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod {
	public static void main(String[] args) {
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		// 1. add(E element)
		linkedlist1.add(3);
		linkedlist1.add(4);
		linkedlist1.add(5);
		System.out.println(linkedlist1.toString());
		// 2. add(int index, E element)
		linkedlist1.add(1, 6);
		System.out.println(linkedlist1.toString());
		// 3. addAll(또 다른 리스트 객체)
		List<Integer> linkedlist2 = new LinkedList<>();
		linkedlist2.add(1);
		linkedlist2.add(2);
		linkedlist2.addAll(linkedlist1);
		System.out.println(linkedlist2);
		// 4. addAll(int index, 또 다른 리스트 객체)
		List<Integer> linkedlist3 = new LinkedList<>();
		linkedlist3.add(1);
		linkedlist3.add(2);
		linkedlist3.addAll(1, linkedlist3);
		System.out.println(linkedlist3);
		// 5. set(int index, E element)
		linkedlist3.set(1, 5);
		linkedlist3.set(3, 6);
//		linkedlist3.set(4, 7); Java.lang.IndexOutOfBoundsException
		System.out.println(linkedlist3);
		// 6. remove(int index)
		linkedlist3.remove(1);	// 1번 인덱스를 삭제
		System.out.println(linkedlist3);
		// 7. remove(Object o)
		linkedlist3.remove(new Integer(2));
		System.out.println(linkedlist3);
		// 8. clear()
		linkedlist3.clear();
		System.out.println(linkedlist3);
		// 9. isEmpty()
		System.out.println(linkedlist3.isEmpty());
		// 10. size()
		System.out.println(linkedlist3.size());
		linkedlist3.add(1);
		linkedlist3.add(2);
		linkedlist3.add(3);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.size());
		// 11. get(int index)
		System.out.println("0번째: " + linkedlist2.get(0));
		System.out.println("1번째: " + linkedlist2.get(1));
		System.out.println("2번째: " + linkedlist2.get(2));
		for(int i = 0; i < linkedlist3.size(); i++) 
			System.out.println(i + "번째: " + linkedlist3.get(i));
		// 12. toArray() List -> Array
		Object[] objects = linkedlist3.toArray();
		System.out.println(Arrays.toString(objects));
		// 13-1. toArray(T[] t) -> T[]
		Integer[] integer1 = linkedlist3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		// 13-2. toArrays(T[] t) -> T[]
		Integer[] integer2 = linkedlist3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		List<String> list = Collections.synchronizedList(new LinkedList<>());
		// Vector 대신 이런식으로 더 많이 씀. 
		// set도 마찬가지
	}

}
