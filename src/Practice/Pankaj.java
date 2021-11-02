package Practice;

class Pankaj {

	private int id;
	
//	public int getID() {
//		return id;
//	}
//	
//	public void setID(int id) {
//		this.id=id;
//	}
	private String name;
	private void dance() {
		System.out.println("dance");
	}
	public static void main(String[] args) {
		Pankaj tanvi=new Pankaj();
		tanvi.dance();
		//tanvi.setID(50);
		//System.out.println(tanvi.getID());
		tanvi.id=50;
		System.out.println(tanvi.id);
tanvi.name="TANVI";
System.out.println(tanvi.name);

	}

}
