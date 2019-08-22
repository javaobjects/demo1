package net.alibaba.demo1.domain;

public class Users {
	
//	id username xingqu sex province
	
	private Integer id;
	private String username;
	private String xingqu;
	private Integer sex;
	private String province;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getXingqu() {
		return xingqu;
	}
	public void setXingqu(String xingqu) {
		this.xingqu = xingqu;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Users(Integer id, String username, String xingqu, Integer sex,
			String province) {
		super();
		this.id = id;
		this.username = username;
		this.xingqu = xingqu;
		this.sex = sex;
		this.province = province;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", xingqu="
				+ xingqu + ", sex=" + sex + ", province=" + province + "]";
	}
	
	
	

}
