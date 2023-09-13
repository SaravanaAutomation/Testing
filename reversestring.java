package Demoprgm;

public class reversestring {
	
public static void main(String[] args) {

	StringBuilder str1= new StringBuilder("Saravanan");
	StringBuilder rev= str1.reverse();
	System.out.println(rev);
	
	// another method via String
	
	String S= "Saravana";
	int len= S.length();
	System.out.println(len);
	int a= len-1;
	System.out.println(a);
	for(int i=a; i>=0; --i)
	{
		String rev1= " ";
		System.out.print(rev1+""+S.charAt(i));
	}
		
		
	}

}
