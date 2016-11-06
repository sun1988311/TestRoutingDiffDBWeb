package com.sun.diff.dao.impl;

import org.springframework.stereotype.Repository;

import com.sun.diff.dao.api.IThinker;

@Repository
public class ThinkerImpl implements IThinker {

	@Override
	public void think(String message) {
		System.out.println("i am thinking about:"+message);

	}

}
