package net.art.shopbackend.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.art.shopbackend.dao.CategoryDAO;
import net.art.shopbackend.dto.Category;

@Repository("CategoryDAO")
public class CategortDAOImpl implements CategoryDAO{

	public List<Category> categories = null;
	@Override
	public List<Category> listCategories() {
		// TODO Auto-generated method stub
			categories = new ArrayList<>();
			
			Category category = new Category();
			category.setId(0);
			category.setName("Television");
			category.setDescription("Various varieties of televisions");
			category.setImageUrl("dummyURL");
			category.setActive(true);
			
			categories.add(category);
			
			Category category1 = new Category();
			category1.setId(1);
			category1.setName("Mobile Phone");
			category1.setDescription("Smartphone with all advanced features");
			category1.setImageUrl("dummyURL");
			category1.setActive(true);
			categories.add(category1);
			
			Category category2 = new Category();
			category2.setId(2);
			category2.setName("Laptop");
			category2.setDescription("HIgh configuration laptop with 8GB RAM and 500GB HDD");
			category2.setImageUrl("dummyURL");
			category2.setActive(true);
			categories.add(category2);
			
			//System.out.println("Category List Size:"+categories.size());
			
		return categories;
	}
	@Override
	public Category get(int id) {
		return categories.get(id);
	}

}
