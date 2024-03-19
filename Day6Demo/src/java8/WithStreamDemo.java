package java8;

import java.util.ArrayList;

import bean.Product;

public class WithStreamDemo {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setName("iphone");
		p1.setPrice(55000);
		
		Product p2 = new Product();
		p2.setProductId(2);
		p2.setName("Camera");
		p2.setPrice(5500);
		
		Product p3 = new Product();
		p3.setProductId(3);
		p3.setName("SonyXP");
		p3.setPrice(59000);
		
		Product p4 = new Product();
		p4.setProductId(2);
		p4.setName("SanDisk");
		p4.setPrice(550);
		
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		System.out.println("ProductsList:");
		
		products.forEach(p-> System.out.println(p.getProductId()+ " "+ p.getName()+ " "+ p.getPrice()));
		
		
		//task filter products on mobile categary
		products.stream()
		.filter(p-> p.getName().equals("SanDisk"))
		.forEach(p-> System.out.println(p.getProductId()+ " "+ p.getName()+ " "+ p.getPrice()));
		

	}

}
