package net.alibaba.demo1.service.ifac;

import net.alibaba.demo1.service.impl.UserServiceImpl;

public class ServiceFactory {

	public static UserServiceIfac getUserServiceInstance() {
		return new UserServiceImpl();
	}

}
