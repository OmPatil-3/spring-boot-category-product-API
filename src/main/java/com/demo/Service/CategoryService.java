package com.demo.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.demo.Model.Category;

public interface CategoryService {
	Page<Category> getAllCategories(Pageable pageable);

	void delete(Long id);

	Category getById(Long id);

	Category save(Category category);

	Category update(Long id, Category category);

	Page<Category> getAllCategories(int page);

	Page<Category> getAllCategories1(int page);

}