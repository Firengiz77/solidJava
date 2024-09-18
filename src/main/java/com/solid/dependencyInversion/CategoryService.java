package com.solid.dependencyInversion;

public class CategoryService {

    public String getCategoryName(String categoryName) {
      return categoryName;
    }

  public Category createNewCategory(String categoryName) {
        Category category = new Category(1,categoryName);
        return category;
  }

}
