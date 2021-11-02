package JavaPrograms2021;

public class StringBufferUse {

	public static void main(String[] args) {
		
		
		String str="INDIA";
		
		//str.reverse();
		StringBuffer sb=new StringBuffer(str);
		StringBuffer str1=sb.reverse();
		System.out.println(str1);
		
		
		
		char empty=' ';
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(arr[i]==arr[j]) {
					empty=str.charAt(i);
					sb.append(empty);
				}
			}
			System.out.println(sb);
		}
	   char[] ch=str.toCharArray();
	   
	   for(char a:ch) {
		  if(a=='x') {
			  System.out.println("found x");
		  }else {
			 
			  System.out.println(a);
		  }
		  
	   }
	   char a=str.charAt(0);
	   System.out.println(a);
	  // System.out.println(str.valueOf(a));

	}

}
