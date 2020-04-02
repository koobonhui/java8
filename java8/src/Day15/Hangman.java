package Day15;

import java.util.Scanner;

public class Hangman {
	
	private String hiddenString;      // ������ ���ڿ�
	private StringBuffer outputString;   // �÷��̾��� �Է¿� ���� ��� �����ֱ�
	private StringBuffer inputString;  // �÷��̾ �Է��� ���ڵ��� ����
	private int remainder;        // ���� ���ڿ�(�� ������ �����ִ� ������ ��)
	private int failed;           // ����Ƚ��
	private String inputData;
	private Scanner sc;
	
		public Hangman() {
			
			this("hello");
		}
	
		public Hangman(String sol) {
		
			hiddenString = sol; // ���� �ʱ�ȭ
			
			outputString = new StringBuffer();
			inputString = new StringBuffer();
			remainder = hiddenString.length();
			failed = 0;
			inputData = "";
			sc = new Scanner(System.in);
			
			for(int i = 0; i < remainder; i++)
			{
				outputString.append("_");
			}
		}
	
	public void playgame() {
		System.out.println("���ӽ���");
		show();
		do
		{
			do
			{
				setInputData();
			} while (checkChar(inputData));
			processGame();
			show();
		} while(failed < 6 && remainder > 0);
		System.out.println("��������");
	}
	
	private void show() {
		System.out.println(failed + " / 6 ����");
		System.out.println(outputString);
		System.out.println();
	}
	
	private void setInputData() {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		this.inputData = sc.next().substring(0, 1);   // ���� �տ� �� ���ڸ� ��
		
	}
	
	private boolean checkChar(String inputData) {
		if(inputString.indexOf(inputData) == -1)  // ���ڰ� �ִ��� ������ Ȯ��
		{
			inputString.append(inputData);
			return false;                      
		}
		System.out.println("�̹� �Է��� ����");
		return true;
	}
	
	private void processGame() {
		if(hiddenString.indexOf(inputData) == -1)              // �Է¹����� ���信 ���� �ܾ��� ���� +1
		{
			failed++;
		}
		else                                  // �ִٸ� �� ���ڸ� ã�Ƽ� ������ �ϴ°�
		{
			int index = hiddenString.indexOf(inputData);
			do {
				outputString.setCharAt(index, inputData.charAt(0));           // ������ ���� �ٲٱ�
				remainder--;                                               
				index = hiddenString.indexOf(inputData, index+1);
			} while(index != -1);
		}
	}

}
