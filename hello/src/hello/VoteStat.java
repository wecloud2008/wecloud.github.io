package hello;

import java.util.Scanner;

public class VoteStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		int[] numbers = new int[10];// java 默认会给数组每一个元素分配一个0值
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		x=in.nextInt();
		while(x!=-1)
		{
			if(x>=0 && x<=9)
			{
				numbers[x]++;
			}
			x = in.nextInt();
		}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(i+":"+numbers[i]);
		}

	}

}
