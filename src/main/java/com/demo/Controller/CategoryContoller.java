package com.demo.Controller;

import com.demo.Model.Category;
import com.demo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryContoller {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public Page<Category> getAll(@RequestParam(defaultValue = "0") int page) {
		return categoryService.getAllCategories(page);
	}

	@PostMapping(value = "/save")
	public Category save(@RequestBody Category category) {
		return categoryService.save(category);
	}

	@GetMapping("/{id}")
	public Category getById(@PathVariable Long id) {
		return categoryService.getById(id);
	}

	@PutMapping("/{id}")
	public Category update(@PathVariable Long id, @RequestBody Category category) {
		return categoryService.update(id, category);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		categoryService.delete(id);
	}
}