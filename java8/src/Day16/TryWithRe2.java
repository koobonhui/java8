package Day16;

import java.io.File;
import java.util.Scanner;

public class TryWithRe2 {
	
	public void getData(String file) {
		
		try(Scanner sc = new Scanner(new File(file)); Scanner sc2 = new Scanner(System.in);)  // 여러 개의 자동 닫힘 소스를 작성할 수 있음 
		{
			System.out.println(sc.nextLine());
		} 
		catch (Exception e) 
		{
			System.err.println("예외");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();	
		}
		
	}
	public static void main(String[] args) {
		TryWithRe2 rw = new TryWithRe2();
		rw.getData("test.txt");
	}
}
