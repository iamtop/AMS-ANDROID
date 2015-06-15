package com.iamtop.amsandroid.managementboard.designation;

import com.iamtop.amsandroid.R;



import android.app.Activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class RoleAsignAdapter extends ArrayAdapter<RoleAssign> {
	private final Activity context;
	private final RoleAssign[] roles;
	
	public RoleAsignAdapter(Activity context,RoleAssign[] roles){
		super(context,R.layout.activity_role_asign_adapter ,roles);
		this.context=context;
		this.roles=roles;
		
	}
	@Override
	public View getView(int position, View view, ViewGroup parent){
		View rowView=view;
		final ViewHolder holder;
		if (rowView == null) {
			rowView = context.getLayoutInflater().inflate(
					R.layout.activity_role_asign_adapter, parent, false);
			holder = new ViewHolder();
			holder.roleCode = (TextView) rowView.findViewById(R.id.role_code);
			holder.roleName=(TextView) rowView.findViewById(R.id.role_name);
			
			rowView.setTag(holder);
		}
		else {
			holder = (ViewHolder) rowView.getTag();
		}
		holder.roleCode.setText(roles[position].getRoleCode());
		holder.roleName.setText(roles[position].getRoleName());
		return rowView;
	}
	
	private class ViewHolder {
		public TextView roleCode;
		public TextView roleName;
	}

	

}
