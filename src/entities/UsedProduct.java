package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UsedProduct extends Product {

	private Date manufactureDate;

	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		return name + " (used) $ " + String.format("%.2f", price) + " (Manufacture date: " + sdf.format(manufactureDate)
				+ ")";
	}

}
