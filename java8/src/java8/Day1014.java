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
		
		System.out.print("입력 : ");
		for(int i =0; i < r.length; i++)
		{
			r[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("입력 데이터 값 : ");
		for(int i =0; i < r.length; i++)
		{
			System.out.print(r[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < r.length; i++)
		{
			for(int j = 0; j < r.length - 1; j++)
			{
				if(r[i] < r[j])  // > 이렇게 하면 내림차순  (버블정렬)
				{				 // Arrays.sort(r); 오름차순 정렬 쉽게
					int temp = r[i];
					r[i] = r[j];
					r[j] = temp;
				}
			}
		}
		
		System.out.print("오름차순 데이터 값 : ");
		for(int i = 0; i < r.length; i++)
		{
			System.out.print(r[i]+ " ");
		}
		System.out.println();

	}

}
