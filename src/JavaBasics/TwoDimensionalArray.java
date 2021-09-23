package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		// 1.2 dimensional array concept

		String str[][] = new String[5][5];
		System.out.println(str.length);// total number of rows
		System.out.println(str[2].length);// total number of columns

		str[0][0] = "pankaj";
		str[0][1] = "100";
		str[0][2] = "Mangaer";
		str[0][3] = "80.89";
		str[0][4] = "$";

		str[1][0] = "sandy";
		str[1][1] = "90";
		str[1][2] = "tester";
		str[1][3] = "77.09";
		str[1][4] = "@";

		str[2][0] = "sandy";
		str[2][1] = "90";
		str[2][2] = "tester";
		str[2][3] = "77.09";
		str[2][4] = "@";

		str[3][0] = "sandy";
		str[3][1] = "90";
		str[3][2] = "tester";
		str[3][3] = "77.09";
		str[3][4] = "@";

		str[4][0] = "sandy";
		str[4][1] = "90";
		str[4][2] = "tester";
		str[4][3] = "77.09";
		str[4][4] = "@";

		System.out.println(str[0][4]);

		// Print allvalues of 2 d array

		for (int row = 0; row < str.length; row++) {

			// outer for loop is dependent on innner for loop

			for (int col = 0; col < str[0].length; col++) {

				System.out.println(str[row][col]);
			}
		}
	}

}
