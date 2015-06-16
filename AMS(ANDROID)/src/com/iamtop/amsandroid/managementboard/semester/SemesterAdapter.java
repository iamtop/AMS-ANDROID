package com.iamtop.amsandroid.managementboard.semester;

import com.iamtop.amsandroid.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SemesterAdapter extends ArrayAdapter<Semester> {
	private final Activity context;
	private final Semester[] sems;
	
	public SemesterAdapter(Activity context,Semester[] sems){
		super(context,R.layout.semester_adapter ,sems);
		this.context=context;
		this.sems=sems;
		
	}
	@Override
	public View getView(int position, View view, ViewGroup parent){
		View rowView=view;
		final ViewHolder holder;
		if (rowView == null) {
			rowView = context.getLayoutInflater().inflate(
					R.layout.semester_adapter, parent, false);
			holder = new ViewHolder();
			holder.semId = (TextView) rowView.findViewById(R.id.sem_id);
			holder.semName = (TextView) rowView.findViewById(R.id.sem_name);
			
			rowView.setTag(holder);
		}
		else {
			holder = (ViewHolder) rowView.getTag();
		}
		holder.semId.setText(sems[position].getSemId());
		holder.semName.setText(sems[position].getSemName());
		return rowView;
	}
	
	private class ViewHolder {
		public TextView semId;
		public TextView semName;
	}

	

	
}
