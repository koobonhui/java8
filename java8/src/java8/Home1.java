package java8;

import java.io.*;


public class Home1 {

	public static void main(String[] args) throws IOException {
		String name;
		int num;
		int score;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("�й� �Է� : ");
		num = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		score = Integer.parseInt(br.readLine());
		
		System.out.println("���� �̸��� " + name + " �Դϴ�.");
		System.out.println("���� �й��� " + num + " �Դϴ�.");
		System.out.println("���� ������ " + score + " �Դϴ�.");
		

	}

}
