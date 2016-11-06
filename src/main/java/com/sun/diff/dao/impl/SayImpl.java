package com.sun.diff.dao.impl;

import org.springframework.stereotype.Repository;

import com.sun.diff.dao.api.ISay;

@Repository
public class SayImpl implements ISay {

	@Override
	public void sayMessage(String message) {
		System.out.println("i say :"+message);

	}

}
