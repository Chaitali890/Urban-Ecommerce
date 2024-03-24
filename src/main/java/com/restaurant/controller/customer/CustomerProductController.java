package com.restaurant.controller.customer;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.dto.ProductDetailsDto;
import com.restaurant.dto.ProductDto;
import com.restaurant.services.customer.CustomerProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerProductController {

	private final CustomerProductService customerProductService;
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> getAllProducts(){
		List<ProductDto>productDtos = customerProductService.getAllProducts();
			return ResponseEntity.ok(productDtos);
	}
		
		@GetMapping("/search/{name}")
	public ResponseEntity<List<ProductDto>> getAllProductByName(@PathVariable String name){
			List<ProductDto> productDtos = customerProductService.searchProductByTitle(name);
				return ResponseEntity.ok(productDtos);
		}
	
	public ResponseEntity<ProductDetailsDto> getProductDetailById(@PathVariable Long productId){
		ProductDetailsDto productDetailsDto = customerProductService.getProductDetailById(productId);
		if(productDetailsDto == null)
			return ResponseEntity.notFound().build();
			return ResponseEntity.ok(productDetailsDto);
	}
}
