package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2739 -> Main 으로 변경
public class baekjoon2739 {
	public static void main(String[] args){
		
		int a;
		Scanner sc = new Scanner(System.in);	
		a=sc.nextInt();
		
		for(int i=1;i<10;i++)
		{
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}

}
