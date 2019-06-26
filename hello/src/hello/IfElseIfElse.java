package hello;

import java.util.Scanner;

public class IfElseIfElse
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x=0;
		int y=0;
		int z=0;
		System.out.println("请输入三个数:");
		x = in.nextInt();
		y = in.nextInt();
		z =	in.nextInt();
		
		int max = 0;
		
		//在if或者else后面总是用{}即使只有一条语句的时候也跟着，可以有效避免计算机和程序对你的代码造成误解
		if(x>y)
		{
			if(x>z)
			{
				max=x;
			}
			else //else 总是和最近的if匹配 
			{
				max=z;
			}
		}
		else
		{
			if(y>z)
			{
				max = y;
			}
			else
			{
				max = z;
			}
		}
			
		System.out.println(max); //单一出口

	}

}
