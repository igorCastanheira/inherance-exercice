package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> product = new ArrayList<>();
		System.out.print("Enter the number of products : ");
		Double n = sc.nextDouble();

		for (int i = 1; i <= n; i++) {

			System.out.println("Product #" + n + "data: ");
			System.out.print("commom, used or imported (c/u/i) ? ");
			char type = sc.next().charAt(0);

			if (type == 'c') {
				System.out.print("name : ");
				String name = sc.next();
				System.out.print("Price : ");
				Double price = sc.nextDouble();
				product.add(new Product(name, price));

			} else if (type == 'u') {
				System.out.print("name : ");
				String name = sc.next();
				System.out.print("Price : ");
				Double price = sc.nextDouble();
				System.out.println("Manufacture date : (DD/MM/YYYY)");
				Date date = sdf.parse(sc.nextLine());
				product.add(new UsedProduct(name, price, date));
			} else if (type == i) {
				System.out.print("name : ");
				sc.next();
				String name = sc.next();
				System.out.print("Price : ");
				sc.next();
				Double price = sc.nextDouble();
				System.out.print("Customs fee");
				sc.next();
				Double customsFee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customsFee));

			}
			
		}System.out.println("PRICE TAGS :");
		for (Product c : product) {
			System.out.println(c.priceTag()); 
			
		}

		
		sc.close();
	}

}
