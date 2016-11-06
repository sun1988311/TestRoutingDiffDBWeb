package com.sun.diff.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sun.diff.dao.api.ICrtUserDao;
import com.sun.diff.dao.common.MybatisSqlSessionDao;
import com.sun.diff.form.CrtUser;

@Repository
public class CrtUserDaoImpl extends MybatisSqlSessionDao implements ICrtUserDao {
	
	private static final String SQLNAMESPACE = "com.sun.diff.dao.api.ICrtUserDao.";
	
	@Override
	public int countByExample(CrtUser crtUser) {
		return 0;
	}

	@Override
	public int deleteByExample(CrtUser crtUser) {
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long userId) {
		return this.getSqlSession().delete(SQLNAMESPACE+"deleteByPrimaryKey",userId);
	}

	@Override
	public int insert(CrtUser record) {
		return this.getSqlSession().insert(SQLNAMESPACE+"insert",record);
	}

	@Override
	public int insertSelective(CrtUser record) {
		return 0;
	}

	@Override
	public List<CrtUser> selectByExample(CrtUser crtUser) {
		return null;
	}

	@Override
	public CrtUser selectByPrimaryKey(Long userId) {
		CrtUser crtUser = this.getSqlSession().selectOne(SQLNAMESPACE+"selectByPrimaryKey",userId);
		return crtUser;
	}

	@Override
	public int updateByExampleSelective(CrtUser record, CrtUser crtUser) {
		return 0;
	}

	@Override
	public int updateByExample(CrtUser record, CrtUser crtUser) {
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CrtUser record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CrtUser record) {
		return this.getSqlSession().update(SQLNAMESPACE+"updateByPrimaryKey",record);
	}

	@Override
	public int isExistCrtUser(CrtUser record) {
		return this.getSqlSession().selectOne(SQLNAMESPACE+"isExistCrtUser",record);
	}

}
