package DAO;

import bean.OSservlet;

public interface OSServlet {
	public OSservlet query(String user_id);
	public void add(OSservlet os);
	public  void modify(OSservlet os);

}
