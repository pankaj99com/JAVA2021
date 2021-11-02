package JavaPrograms2021;

public class CountWordsInString {

	public static void main(String[] args) {
		String s="Pankaj kumar learning java";//4 words
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			
			if((s.charAt(i)==' '&& s.charAt(i+1)!=' ')) {
				count++;
				
			}
			
		}
		System.out.println("Number of Words in a String is: "+count);
	}

}
