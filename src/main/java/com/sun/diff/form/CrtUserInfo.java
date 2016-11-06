package com.sun.diff.form;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class CrtUserInfo {
    private Long userInfoId;

    private String sex;

    private Integer age;

    private Date birthday;
    
    private String yearOfBirthday;
    
    private String monthOfBirthday;
    
    private String dayOfBirthday;

    private String countryCode;

    private String cityCode;

    private String telephonenumber;

    private Timestamp createDate;

    private String createUser;

    private Timestamp updateDate;

    private String updateUser;

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getYearOfBirthday() {
		return this.yearOfBirthday;
	}

	public void setYearOfBirthday(String yearOfBirthday) {
		this.yearOfBirthday = yearOfBirthday;
	}

	public String getMonthOfBirthday() {
		return this.monthOfBirthday;
	}

	public void setMonthOfBirthday(String monthOfBirthday) {
		this.monthOfBirthday = monthOfBirthday;
	}

	public String getDayOfBirthday() {
		return this.dayOfBirthday;
	}

	public void setDayOfBirthday(String dayOfBirthday) {
		this.dayOfBirthday = dayOfBirthday;
	}

	public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber == null ? null : telephonenumber.trim();
    }

    public Object getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}