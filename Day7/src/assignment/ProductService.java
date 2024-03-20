package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
	
	//fetch and map product names
	
	public List<String> mapToProductNames(List<Product> products){
		List<String> productNames = new ArrayList<>();
		Iterator<Product> i = products.iterator();
		while(i.hasNext()) {
			Product p = i.next();
			String pname = p.getName();
			productNames.add(pname);
		}
		return productNames;
		
	}
	
	// filter the product names based on their category name
	
	public List<Product> filterProducts(List<Product> products, String categoryname){
		List<Product> myList = new ArrayList<>();
		Iterator<Product> i = products.iterator();
		while(i.hasNext()) {
			Product p = i.next();
			if(p.getCategory().equalsIgnoreCase(categoryname)) {
				myList.add(p);
			}
		}
		return myList;
	}

}
