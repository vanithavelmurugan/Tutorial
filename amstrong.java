package practice1;
import java.util.Scanner;
public class amstrong {
	public static void main(String[] args) {
		int count=0,num,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int rem;
		int original=num;
	   while(num!=0) {
		num/=10;
		++count;
	   }
	   System.out.println(count);
	   num=original;
	while(num>0) {
		rem=num%10;
		sum=sum+(int) Math.pow(rem, count);
		num/=10;
	}
	if(sum==original)
		System.out.println("Amstrong");
	else
		System.out.println("not Amstrong");
	
	}
}
