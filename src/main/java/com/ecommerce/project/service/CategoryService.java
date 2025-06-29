package com.ecommerce.project.service;
import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

//This is an interface not a class because we will go with loose coupling and modularity in my code base
//Having seperate interface for service and a seperate implementation of that service is benifical in the long run


public interface CategoryService {
    CategoryResponse getAllCategories();
    void createCategory(Category category);

    String deleteCategory(Long categoryId);
    Category updateCategory(Category category, Long categoryId);
}
