package programmers;

public class Solution02 {

		public String solution(String s, int n)
		{
			char[] charr = s.toCharArray();
			String answer = "";
			
			for(int i = 0; i < charr.length; i ++)
			{
				if(charr[i] >= 'a' && charr[i] <= 'z')
				{
					charr[i] += n;
					if(charr[i] > 'z')
					{
						charr[i] -= 26;
					}
				}
				else if(charr[i] >= 'A' && charr[i] <= 'Z')
				{
					charr[i] += n;
					if(charr[i] > 'Z')
					{
						charr[i] -= 26;
					}
				}
				answer += charr[i];
			}
			return answer;
		}
}
