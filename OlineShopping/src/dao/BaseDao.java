package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class BaseDao implements JDBCDAO {
	//���ݿ�����
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
	//��ѯ���
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
	//��ɾ������
	public void executeUpdate(String sql,Object[] ob){
	
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			for(int i=0;i< ob.length;i++){
				ps.setObject(i+1,i++);
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			System.out.println(e.getMessage());
		}
	
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
