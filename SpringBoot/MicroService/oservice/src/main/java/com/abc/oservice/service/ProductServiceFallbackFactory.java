package com.abc.oservice.service;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import com.abc.oservice.model.Product;

@Component
public class ProductServiceFallbackFactory implements FallbackFactory<ProductServiceConsumer> {

	@Override
	public ProductServiceConsumer create(Throwable cause) {
		return new ProductServiceConsumer() {

			@Override
			public Product getProductById(int productId) {	
				
				return new Product();
			}

			@Override
			public String getProductData() {				
				return null;
			}
		};
	}

}