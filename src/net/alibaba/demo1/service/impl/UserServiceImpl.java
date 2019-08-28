package net.alibaba.demo1.service.impl;

import net.alibaba.demo1.dao.ifac.DAOFactory;
import net.alibaba.demo1.dao.ifac.UserDaoIfac;
import net.alibaba.demo1.dao.impl.UserDaoImpl;
import net.alibaba.demo1.domain.Users;
import net.alibaba.demo1.service.ifac.UserServiceIfac;

public class UserServiceImpl implements UserServiceIfac{
	
//	private UserDaoIfac userDao=new UserDaoImpl();
	private UserDaoIfac userDao = DAOFactory.getUserDaoInstance();

	@Override
	public boolean register(Users user) {
		return userDao.addUser(user) > 0;
	}

}
