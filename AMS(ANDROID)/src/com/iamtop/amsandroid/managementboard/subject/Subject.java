package com.iamtop.amsandroid.managementboard.subject;

import com.iamtop.amsandroid.managementboard.department.Department;
import com.iamtop.amsandroid.managementboard.semester.Semester;

public class Subject {
	private String id;
	private String subId;
	private String subName;
	private Department deptList;
	private Semester batchList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public Department getDeptList() {
		return deptList;
	}
	public void setDeptList(Department deptList) {
		this.deptList = deptList;
	}
	public Semester getBatchList() {
		return batchList;
	}
	public void setBatchList(Semester batchList) {
		this.batchList = batchList;
	}
	

}
