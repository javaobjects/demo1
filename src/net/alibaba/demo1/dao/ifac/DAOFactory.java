package net.alibaba.demo1.dao.ifac;

import net.alibaba.demo1.dao.impl.UserDaoImpl;

public class DAOFactory {
	
	public static UserDaoIfac getUserDaoInstance()
	{
		return new UserDaoImpl();
	}
	
}
