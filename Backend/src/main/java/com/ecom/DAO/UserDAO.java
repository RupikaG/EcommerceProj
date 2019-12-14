package com.ecom.DAO;
import java.util.List;

import com.ecom.model.UserDetail;

public interface UserDAO {
	

	public boolean registerUser(UserDetail userDetail);
	public boolean deleteUser(UserDetail userDetail);
	public boolean updateUser(UserDetail userDetail);
	public UserDetail getUser(String username);
	

}