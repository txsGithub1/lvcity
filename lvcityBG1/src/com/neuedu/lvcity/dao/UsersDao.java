package com.neuedu.lvcity.dao;
import java.sql.Connection;

import com.neuedu.lvcity.dao.impl.UsersDaoImpl;
import com.neuedu.lvcity.model.Users;

public interface UsersDao {

	public Users login(String username, String passwrod);
 
}
