package joy.com.ru;

public class LAmdaDemo {

	public static void main(String[] args) {
		Mynum mynum ; 
		
		mynum = (n) ->(n%2)==0 ; 
			
			
			
		
		
		
		System.out.println(mynum.getValue(10)) ;
		System.out.println(mynum.getValue(111)) ;
		
	}

}
