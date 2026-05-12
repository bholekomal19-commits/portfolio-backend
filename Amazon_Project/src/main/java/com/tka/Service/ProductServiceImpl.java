package com.tka.Service;

import com.tka.Entity.Product;
import com.tka.Dao.ProductDao;
import com.tka.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao Dao;

    @Override
    public List<Product> getAllProducts() {
        return Dao.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return Dao.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return Dao.findById(id).orElse(null);
    }

    public void deleteProduct(int id) {
    	Dao.deleteById(id);
    }

	@Override
	public void save(Product p) {
		Dao.save(p);
	}
   
	@Override
    public List<Product> searchProducts(String keyword) {

        if(keyword == null || keyword.trim().isEmpty()) {
            return Dao.findAll();
        }

        return Dao.searchProducts(keyword);
    }

    
    
}