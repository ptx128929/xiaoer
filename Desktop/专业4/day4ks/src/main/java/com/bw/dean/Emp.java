package com.bw.dean;

public class Emp {
	private int eid;
	private String ename;
	private String dates;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getPing() {
		return ping;
	}
	public void setPing(String ping) {
		this.ping = ping;
	}
	private String ping;
	public Emp(int eid, String ename, String dates, String ping) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dates = dates;
		this.ping = ping;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", dates=" + dates + ", ping=" + ping + "]";
	}
	

}
