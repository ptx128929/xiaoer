package com.bw.asserts;

import java.util.Collection;
import java.util.Map;

public class Assertutil {
	/**
	 * 1.
	 * @param emp
	 * @param message
	 */
	public static void istrue(boolean emp,String message){
		if (!emp) {
			throw new CruntimeExceptions(message);
		}
	}
	
	
	/**
	 * 2.
	 * @param emp
	 * @param message
	 */
	public static void isfalse(boolean emp,String message){
		if (emp) {
			throw new CruntimeExceptions(message);
		}
	}
	
	/**
	 * 3.
	 * @param emp
	 * @param message
	 */
	public static void isclassnull(String emp,String message){
		if (emp == null || emp.length()==0) {
			throw new CruntimeExceptions(message);
		}
	}
	
	/**
	 * 4.
	 * @param emp
	 * @param message
	 */
	public static void isclassnonull(Object emp,String message){
		if (emp != null) {
			throw new CruntimeExceptions(message);
		}
	}
	

	/**
	 * 5.断言 List 或 Set 集合不为空，没有元素也算空
	 * @param emp
	 * @param message
	 */
	public static void isCollction(Collection<?> emp,String message){
		if (emp == null || emp.size()==0) {
			throw new CruntimeExceptions(message);
		}
	}
	/**
	 * 6.断言map
	 * @param emp
	 * @param message
	 */
	public static void ismap(Map<?,?> emp,String message){
		if (emp == null || emp.size()==0) {
			throw new CruntimeExceptions(message);
		}
	}
	/**
	 * 7.字符串
	 * @param emp
	 * @param message
	 */
	public static void isstring(String emp,String message){
		if (emp.trim().length()>0) {
			throw new CruntimeExceptions(message);
		}
	}
	/**
	 * 8.字符串
	 * @param emp
	 * @param message
	 */
	public static void isintads(int emp,String message){
		if (emp<=0) {
			throw new CruntimeExceptions(message);
		}
	}
}
