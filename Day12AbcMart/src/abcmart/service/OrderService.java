package abcmart.service;

import abcmart.dao.ProductDao;
import abcmart.dto.Product;

public class OrderService {
		public double placeOrder(int productId, int quantity) {
			ProductDao productDao = new ProductDao();
			Product product = productDao.findProduct(productId);
			
			//logic product price * quantity + 5% gst
			double productPrice = product.getProductPrice();
			double total = productPrice*quantity;
			double orderAmount = total + (total*0.05);
			
			return orderAmount;
		}
}
