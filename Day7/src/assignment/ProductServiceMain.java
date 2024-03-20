package assignment;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceMain {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setName("iphone");
		p1.setPrice(55000);
		p1.setCategory("Mobile");
		
		Product p2 = new Product();
		p2.setProductId(2);
		p2.setName("Camera");
		p2.setPrice(5500);
		p2.setCategory("camera");
		
		Product p3 = new Product();
		p3.setProductId(3);
		p3.setName("SonyXP");
		p3.setPrice(59000);
		p3.setCategory("Mobile");
		
		Product p4 = new Product();
		p4.setProductId(2);
		p4.setName("SanDisk");
		p4.setCategory("pendrive");
		p4.setPrice(550);
		
		List<Product> productList = new ArrayList<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		
	ProductService productService = new ProductService();
	
	//fetch and map names
	
	List<String> names = productService.mapToProductNames(productList);
	System.out.println(names);
	
	//fileter product nammes according to category
		List<Product> filteredNames = productService.filterProducts(productList, "mobile");
		filteredNames.forEach(p-> System.out.println(p.getName()));
	
	}

}
