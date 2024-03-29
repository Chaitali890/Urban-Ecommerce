package com.restaurant.services.admin.category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.dto.CategoryDto;
import com.restaurant.entity.Category;
import com.restaurant.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

	private final CategoryRepository categoryRepository;
	
	public Category createCategory(CategoryDto categoryDto) {
		Category category = new Category();
		category.setName(categoryDto.getName());
		category.setDescription(categoryDto.getDescription());
		return categoryRepository.save(category);
	}
	
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
		
	}
	
}
