package Demoprgm;

public class fibonaccirecursion {
	static int p=0,q=1,r;
	 static void fibnaaic(int n)
	 {
	     if(n>0)
	     {
	         r=p+q;
	         p=q;
	         q=r;
	         System.out.print("  "+ r);
	         fibnaaic(n-1);
	     }
	 }
	
	public static void main(String[] args) {

		int n=10;
	    System.out.print(p + " " + q);
	    fibnaaic(n-2);
		
	}

}
