package JavaPrograms2021;

public class LargestAndSmallestValues {

	public static void main(String[] args) {

		int[] arr = { 1, 20, 100, 30, 40 };

		int smallest = Integer.MAX_VALUE;
		System.out.println(smallest);
		int largest = Integer.MIN_VALUE;
		System.out.println(largest);

		for (int num : arr) {

			if (num > largest) {//1>-2147483648-true,20>-2147483648-true,100>-2147483648-true
				largest = num;//largest =1,largest =20,largest =100,
			}

		}
		System.out.println("Largest number in an array is :" + largest);

		for (int num : arr) {

			if (num < smallest) {
				smallest = num;
			}

		}
		System.out.println("Largest number in an array is :" + smallest);

	}

}
