package hello;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		
		//只要条件是满足的 就做括号后面的内容
		do
		{
			number = number/10;
			count = count+1;
			System.out.println("number:"+number+",count="+count);
		}while(number>0);
		System.out.println(count);
		
		//while 先判断条件在进入循环体
		//do while 先进循环体
		//for

	}

}
