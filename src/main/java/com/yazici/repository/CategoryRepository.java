package com.yazici.repository;

import org.springframework.data.repository.CrudRepository;

import com.yazici.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Category findByName(String name);
}
