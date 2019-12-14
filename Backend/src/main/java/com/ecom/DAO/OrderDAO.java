package com.ecom.DAO;
import com.ecom.model.OrderDetail;
import java.util.List;
public interface OrderDAO
{
	public boolean saveOrder(OrderDetail orderDetail);
	public boolean updateCart(String username, int orderId);
}
