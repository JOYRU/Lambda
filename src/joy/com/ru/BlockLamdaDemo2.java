package joy.com.ru;

public class BlockLamdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringfun ob;
		
		
		ob = (str) ->{
			
			String reverse = "" ; 
			
			for(int i= str.length() - 1 ;i>=0; i--)
			{
				reverse +=str.charAt(i) ; 
				
				
			}
				
			return reverse ; 
			
		} ; 
		
		System.out.println(ob.getValue("Rajshahi university")) ; 
		

	}

}
