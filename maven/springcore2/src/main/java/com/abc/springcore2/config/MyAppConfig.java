package com.abc.springcore2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.abc.springcore2")
public class MyAppConfig {

//	@Bean
//	public ProductDao getProductDaoBean() {
//		ProductDao pDao = new ProductDao();
//		return pDao;
//	}
//	
//	@Bean
//	public ProductService getProductServiceBean() {
//		ProductService pService = new ProductService();
//		//pService.setProductDao(getProductDaoBean()); //DI, this line is not required bcoz of @Autowired
//		return pService;
//	}
//	
//	@Bean
//	public ProductController getProductControllerBean() {
//		ProductController pController= new ProductController();
//		//pController.setProductService(getProductServiceBean()); //DI, this line is not required bcoz of @Autowired
//		return pController;
//	}
}