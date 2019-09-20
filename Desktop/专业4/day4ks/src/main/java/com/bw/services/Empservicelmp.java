package com.bw.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.dao.Empdao;
import com.bw.dean.Emp;

@Service
public class Empservicelmp implements Empsrvice{
	@Resource
	private Empdao s;

	@Override
	public List<Emp> list() {
		// TODO Auto-generated method stub
		return s.list();
	}

}
