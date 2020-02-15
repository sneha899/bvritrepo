package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.bean.Product;
import com.cg.exception.ProductException;

public class ProductDaoMapImpl implements ProductDao{
	
	private Map<Integer,Product> map;
	public ProductDaoMapImpl() 
	{
		map=new HashMap<Integer,Product>();
	}
	public int addProduct(Product product) throws ProductException {
       boolean flag=map.containsKey(product.getProductId());
       if(flag) {
		     throw new ProductException("Id already exists");
       }
       map.put(product.getProductId(),product);
		
		return product.getProductId();
	}
	public Product findProductById(int productId) throws ProductException {
    
		boolean flag=map.containsKey(productId);
		Product product=null;
		if(flag) {
			product=map.get(productId);
		}
		else
		{
			throw new ProductException(productId+"Id is not found");
		}
         return product;
	}
	public Product deleteProductById(int productId) throws ProductException {
 
		Product product=null;
		boolean flag=map.containsKey(productId);
		if(!flag)

			if(!map.containsKey(productId)) {
	         throw new ProductException("Id does not exit");
			}
			product=map.remove(productId);
					return product;
				}
	public List<Product> findAllEmployee() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
