package objectEx;

import java.util.HashMap;

public class ObjectEx03 {

	public static void main(String[] args) {
		HashMap<Key, String> keyMap = new HashMap<>();
		Key key = new Key(1);
		Key key2 = new Key(2);
		Key key3 = new Key(1);
		
		keyMap.put(key, "홍길동");
		keyMap.put(key2, "나잘난");
		keyMap.put(key3, "너잘난");
		
		System.out.println("키 == 키3 " + key.equals(key3));
		System.out.println(keyMap.get(key));
		System.out.println(keyMap.get(key2));
		System.out.println(keyMap.get(key3));
	}
	public void chekEquals() {
		
		Key key1 = new Key(1);
		Key key2 = new Key(1);
		
		System.out.println(key1 == key2);
		System.out.println("key1.equlse(key2) " +key1.equals(key2) );
		
		System.out.println("key1");
		System.out.println(key1.hashCode());
		System.out.println(Integer.toHexString(key1.hashCode()));
		System.out.println(key1.toString());
		System.out.println("=====================");
		System.out.println("key2");
		System.out.println(key2.hashCode());
		System.out.println(Integer.toHexString(key2.hashCode()));
		System.out.println(key2.toString());
		System.out.println("=====================");
		System.out.println("key1.equlse(key2) " +key1.equals(key2) );
		
	}

}
