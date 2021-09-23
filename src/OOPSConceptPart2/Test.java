package OOPSConceptPart2;

public class Test extends Shape{

	public static void main(String[] args) {
		//Shape s=new Shape(); cannot create object of shape
		Shape s=new Test();
		s.drawing();
		s.fill();

	}

	@Override
	void drawing() {
		System.out.println("test drawing");
	}

}
