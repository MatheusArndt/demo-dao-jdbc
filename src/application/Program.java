package application;

import java.util.Date;
import java.util.Locale;

import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller= new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);
		
	}

}
