package hello;

import java.util.Scanner;

public class CalcAverage {

	public static void main(String[] args) {
//		变量 算法 流程图 程序
		Scanner in = new Scanner(System.in);
		int number;
		int sum=0;
		int count=0;
		do
		{
			number = in.nextInt();
			if(number!=-1)
			{
				sum = sum+number;
				count = count+1;
			
			}
		}while(number!=-1);
		if(count>0)
		{
			System.out.println("平均数:"+(double)sum/count);
		}
	}

}
