package com.iamtop.amsandroid.managementboard.department;

import com.iamtop.amsandroid.R;



import android.app.Activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DepartmentAdapter extends ArrayAdapter<Department> {

	private final Activity context;
	private final Department[] deptList;
	
	public DepartmentAdapter(Activity context,Department[] deptList){
		super(context,R.layout.department_adapter ,deptList);
		this.context=context;
		this.deptList=deptList;
		
	}
	@Override
	public View getView(int position, View view, ViewGroup parent){
		View rowView=view;
		final ViewHolder holder;
		if (rowView == null) {
			rowView = context.getLayoutInflater().inflate(
					R.layout.department_adapter, parent, false);
			holder = new ViewHolder();
			holder.deptCode = (TextView) rowView.findViewById(R.id.dept_code);
			holder.deptName = (TextView) rowView.findViewById(R.id.dept_name);
			
			rowView.setTag(holder);
		}
		else {
			holder = (ViewHolder) rowView.getTag();
		}
		holder.deptCode.setText(deptList[position].getDeptCode());
		holder.deptName.setText(deptList[position].getDeptName());
		return rowView;
	}
	
	private class ViewHolder {
		public TextView deptCode;
		public TextView deptName;
	}

}
