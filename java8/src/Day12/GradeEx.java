package Day12;

import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국 영 수 입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		Grade me = new Grade(kor, eng, mat);
		System.out.println("평균 : " + me.avg());
		sc.close();
	}

}
