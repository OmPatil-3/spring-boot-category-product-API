package com.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Model.Category;

public interface CategoryRepositery extends JpaRepository<Category, Long> {}
