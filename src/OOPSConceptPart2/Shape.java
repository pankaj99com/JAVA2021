package OOPSConceptPart2;

public abstract class Shape {
	int color;

	abstract void drawing();

	public void fill(){
		System.out.println("fill method");
	}
}
//we cannot create object of abstract and interface