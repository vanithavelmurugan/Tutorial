package practice1;
import java.util.Scanner;
public class fibanocci {
	public static void main(String[] args) {
		int a=0,b=1;
		int n,c,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n-2;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
		}

}
