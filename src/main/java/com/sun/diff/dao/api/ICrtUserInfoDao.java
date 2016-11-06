package com.sun.diff.dao.api;

import com.sun.diff.form.CrtUserInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICrtUserInfoDao {
    int countByExample(CrtUserInfo crtUserInfo);

    int deleteByExample(CrtUserInfo crtUserInfo);

    int deleteByPrimaryKey(Long userInfoId);

    int insert(CrtUserInfo record);

    int insertSelective(CrtUserInfo record);

    List<CrtUserInfo> selectByExample(CrtUserInfo crtUserInfo);

    CrtUserInfo selectByPrimaryKey(Long userInfoId);

    int updateByExampleSelective(@Param("record") CrtUserInfo record, @Param("example") CrtUserInfo crtUserInfo);

    int updateByExample(@Param("record") CrtUserInfo record, @Param("example") CrtUserInfo crtUserInfo);

    int updateByPrimaryKeySelective(CrtUserInfo record);

    int updateByPrimaryKey(CrtUserInfo record);
}