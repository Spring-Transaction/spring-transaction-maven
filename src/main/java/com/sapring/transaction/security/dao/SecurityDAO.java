package com.sapring.transaction.security.dao;

import java.util.List;

import com.sapring.transaction.security.bo.UserBO;

public interface SecurityDAO {
	long	saveUser(UserBO userBO);
	UserBO	getUserById(long userId);
	int saveCustomer();
	long 	updateUser(UserBO userBO);
	List<UserBO>	listUser(String criteria);
	long saveUserWithTemplate(UserBO user);

}
