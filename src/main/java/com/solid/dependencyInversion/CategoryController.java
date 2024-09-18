package com.solid.dependencyInversion;

public class CategoryController {
    private final CategoryService categoryService;
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public String getCategoryName(String name) {
        return categoryService.getCategoryName(name);
    }

    public Category createNewCategory(String name) {
        return categoryService.createNewCategory(name);
    }

}
