package Encapsulation;

public class EncapsulationwithGettersAndSetters {

	public static void main(String[] args) {

		Mobile m = new Mobile();
		m.model = "Samsung S9+";
		System.out.println("Phone Model is :" + m.model);
		// m.price=20000;//in order to access the price we need setters and
		// getters method
		m.setPrice(23930);
	}

}

class Mobile {
	public int getPrice() {
		System.out.println(" Price is :" + price);
		return price;
	}

	public void setPrice(int price) {
		boolean isAdmin = true;
		if (!isAdmin) {
			System.out.println("OOps!! you are not admin ");

		} else {
			System.out.println("Congratulations!! you are admin now");
			System.out.println(" Price has been set to: " + price);
			this.price = price;
		}
	}

	private int price;
	String model;

}