package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		//1.array-to store similar data type values in a array variable.
		// lower bound/index=0
		//upper bound/index is n-1(where n is size of array)
		//Disadvantanges of array
		//1.SIZE IS FIXED and hence call it as static array-to overcome we use collection concept
		//2.Stores only similar datatypes-To overcome this problem we use Object array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//int j[]= {4,6,56,55,6};//also valid
		
		System.out.println(i[3]);//40

		//System.out.println(i[5]);//ArrayindexoutofBoundsexception

		System.out.println(i.length);//size of array

		//printing all the values of array

		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}

		//2.double array

		double d[]=new double[3];
		d[0]=12.45;
		d[1]=23.78;
		d[2]=30.33;

		System.out.println(d[2]);

		for(int k=0;k<d.length;k++){
			System.out.println(d[k]);
		}

		//3.char array

		char c[]=new char[3];
		c[0]='a';
		c[1]='3';
		c[2]='%';

		System.out.println(c[2]);

		for(int l=0;l<c.length;l++){
			System.out.println(c[l]);
		}


		//4.boolean array

		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;

		System.out.println(b[1]);

		for(int m=0;m<b.length;m++){
			System.out.println(b[m]);
		}


		//5.String array

		String str[]=new String[3];

		str[0]="Pankaj";
		str[1]="Manager";
		str[2]="INDIAN";
		System.out.println(str[1]);

		for(int n=0;n<str.length;n++){

			System.out.println(str[n]);
		}

		//6.Object array- is used to store different datatypes values in an array

		Object arr[]=new Object[4];

		arr[0]='a';
		arr[1]=12;
		arr[2]="pankaj";
		arr[3]=12.98;

		System.out.println(arr[2]);

		for(int o=0;o<arr.length;o++){

			System.out.println(arr[o]);
		}
	}

}
