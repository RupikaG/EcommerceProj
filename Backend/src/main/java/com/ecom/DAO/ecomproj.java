package com.ecom.DAO;

import java.util.List;

import com.ecom.model.Cart;

public interface CartDAO 
{
	public boolean addCart(Cart cart);
	public boolean deleteCart(Cart cart);
	public boolean updateCart(Cart cart);
	public Cart getCart(int cardId);
	public List <Cart> listCart(String username);
	
}
