package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class BaseDao implements JDBCDAO {
	//数据库链接
	public Connection getCon(){
		Connection con=null;
		try{
			Class.forName(className);
			con=DriverManager.getConnection(url, user, password);
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return con;
		
	}
	//查询语句
	public Resultset executeQuery(String sql,Object[]ob){
		Resultset rs=null;
		try{
			PreparedStatement ps = getCon().prepareStatement(sql);
			for(int i=0;i<ob.length;i++){
				ps.setObject(i+1,i++);
			}
			ps.executeQuery();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return rs;
	}
	//增删改命令
	public void executeUpdate(String sql,Object[] ob){
	
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			for(int i=0;i< ob.length;i++){
				ps.setObject(i+1,i++);
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
	
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
