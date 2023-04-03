package objectEx;

import java.util.HashMap;

public class ObjextEx2 {
	public static void main(String[] args) {
		/**
		 * 			타입,타입
		 * HashMap<key,value>
		 * 
		 * 해쉬맵 선언부
		 * HashMap<String, String> hashmap = new HashMap<>();
		 * 
		 * 동일한 키가 저장될수 없다.
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기
		 * 
		 * 1 홍길동
		 * 2 너잘난
		 * 3 나잘난
		 */
		HashMap<String, String> hashmap = new HashMap<>();
		// 데이터를 담는 방법
		hashmap.put("key", "value");
		hashmap.put("key1", "value1");
		hashmap.put("key2", "newValue");

		
		// 데이터를 꺼내는 방법
		String str = hashmap.get("key");
		System.out.println("key : "+str);
		System.out.println("key1 : "+hashmap.get("key1"));
		System.out.println("key2 : "+hashmap.get("key2"));

		HashMap<Integer, String> hashMap1 = new HashMap<>();
		hashMap1.put(1, "홍길동");
		hashMap1.put(2, "너잘난");
		hashMap1.put(3, "나잘난");
		
		System.out.println("==========================");
		System.out.println("1 : "+hashMap1.get(1));
		System.out.println("2 : "+hashMap1.get(2));
		System.out.println("2 : "+hashMap1.get(3));
		System.out.println("==========================");
		
	}
}
