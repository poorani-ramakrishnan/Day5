package Servie;

import java.util.ArrayList;
import java.util.List;

import Entity.Product;
import Exception.ProductNotFoundException;

public class ProductServiceImpl implements ProductService {
	
	List<Product> allProduct=new ArrayList<>(List.of(new Product(101,"towel","cloth",5678,40)));
	
	@Override
	public List<Product> getAllProducts() {
	    return allProduct;
	}
	
	@Override
	public void searchproduct(int proId) throws ProductNotFoundException {
	    for (Product pr:allProduct) {
	        if (pr.getProId()==proId) {
	            System.out.println(pr);
	            return;
	        }
	    }
	    
	    throw new ProductNotFoundException("Product not found");
	}

	@Override
	public void addNewProduct(Product newPro) {
		// TODO Auto-generated method stub
		
		allProduct.add(newPro);		
	}

	@Override
	public void updateStock(int proId, int quantity) {
	    for (Product pr:allProduct) {
	        if (pr.getProId()==proId) {
	            pr.setStcokCount(pr.getStcokCount()+quantity);
	        }
	    }
	    System.out.println("Product not found");
	}

	@Override
	public void deleteProduct(int proId) throws ProductNotFoundException{
	    for (Product pr:allProduct) {
	        if (pr.getProId()==proId) {
	            allProduct.remove(pr);
	        }
	    }
	    throw new ProductNotFoundException("Product not found");

	   
	}
}
