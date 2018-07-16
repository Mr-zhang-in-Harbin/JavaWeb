package DAO.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import DAO.BaseDAO;
import DAO.OSServlet;
import bean.OSservlet;

public class OSimpl implements OSServlet {
	BaseDAO bd=new BaseDAO();

	@Override
	public OSservlet query(String user_id) {
		// TODO 自动生成的方法存根
		ResultSet rs=null;
		List<OSservlet> os=null;
		/*try{
			String  sql="select * from users where user_id=?";
			Object[] ob={user_id};
			while(rs.next()){
				os=new ;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		} */
		return null;
	}

	@Override
	public void add(OSservlet os) {
		// TODO 自动生成的方法存根
		String sql ="insert into users value (?,?,?,?)";
		Object[] ob ={os.user_id,os.user_name,os.user_password,os.user_phone};
		bd.executeUpdate(sql, ob);
		
	}

	@Override
	public void modify(OSservlet os) {
		// TODO 自动生成的方法存根
		String sql="update users set user_name=?,user_password=?,user_phone=? where user_id=?";
		Object [] ob={os.user_name,os.user_password,os.user_phone,os.user_id};
		bd.executeUpdate(sql, ob);
	}

}
