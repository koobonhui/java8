package java8;

public class Day0505 {

	public static void main(String[] args) {
		System.out.println("주사위");
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println("던짐");
		
		if(dice == 1)
		{
			System.out.println("1");
		}
		else if(dice == 2)
		{
			System.out.println("2");
		}
		else if(dice == 3)
		{
			System.out.println("3");
		}
		else if(dice == 4)
		{
			System.out.println("4");
		}
		else if(dice == 5)
		{
			System.out.println("5");
		}
		else
		{
			System.out.println("6");
		}

	}

}
