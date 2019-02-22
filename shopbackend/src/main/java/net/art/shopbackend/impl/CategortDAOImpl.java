package net.art.shopbackend.impl;

import java.util.ArrayList;
import java.util.List;

import net.art.shopbackend.dao.CategoryDAO;
import net.art.shopbackend.dto.Category;

public class CategortDAOImpl implements CategoryDAO{

		public static List<Category> categories = new ArrayList<>();
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		Category category = new Category();
			category.setId(1);
			category.setName("television");
			category.setDescription("52 inch Smart TV");
			category.setImageUrl("dummyURL");
			category.setActive(true);
			
			categories.add(category);
			
			Category category1 = new Category();
			
			category1.setId(2);
			category1.setName("Mobile Phone");
			category1.setDescription("Smartphone with all advanced features");
			category1.setImageUrl("dummyURL");
			category1.setActive(true);
			categories.add(category1);		
			
		return categories;
	}

}
