package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		// sc.nextLine();
		for (int i = 1; i <= n; i++) {

			sc.nextLine();
			System.out.printf("Product #%d data:\n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (type == 'i' || type == 'I') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product prod = new ImportedProduct(name, price, customsFee);
				list.add(prod);
			}
			/*
			 * if (type == 'u' || type == 'U') {
			 * System.out.print("Manufacture date (DD/MM/YYYY): "); try { String day =
			 * sc.nextLine(); Date manufactureDate = sdf.parse(day); Product prod = new
			 * UsedProduct(name, price, manufactureDate); list.add(prod); } catch
			 * (ParseException e) { e.printStackTrace();
			 * 
			 * }
			 */

			else {
				Product prod = new Product(name, price);
				list.add(prod);
			}
		}
		System.out.println("\nPRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
