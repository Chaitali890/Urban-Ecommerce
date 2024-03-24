package com.restaurant.services.admin.category;

import java.util.List;

import com.restaurant.dto.CategoryDto;
import com.restaurant.entity.Category;

public interface CategoryService {

	Category createCategory(CategoryDto categoryDto);
	
	List<Category> getAllCategories();
}
