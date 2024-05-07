package com.abc.oservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abc.oservice.model.Product;


@FeignClient(name = "PSERVICE",fallbackFactory = ProductServiceFallbackFactory.class)
//@FeignClient(name = "book", contextId = "bookClient", fallbackFactory = BookClientFallbackFactory.class)
public interface ProductServiceConsumer {

	@GetMapping("/product/{id}")
	Product getProductById(@PathVariable("id") int productId);

	@GetMapping("/product/data")
	String getProductData();
}