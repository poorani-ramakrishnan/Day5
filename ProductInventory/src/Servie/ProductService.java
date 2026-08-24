package Servie;

import java.util.List;

import Entity.Product;
import Exception.ProductNotFoundException;

public interface ProductService {
	
	List<Product> getAllProducts();
	
	void searchproduct(int proId) throws ProductNotFoundException;
	void addNewProduct(Product newPro);
	void updateStock(int proId,int quantity);
	void deleteProduct(int proId) throws ProductNotFoundException;
}
