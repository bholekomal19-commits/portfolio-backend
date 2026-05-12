package com.tka.Service;

import com.tka.Dao.CartDao;
import com.tka.Dao.ProductDao;
import com.tka.Entity.Product;

import java.sql.Date;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product saveProduct(Product product);

    Product getProductById(int id);
    
    public void deleteProduct(int id);

	void save(Product p);
	
	List<Product>searchProducts(String keyword); 
}