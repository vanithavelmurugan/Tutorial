package practice1;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num>0){
		    int rem=num%10;
		    System.out.print(rem);
		    num=num/10;
		}
	}

}
