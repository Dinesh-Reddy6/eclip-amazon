package com.cmr.amazon.dao;

import java.util.ArrayList;
import java.util.List;
import com.cmr.amazon.common.DBconfactory;
import com.cmr.amazon.entity.Category;

public class CategoryDAO extends AmazonDAO{

	@Override
	public Boolean save(Object obj) {//we have received Category cat
		Category cat = (Category) obj;
		sql = "insert into amazon (catname) values('"+cat.getCatname()+"')";
		return super.save(obj);
	}

	@Override
	public Boolean update(Object obj) {
		Category cat = (Category) obj;
		sql = "update amazon set catname= '"+cat.getCatname()+"' where id="+cat.getId();
		return super.update(obj);
	}

	@Override
	public Boolean delete(Integer id) {
		sql = "delete from amazon where id=" + id;
		return super.delete(id);
	}

	@Override
	public Object get(Integer id) {
		sql = "select id, catname from amazon where id="+id;
		Category cat = new Category();
		try {
			con = DBconfactory.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs != null && rs.next()) {
				cat.setId(rs.getInt("id"));
				cat.setCatname(rs.getString("catname"));
			}
		}catch(Exception e) {System.out.println(e);}
		finally {
			try {stmt.close(); con.close();}catch(Exception e) {}
		}
		return cat;
	}

	@Override
	public List<Object> list() {
		sql = "select id, catname from amazon";
		List<Object> catList = new ArrayList<>();
		try {
			con = DBconfactory.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs != null) {
				while(rs.next()) {
					Category cat = new Category();
					cat.setId(rs.getInt("id"));
					cat.setCatname(rs.getString("catname"));
					catList.add(cat);
				}
			}			
		}catch(Exception e) {System.out.println(e);}
		finally {
			try {stmt.close(); con.close();}catch(Exception e) {}
		}
		return catList;
	}

}
