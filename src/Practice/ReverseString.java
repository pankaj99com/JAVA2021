package Practice;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str="Pankaj";
		
		//1.First Approach-convert String into char array
		
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
		
		
		
		//2.Approach 2
		for(int j=str.length()-1;j>=0;j--){
			System.out.print(str.charAt(j));
		}
		
		System.out.println();
		
		//3 Approach3
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
       //4.String Build class
		
		StringBuilder sBuilder=new StringBuilder(str);
		System.out.println(sBuilder.reverse());
	}

}
