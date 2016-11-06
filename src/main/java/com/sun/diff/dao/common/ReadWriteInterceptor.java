package com.sun.diff.dao.common;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.PatternMatchUtils;

public class ReadWriteInterceptor {

	private List<String> readMethodList = new ArrayList<String>();
	private List<String> writeMethodList = new ArrayList<String>();

	public Object readOrWriteDB(ProceedingJoinPoint pjp) throws Throwable {
		String methodName = pjp.getSignature().getName();
		if (isChooseReadDB(methodName)) {
			DataSourceTypeManager.set(DataSources.MYSQL);
		} else if (isChooseWriteDB(methodName)) {
			DataSourceTypeManager.set(DataSources.ORACLE);
		} else {
			DataSourceTypeManager.set(DataSources.ORACLE);
		}
		return pjp.proceed();

	}

	private boolean isChooseWriteDB(String methodName) {
		for (String mappedName : this.writeMethodList) {
			if (isMatch(methodName, mappedName)) {
				return true;
			}
		}
		return false;
	}

	private boolean isChooseReadDB(String methodName) {
		for (String mappedName : this.readMethodList) {
			if (isMatch(methodName, mappedName)) {
				return true;
			}
		}
		return false;
	}

	private boolean isMatch(String methodName, String mappedName) {
		return PatternMatchUtils.simpleMatch(mappedName, methodName);
	}

	public List<String> getReadMethodList() {
		return readMethodList;
	}

	public void setReadMethodList(List<String> readMethodList) {
		this.readMethodList = readMethodList;
	}

	public List<String> getWriteMethodList() {
		return writeMethodList;
	}

	public void setWriteMethodList(List<String> writeMethodList) {
		this.writeMethodList = writeMethodList;
	}

}
