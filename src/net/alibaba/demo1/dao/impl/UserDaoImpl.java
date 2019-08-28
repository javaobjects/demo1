package net.alibaba.demo1.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import net.alibaba.demo1.dao.ifac.UserDaoIfac;
import net.alibaba.demo1.domain.Users;
import net.alibaba.demo1.util.DBUtils;

public class UserDaoImpl implements UserDaoIfac {

	private static final String ADD_USER = "insert into demo1_users(col_id,col_username,col_xingqu,col_sex,col_province)"
			+ " values (?,?,?,?,?)";
	
	/* (non-Javadoc)  
	 * <p>Title: addUser</p>  
	 * <p>
	 *	Description: 
	 * </p> 
	 * @param user
	 * @return  
	 * @see net.alibaba.demo1.dao.impl.UserDaoIfac#addUser(net.alibaba.demo1.domain.Users)  
	 */
	@Override
	public int addUser(Users user) {
		int rows = 0;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn=DBUtils.getConnection();
			stmt=conn.prepareStatement(ADD_USER);
			stmt.setInt(1,user.getId());
			stmt.setString(2, user.getUsername());
			stmt.setString(3,user.getXingqu());
			stmt.setInt(4,user.getSex());
			stmt.setString(5, user.getProvince());
			rows=stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.release(conn, stmt, null);
		}
		
		return rows;
	}
}
