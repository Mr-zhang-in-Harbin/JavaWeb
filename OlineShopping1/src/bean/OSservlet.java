package bean;

public class OSservlet {
	public String user_id;
	public String user_name;
	public String user_password;
	public String user_phone;

	public OSservlet() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * @return user_id
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            Ҫ���õ� user_id
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public OSservlet(String user_name, String user_password, String user_phone) {
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
	 * @param user_name
	 *            Ҫ���õ� user_name
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return user_password
	 */
	public String getUser_password() {
		return user_password;
	}

	/**
	 * @param user_password
	 *            Ҫ���õ� user_password
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	/**
	 * @return user_phone
	 */
	public String getUser_phone() {
		return user_phone;
	}

	/**
	 * @param user_phone
	 *            Ҫ���õ� user_phone
	 */
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

}
