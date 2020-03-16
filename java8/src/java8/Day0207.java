package java8;

import java.util.Random;

public class Day0207 {

	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println(rd.nextInt());
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextLong());
		System.out.println(rd.nextGaussian());
		System.out.println(rd.nextInt(10));
		
		System.out.println(Math.random());
	
	}

}
