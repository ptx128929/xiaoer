package com.bw.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.dean.Emp;
import com.bw.services.Empsrvice;

@Controller
public class Empcontroller {
	@Resource
	private Empsrvice s;
	
	@RequestMapping("list.do")
	public String list(ModelMap maps){
		List<Emp> list=s.list();
		maps.put("list", list);
		return "list";
		
	}

}
