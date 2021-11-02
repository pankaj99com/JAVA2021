package JavaPrograms2021;

import java.util.Arrays;

public class ReplaceCharacterWithItsOccurrence {
	public static void main(String[] args) {
		String str="obvious";
		char chartoReplace='o';
		//expected ouput 1bvi2us
		//check the presence in String
		if(str.indexOf(chartoReplace)==-1) {
			System.out.println("Given character is not present in the string");	
		}else {	
		char[] arr=	str.toCharArray();
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==chartoReplace) {
				//arr[i]=(char) count;
				arr[i]=String.valueOf(count).charAt(0);
				count++;
				}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(new String(arr));
		}
		
		
	}

}
