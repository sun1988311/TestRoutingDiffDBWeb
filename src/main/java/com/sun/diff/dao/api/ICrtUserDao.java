package com.sun.diff.dao.api;

import com.sun.diff.form.CrtUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICrtUserDao {
    int countByExample(CrtUser crtUser);

    int deleteByExample(CrtUser crtUser);

    int deleteByPrimaryKey(Long userId);

    int insert(CrtUser record);

    int insertSelective(CrtUser record);

    List<CrtUser> selectByExample(CrtUser crtUser);

    CrtUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") CrtUser record, @Param("example") CrtUser crtUser);

    int updateByExample(@Param("record") CrtUser record, @Param("example") CrtUser crtUser);

    int updateByPrimaryKeySelective(CrtUser record);

    int updateByPrimaryKey(CrtUser record);
    
    int isExistCrtUser(CrtUser record);
}