package Day19;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableSearch {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++) 
		{
			System.out.print("이름, 전화번호 : ");
			String a = sc.next();
			String b = sc.next();
			ht.put(a, b);
		}

		System.out.print("이름 입력 : ");
		String search = sc.next();
		String tel = ht.get(search);
		System.out.println(search + "는" + tel);
		sc.close();
	}

}
