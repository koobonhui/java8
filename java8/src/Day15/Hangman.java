package Day15;

import java.util.Scanner;

public class Hangman {
	
	private String hiddenString;      // 숨겨진 문자열
	private StringBuffer outputString;   // 플레이어의 입력에 따른 결과 보여주기
	private StringBuffer inputString;  // 플레이어가 입력한 문자들의 모임
	private int remainder;        // 맞힐 문자열(못 맞히고 남아있는 문자의 수)
	private int failed;           // 실패횟수
	private String inputData;
	private Scanner sc;
	
		public Hangman() {
			
			this("hello");
		}
	
		public Hangman(String sol) {
		
			hiddenString = sol; // 정답 초기화
			
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
		System.out.println("게임시작");
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
		System.out.println("게임종료");
	}
	
	private void show() {
		System.out.println(failed + " / 6 남음");
		System.out.println(outputString);
		System.out.println();
	}
	
	private void setInputData() {
		System.out.print("문자를 입력하세요 : ");
		this.inputData = sc.next().substring(0, 1);   // 제일 앞에 한 글자만 들어감
		
	}
	
	private boolean checkChar(String inputData) {
		if(inputString.indexOf(inputData) == -1)  // 문자가 있는지 없는지 확인
		{
			inputString.append(inputData);
			return false;                      
		}
		System.out.println("이미 입력한 문자");
		return true;
	}
	
	private void processGame() {
		if(hiddenString.indexOf(inputData) == -1)              // 입력받은게 정답에 없는 단어라면 실패 +1
		{
			failed++;
		}
		else                                  // 있다면 그 문자를 찾아서 변경을 하는것
		{
			int index = hiddenString.indexOf(inputData);
			do {
				outputString.setCharAt(index, inputData.charAt(0));           // 맞으면 문자 바꾸기
				remainder--;                                               
				index = hiddenString.indexOf(inputData, index+1);
			} while(index != -1);
		}
	}

}
