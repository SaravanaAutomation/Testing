package Demoprgm;

public class fibonacci {
          
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p=0, q=1,i,r;
		
		System.out.print("fibonacci: " + p+" "+q);
		
		for(i=2;i<10;i++)
		{
			r=p+q;
			
			System.out.print(" " +r);
			p=q;
			q=r;
		}

	}

}
