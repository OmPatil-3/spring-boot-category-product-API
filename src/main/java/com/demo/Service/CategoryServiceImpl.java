package com.demo.Service;

import com.demo.Dao.CategoryRepositery;
import com.demo.Model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepositery categoryRepository;

	public Page<Category> getAllCategories(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	public Category getById(Long id) {
		return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
	}

	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	public Category update(Long id, Category category) {
		Optional<Category> existing = categoryRepository.findById(id);
		if (existing.isPresent()) {
			Category c = existing.get();
			c.setName(category.getName());

			return categoryRepository.save(category);
		}
		return null;
	}

	public void delete(Long id) {
		if (!categoryRepository.existsById(id)) {
			throw new RuntimeException("category not found by id:" + id);
		}
		categoryRepository.deleteById(id);

	}

	@Override
	public Page<Category> getAllCategories(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Category> getAllCategories1(int page) {
		// TODO Auto-generated method stub
		return null;
	}
}
