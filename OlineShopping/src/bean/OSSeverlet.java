package bean;

public class OSSeverlet {
	public Integer user_id;
	public String user_name ;
	
	public Integer user_password;
	public Integer user_phone;
	public OSSeverlet() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	/**
	 * @return user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id Ҫ���õ� user_id
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public OSSeverlet(String user_name, Integer user_password, Integer user_phone) {
		super();
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_phone = user_phone;
	}
	/**
	 * @return user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name Ҫ���õ� user_name
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return user_password
	 */
	public Integer getUser_password() {
		return user_password;
	}
	/**
	 * @param user_password Ҫ���õ� user_password
	 */
	public void setUser_password(Integer user_password) {
		this.user_password = user_password;
	}
	/**
	 * @return user_phone
	 */
	public Integer getUser_phone() {
		return user_phone;
	}
	/**
	 * @param user_phone Ҫ���õ� user_phone
	 */
	public void setUser_phone(Integer user_phone) {
		this.user_phone = user_phone;
	}

}
