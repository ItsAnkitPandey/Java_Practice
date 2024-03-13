class Product{
	private int productId;
	private String productName;
	private double productPrice;

	Product(){
	  productId = 101;
	  productName =  "ddd"; 
	  productPrice = 45000;
}

Product(int pId, String pname, double pprice){
	  productId = pId;
	  productName =  pname;
	  productPrice = pprice;
}

void displayProductDetails(){
	System.out.println("Product id: " + productId );

System.out.println("Product name: " + productName );

System.out.println("Product price: " + productPrice );

}
}