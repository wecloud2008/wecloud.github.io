package hello;

import java.util.Scanner;

public class AutoTickets {

	public static void main(String[] args) {
		
//		System.out.println(5==5.0);
//		
//		double a =1.0;
//		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
//		System.out.println(a==b);
//		System.out.println("a="+a+",b="+b);
//		System.out.println(Math.abs(a-b)<1e-6);
//		System.out.println(amount>=10); //>=关系运算符 
		
		//初始化
		Scanner in = new Scanner(System.in);
		int balance = 0;
		//读入投币金额
		while(true)
		{
			System.out.print("请投币:");
			int amount = in.nextInt();
			balance = balance+amount;
			if(balance>=10)
			{		
				//打印车票
				System.out.println("**********************");
				System.out.println("Java城际铁路专线");
				System.out.println("无指定座位票");
				System.out.println("票价：10元");
				System.out.println("**********************");
				//计算并打印找零
				System.out.println("找零:"+(balance-10));
				balance = 0;
			}
		}
		
	}

}
