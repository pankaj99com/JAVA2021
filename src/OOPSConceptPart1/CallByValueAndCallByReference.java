package OOPSConceptPart1;

public class CallByValueAndCallByReference {
int p;
int q;
	public static void main(String[] args) {
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();

		int x=10;
		int y=50;
		int z=obj.testsum(x, y);//call by value or pass by value
		//we are sending photocopy only and this will not affect the oroginal value of x and y
		System.out.println(z);
		
		obj.p=80;
		obj.q=90;
		
		obj.swap(obj);//call by reference
		
		System.out.println("After swapping value of p is:"+obj.p);
		System.out.println("After swapping value of q is:"+obj.q);
	}
	public int testsum(int a,int b){
		a=20;
		b=30;
		int c=a=b;
		return c;
	}
	
	public void swap(CallByValueAndCallByReference t){//t and obj are referring to objects p and q
		int temp;
		temp=t.p;//80
		t.p=t.q;//90
		t.q=temp;//80
		
	}
}
