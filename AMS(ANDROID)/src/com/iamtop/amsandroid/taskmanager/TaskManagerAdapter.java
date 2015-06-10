package com.iamtop.amsandroid.taskmanager;


import com.iamtop.amsandroid.R;
import android.app.Activity;

import android.widget.ArrayAdapter;

public class TaskManagerAdapter extends ArrayAdapter<TaskManager>{
	private final Activity context;
	private final TaskManager[] taskArray;
	
	public TaskManagerAdapter(Activity context,TaskManager[] taskArray){
		super(context,R.layout.taskmanager_adapter ,taskArray);
		this.context=context;
		this.taskArray=taskArray;
		
	}
 

}
