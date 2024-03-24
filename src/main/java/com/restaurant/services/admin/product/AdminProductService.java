package com.restaurant.services.admin.product;

import java.io.IOException;
import java.util.List;

import com.restaurant.dto.ProductDto;

public interface AdminProductService {

	ProductDto addProduct(ProductDto productDto) throws IOException;
	List<ProductDto> getAllProducts();
	List<ProductDto> getAllProductByName(String name);
	boolean deleteProduct(Long id);
	ProductDto getProductById(Long productId);
	ProductDto updateProduct(Long productId, ProductDto productDto) throws IOException;
}
