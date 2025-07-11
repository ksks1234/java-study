package sec01_list.EX04_VectorMethod;

import java.util.Vector;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VectorMethod {
	public static void main(String[] args) {
		List<Integer> vector1 = new Vector<Integer>();
		// 1. add(E element)
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		System.out.println(vector1.toString());
		// 2. add(int index, E element)
		vector1.add(1, 6);
		System.out.println(vector1.toString());
		// 3. addAll(또 다른 리스트 객체)
		List<Integer> vector2 = new Vector<>();
		vector2.add(1);
		vector2.add(2);
		vector2.addAll(vector1);
		System.out.println(vector2);
		// 4. addAll(int index, 또 다른 리스트 객체)
		List<Integer> vector3 = new Vector<>();
		vector3.add(1);
		vector3.add(2);
		vector3.addAll(1, vector3);
		System.out.println(vector3);
		// 5. set(int index, E element)
		vector3.set(1, 5);
		vector3.set(3, 6);
//		vector3.set(4, 7); Java.lang.IndexOutOfBoundsException
		System.out.println(vector3);
		// 6. remove(int index)
		vector3.remove(1);	// 1번 인덱스를 삭제
		System.out.println(vector3);
		// 7. remove(Object o)
		vector3.remove(new Integer(2));
		System.out.println(vector3);
		// 8. clear()
		vector3.clear();
		System.out.println(vector3);
		// 9. isEmpty()
		System.out.println(vector3.isEmpty());
		// 10. size()
		System.out.println(vector3.size());
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		// 11. get(int index)
		System.out.println("0번째: " + vector2.get(0));
		System.out.println("1번째: " + vector2.get(1));
		System.out.println("2번째: " + vector2.get(2));
		for(int i = 0; i < vector3.size(); i++) 
			System.out.println(i + "번째: " + vector3.get(i));
		// 12. toArray() List -> Array
		Object[] objects = vector3.toArray();
		System.out.println(Arrays.toString(objects));
		// 13-1. toArray(T[] t) -> T[]
		Integer[] integer1 = vector3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		// 13-2. toArrays(T[] t) -> T[]
		Integer[] integer2 = vector3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		List<String> list = Collections.synchronizedList(new Vector<>());
		// Vector 대신 이런식으로 더 많이 씀. 
		// set도 마찬가지
	}

}
