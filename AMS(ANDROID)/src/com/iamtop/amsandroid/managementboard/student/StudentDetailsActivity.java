package com.iamtop.amsandroid.managementboard.student;

import org.litepal.crud.DataSupport;

public class StudentDetailsActivity extends DataSupport{
	
	private String studId;
	private String studName;
	private String semester;
	private String dept;
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
