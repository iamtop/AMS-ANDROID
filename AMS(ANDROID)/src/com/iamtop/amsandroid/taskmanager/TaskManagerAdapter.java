package com.iamtop.amsandroid.taskmanager;


import com.iamtop.amsandroid.R;




import android.app.Activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TaskManagerAdapter extends ArrayAdapter<TaskManager>{
	private final Activity context;
	private final TaskManager[] taskArray;
	
	public TaskManagerAdapter(Activity context,TaskManager[] taskArray){
		super(context,R.layout.taskmanager_adapter ,taskArray);
		this.context=context;
		this.taskArray=taskArray;
		
	}
	@Override
	public View getView(int position, View view, ViewGroup parent){
		View rowView=view;
		final ViewHolder holder;
		if (rowView == null) {
			rowView = context.getLayoutInflater().inflate(
					R.layout.taskmanager_adapter, parent, false);
			holder = new ViewHolder();
			holder.teacher = (TextView) rowView.findViewById(R.id.teacher_name);
			
			rowView.setTag(holder);
		}
		else {
			holder = (ViewHolder) rowView.getTag();
		}
		holder.teacher.setText(taskArray[position].getSlotStartTime());
		return rowView;
	}
	
	private class ViewHolder {
		public TextView teacher;
	}

}
