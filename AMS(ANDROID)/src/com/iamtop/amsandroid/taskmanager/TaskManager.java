package com.iamtop.amsandroid.taskmanager;

public class TaskManager {
	
	public String getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	public String getSlotStartTime() {
		return slotStartTime;
	}
	public void setSlotStartTime(String slotStartTime) {
		this.slotStartTime = slotStartTime;
	}
	public String getSlotEndTime() {
		return slotEndTime;
	}
	public void setSlotEndTime(String slotEndTime) {
		this.slotEndTime = slotEndTime;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getSemName() {
		return semName;
	}
	public void setSemName(String semName) {
		this.semName = semName;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	private String taskDate;
	private String slotStartTime;
	private String slotEndTime;
	private String deptName;
	private String semName;
	private String subName;
	private String fname;
	
}