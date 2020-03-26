package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day1014 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] r = new int[5];
		int num;
		
		System.out.print("�Է� : ");
		for(int i =0; i < r.length; i++)
		{
			r[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("�Է� ������ �� : ");
		for(int i =0; i < r.length; i++)
		{
			System.out.print(r[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < r.length; i++)
		{
			for(int j = 0; j < r.length - 1; j++)
			{
				if(r[i] < r[j])  // > �̷��� �ϸ� ��������  (��������)
				{				 // Arrays.sort(r); �������� ���� ����
					int temp = r[i];
					r[i] = r[j];
					r[j] = temp;
				}
			}
		}
		
		System.out.print("�������� ������ �� : ");
		for(int i = 0; i < r.length; i++)
		{
			System.out.print(r[i]+ " ");
		}
		System.out.println();

	}

}
