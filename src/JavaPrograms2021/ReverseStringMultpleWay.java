package JavaPrograms2021;

public class ReverseStringMultpleWay {

	public static void main(String[] args) {
		String str="Pankaj kumar";
		
		//1 Approach 1 :By converting String to Char array
		System.out.println("Approach 1 :By converting String to Char array");
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			
			System.out.print(ch[i]);
			
		}
		
		
		System.out.println();
		System.out.println("Approach2 :By using charAt() method");
		//2 Approach2 :By using charAt() method
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		System.out.println("Approach3 :By using String builder class");
		//2 Approach2 :By using String builder class
		StringBuilder sb=new StringBuilder(str);
		StringBuilder str1=sb.reverse();
		System.out.println(str1);
		
		
		
		System.out.println();
		System.out.println("Approach4 :By using String buffer class");
		StringBuffer sbuff= new StringBuffer(str);
		StringBuffer str2=sbuff.reverse();
		System.out.println(str2);
	}

}
