package com.akhilesh.MethodReferences;

public class Course {

	private int sid;
	private String sname;
	private String email;
	public Course() {
		super();
	}
	public Course(int sid, String sname, String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Course [sid=" + sid + ", sname=" + sname + ", email=" + email + "]";
	}
	
}
