import java.time.LocalDate;

public class ProductMain {

	public static void main(String[] args) {
		Product p1= new Product();
		p1.setProductId(101);
		p1.setName("IPhone x");
		p1.setPrice(55000);
		p1.setMfd(LocalDate.of(2010, 02, 11));
		p1.setCategory("MObile");
		
		System.out.println("Product Details:");
		System.out.println("ID: "+ p1.getProductId());
		System.out.println("Name: "+p1.getName());
		System.out.println("Price: "+ p1.getPrice());
		System.out.println("Mfd: "+p1.getMfd());
		System.out.println("category: "+ p1.getCategory());
		

	}

}
