package practice1;

public class sumofdigits {
	public static void main(String[] args) {
		int n=567;
		int sum=0,digit;
		while(n>0) {
		digit=n%10;
		sum=sum+digit;
		n/=10;}
		System.out.println(sum);	
	}

}
