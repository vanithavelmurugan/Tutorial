package practice1;
import java.util.*;
public class printeven {
	public static void main(String[] args) {
		int n,digit,even;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0) {
			digit=n%10;
			if(digit%2==0) {
				System.out.println(digit);
			}
			n/=10;
		}
	}

}
