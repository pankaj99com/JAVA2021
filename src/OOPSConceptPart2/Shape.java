package OOPSConceptPart2;

public abstract class Shape {
	String color;
static  int size=20;
	abstract void drawing();

	public void fill(){
		System.out.println("fill method");
	}
}
//we cannot create object of abstract and interface