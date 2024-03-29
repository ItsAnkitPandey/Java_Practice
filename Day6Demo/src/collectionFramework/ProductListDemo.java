package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

import bean.Product;

public class ProductListDemo {

	

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
		
		Iterator<Product> i = products.iterator();
		
		while(i.hasNext()) {
			Product p = i.next();
			System.out.println("ID: "+ p.getProductId() + " NAME: "+ p.getName() + " Price: " + p.getPrice());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Name: ");
		String inputName = sc.next();
		boolean flag = false;
		
		Iterator<Product> i1 = products.iterator();
		while(i1.hasNext()) {
			Product p = i1.next();
			if(p.getName().equalsIgnoreCase(inputName)) {
				System.out.println(p.getProductId()+" "+p.getName()+" "+p.getPrice());
				flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("NO prouducts match");
		}
		
		
	}

}
