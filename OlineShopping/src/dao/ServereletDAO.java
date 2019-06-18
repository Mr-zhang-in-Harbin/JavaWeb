package dao;

import java.util.List;

import bean.OSSeverlet;

public interface ServereletDAO {
	//public OSSeverlet query(Integer user_id);
	 public void add(OSSeverlet os);
	 public void romve(OSSeverlet os);
	 public void modify(OSSeverlet os);
	
}
