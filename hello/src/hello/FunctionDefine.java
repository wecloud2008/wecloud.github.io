package hello;

import java.util.Scanner;

public class FunctionDefine {

	public static int calc(int m,int n)
	{
		int sum = m+n;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calc(3,5));
		System.out.println(calc(8,10));
	}

}
