package programmers;

public class Exam02 {

	public static void main(String[] args) {
		Solution02 sol = new Solution02();
		
		String[] s = {"AB", "z", "a B z"}; 
		int[] n = {1, 1, 4};
		String[] re = new String[s.length];
		for(int i = 0; i < s.length; i++)
		{
			re[i] = sol.solution(s[i], n[i]);
		}
		
		for(int i = 0; i < s.length; i++)
		{
			System.out.println(s[i] + ":" + n[i] + " -> " + re[i]);
		}
	}
	
//	���� ����
//	� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. ���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
//
//	���� ����
//	������ �ƹ��� �о �����Դϴ�.
//	s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
//	s�� ���̴� 8000�����Դϴ�.
//	n�� 1 �̻�, 25������ �ڿ����Դϴ�.
//	����� ��
//	s	n	result
//	AB	1	BC
//	z	1	a
//	a B z	4	e F d

}
