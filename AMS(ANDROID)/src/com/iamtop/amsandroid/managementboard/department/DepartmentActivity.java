package com.iamtop.amsandroid.managementboard.department;

import org.litepal.crud.DataSupport;

public class DepartmentActivity extends DataSupport{
	
	private String deptCode;
	private String deptName;
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
