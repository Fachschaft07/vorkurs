class Aufg2a{
	public static void main(String[] args){
		System.out.println(true && false);				
		System.out.println(true && true);				
		System.out.println(false && false);				
		System.out.println(true || false);				
		System.out.println(true || true);				
		System.out.println(false || false);				
		
		System.out.println(true && false || true);		
		System.out.println(true || true && false);		
		System.out.println((true || true) && false);	
		System.out.println(true ^ false);				
		System.out.println(true ^ true);				
		System.out.println(false ^ false);			
	}
}