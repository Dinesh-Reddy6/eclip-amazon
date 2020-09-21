package com.cmr.amazon.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cmr.amazon.common.JDBCtemplate;

public abstract class AmazonDAO implements DAO{

	protected String sql = null;
	protected ResultSet rs = null;
	protected Connection con =null;
	protected Statement stmt = null;
	
	@Override
	public Boolean save(Object obj) {
		return JDBCtemplate.executeUpdate(sql);
	}

	@Override
	public Boolean update(Object obj) {
		return JDBCtemplate.executeUpdate(sql);		
	}

	@Override
	public Boolean delete(Integer id) {
		return JDBCtemplate.executeUpdate(sql);		
	}
}

