package Practice;

//Print all alphabets in the order and add underscore before that

class A24{
	
	
	public static void printAlphabets(String s){
		
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			
			for(char sc='a';sc<c;sc++){
				
				
				System.out.print("-");
				
			}
			System.out.println(c);
		}
		
	}
	
	
	
}

class StringTest{
	
	public static void main(String...abc){
		A24.printAlphabets("pankaj");
		
}

}