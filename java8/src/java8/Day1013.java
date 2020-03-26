package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1013 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] srr = new int[5];
		int max = srr[0];
		int min = srr[0];
		
		System.out.println("입력 : ");
		for(int i =0; i < srr.length; i++)
		{
			srr[i] = Integer.parseInt(br.readLine());
		}
		
		 for(int i = 1; i < srr.length; i++) 
		 {  

	            if(max < srr[i]) 
	            {  
	                max = srr[i];  
	            }
	            if(min > srr[i]) 
	            {  
	                min = srr[i];
	            }
	     }
		 System.out.println("최대 : " + max);
		 System.out.println("최소 : " + min);
		 System.out.println(srr[0]);
		 
	
	}

}
