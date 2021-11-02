package OOPSConceptPart2;

public class Test extends Shape{

	public static void main(String[] args) {
		//Shape s=new Shape(); cannot create object of shape
		Shape s=new Test();
		s.drawing();
		s.fill();
		s.color="red";
		System.out.println(s.color);
		Shape.size=70;
System.out.println(Shape.size);

	}

	@Override
	void drawing() {
		System.out.println("test drawing");
	}

}
