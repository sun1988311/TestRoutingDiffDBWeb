package com.sun.diff.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sun.diff.dao.api.ICrtUserInfoDao;
import com.sun.diff.dao.common.MybatisSqlSessionDao;
import com.sun.diff.form.CrtUserInfo;

@Repository
public class CrtUserInfoDaoImpl extends MybatisSqlSessionDao implements ICrtUserInfoDao {
	
	private static final String SQLNAMESPACE = "com.sun.diff.dao.api.ICrtUserInfoDao.";

	@Override
	public int countByExample(CrtUserInfo crtUserInfo) {
		return 0;
	}

	@Override
	public int deleteByExample(CrtUserInfo crtUserInfo) {
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long userInfoId) {
		return this.getSqlSession().delete(SQLNAMESPACE+"deleteByPrimaryKey",userInfoId);
	}

	@Override
	public int insert(CrtUserInfo record) {
		return this.getSqlSession().insert(SQLNAMESPACE+"insert",record);
	}

	@Override
	public int insertSelective(CrtUserInfo record) {
		return 0;
	}

	@Override
	public List<CrtUserInfo> selectByExample(CrtUserInfo crtUserInfo) {
		return null;
	}

	@Override
	public CrtUserInfo selectByPrimaryKey(Long userInfoId) {
		CrtUserInfo crtUserInfo = this.getSqlSession().selectOne(SQLNAMESPACE+"selectByPrimaryKey",userInfoId);
		return crtUserInfo;
	}

	@Override
	public int updateByExampleSelective(CrtUserInfo record, CrtUserInfo crtUserInfo) {
		return 0;
	}

	@Override
	public int updateByExample(CrtUserInfo record, CrtUserInfo crtUserInfo) {
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CrtUserInfo record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CrtUserInfo record) {
		return this.getSqlSession().update(SQLNAMESPACE+"updateByPrimaryKey",record);
	}

}
