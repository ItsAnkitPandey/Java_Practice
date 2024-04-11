
package com.abc.springcore2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.springcore2.bean.Product;
import com.abc.springcore2.config.MyAppConfig;
import com.abc.springcore2.controller.ProductController;

public class ProductMain {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setpId(10);
		product1.setPname("SamsungM30");
		product1.setPrice(32000);

		Product product2 = new Product();
		product2.setpId(20);
		product2.setPname("IPhoneX30");
		product2.setPrice(82000);

		Product product3 = new Product();
		product3.setpId(30);
		product3.setPname("MIX30");
		product3.setPrice(22000);

//		ProductDao pDao = new ProductDao();
//		
//		ProductService pService = new ProductService();
//		pService.setProductDao(pDao); // dao obj injected inside service
//		
//		ProductController pController = new ProductController();
//		pController.setProductService(pService); // service obj injected inside controller

//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
//		ProductController pController = (ProductController) context.getBean("pController");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);

		ProductController pController = context.getBean(ProductController.class);

		pController.addProduct(product1);
		pController.addProduct(product2);
		pController.addProduct(product3);

		pController.fetchAllProducts();

		context.close();
	}

}
