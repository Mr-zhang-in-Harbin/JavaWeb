package dao.impl;

import bean.OSSeverlet;
import dao.BaseDao;
import dao.ServereletDAO;

public class OSserverlet implements ServereletDAO{
	BaseDao bd = new BaseDao();
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void add(OSSeverlet os) {
		// TODO �Զ����ɵķ������
		String sql ="insert into users vslues(?,?,?,?,?)";
		Object[] ob={os.user_id,os.user_name,os.user_password,os.user_phone};
		bd.executeUpdate(sql, ob);
	}

	@Override
	public void romve(OSSeverlet os) {
		// TODO �Զ����ɵķ������
		String sql = "delect from users where user_id=?";
		Object[] ob = {os.user_id};
		bd.executeUpdate(sql, ob);
		
	}

	@Override
	public void modify(OSSeverlet os) {
		// TODO �Զ����ɵķ������
		String sql = "update users set user_passworld=?.user_phone=?";
		Object[] ob= {os.user_id};
		bd.executeUpdate(sql, ob);
	}

}
