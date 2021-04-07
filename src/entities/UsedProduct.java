package entities;

import java.util.Date;

public class UsedProduct extends Product {
	protected Date manufactureDate;

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return name + " " + "$ " + String.format("%.2f", price) + "Manufacture date : " + manufactureDate;

	}
}
