package com.bw.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.bw.asserts.Assertutil;
import com.bw.asserts.CruntimeExceptions;

public class Asserttest {
	
	@Test
	public void fun1Test(){
	try {
		Assertutil.istrue(false , "这不是一个true");
	} catch (CruntimeExceptions e) {
		e.printStackTrace();
	}
	}
	
	@Test
	public void fun2Test(){
	try {
		Assertutil.isfalse(false, "这不是一个false");
	} catch (CruntimeExceptions e) {
		e.printStackTrace();
	}
	}
	
	
	@Test
	public void fun3Test(){
	try {
		Assertutil.isclassnull("sss","这不是一个字符串");
	} catch (CruntimeExceptions e) {
		e.printStackTrace();
	}
	}

	@Test
	public void fun4Test(){
	try {
		Assertutil.isclassnonull(null,"是一个字符串");
	} catch (CruntimeExceptions e) {
		e.printStackTrace();
	}
	}
	@Test
	public void fun5Test(){
	try {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(55);
		Assertutil.isCollction(list, "这不是一个集合或者集合为空");
	} catch (CruntimeExceptions e) {
		e.printStackTrace();
	}
	}
	
	@Test
	public void fun6Test(){
	try {
		HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
		hashMap.put(55,"sdd");
		Assertutil.ismap(hashMap, "这不是一个集合或者集合为空");
	} catch (CruntimeExceptions e) {
		e.printStackTrace();
	}
	}
	
	@Test
	public void fun7Test(){
	try {
		
		Assertutil.isstring("", "这不是一个字符串");
	} catch (CruntimeExceptions e) {
		e.printStackTrace();
	}
	}

	@Test
	public void fun8Test(){
	try {
		
		Assertutil.isintads(-45, "这不是一个整数");
	} catch (CruntimeExceptions e) {
		e.printStackTrace();
	}
	}
}
