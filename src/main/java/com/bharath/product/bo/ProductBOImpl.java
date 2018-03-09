package com.bharath.product.bo;

import com.bharath.product.dao.ProductDAO;
import com.bharath.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	ProductDAO dao;
	
	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
