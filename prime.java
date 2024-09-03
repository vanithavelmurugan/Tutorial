package practice1;

public class prime {
	public static void main(String[] args) {
	    int n=19,flag=0,i;
	    for(i=2;i<=n/2;i++){
	        if(n%i==0)
	        flag=1;
	    }
	    if(flag==0)
	    System.out.println("PRIME");
	    else
	    System.out.println("NOT A PRIME");
}
}
