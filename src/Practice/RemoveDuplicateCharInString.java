package Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {

		String str="Programming";

		//1.Approach 1

		StringBuilder sb=new StringBuilder();

		for(int i=0;i<str.length();i++){

			char ch=str.charAt(i);//p

			int index=str.indexOf(ch,i+1);//p,1
			//System.out.println(index);
			if(index==-1){

				sb.append(ch);

			}
		}
		System.out.println(sb);


		//2.Approach 2

		char[] arr=str.toCharArray();
		
		StringBuilder sb1=new StringBuilder();
		
		for(int i=0;i<arr.length;i++){
			
			boolean repeated=false;
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					
					repeated=true;
					
					break;
				}

			}
			if(!repeated){
				
				sb1.append(arr[i]);
			}

		}
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer();
		Set<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			
			set.add(str.charAt(i));
		}
		
		for(Character ch:set) {
			sb2.append(ch);
			
		}
		
		System.out.println(sb2);

	}

}
