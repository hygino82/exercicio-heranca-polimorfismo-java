package entities;

import java.util.Locale;

public class ImportedProduct extends Product {

	private double customsFee;

	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	public double totalPrice() {
		return price + customsFee;
	}

	@Override
	public String priceTag() {
		Locale.setDefault(Locale.US);
		return name + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: "
				+ String.format("%.2f", customsFee) + ")";
	}
}
