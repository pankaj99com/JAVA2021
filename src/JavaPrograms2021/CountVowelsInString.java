package JavaPrograms2021;
public class CountVowelsInString {

	public static void main(String[] args) {
		String str = "Pankaj";

		char[] ch = str.toCharArray();

		int count = 0;
		for (char c : ch) {

			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':

				count++;
				break;
			}
		}
		System.out.println("Number of vowels in an array is: " + count);

	}

}
