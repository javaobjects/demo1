package net.alibaba.demo1.util;

import java.sql.Connection;

public class TestDBUtils {

	public static void main(String[] args) {
		Connection conn = DBUtils.getConnection();
		System.out.println(conn);
	}

}
