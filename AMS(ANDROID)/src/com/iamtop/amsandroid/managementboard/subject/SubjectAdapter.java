package com.iamtop.amsandroid.managementboard.subject;

import com.iamtop.amsandroid.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SubjectAdapter extends ArrayAdapter<Subject> {
	
	Activity context;
	Subject[] subs;
	
	public SubjectAdapter(Activity context ,Subject[] subs){
		super(context,R.layout.subject_adapter, subs);
		this.context=context;
		this.subs=subs;
		
	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent){
		View rowView=view;
		 final ViewHolder holder;
		 if (rowView == null) {
				rowView = context.getLayoutInflater().inflate(
						R.layout.subject_adapter, parent, false);
				holder = new ViewHolder();
				holder.subId = (TextView) rowView.findViewById(R.id.sub_id);
				holder.subName=(TextView) rowView.findViewById(R.id.sub_name);
				
				rowView.setTag(holder);
			}
			else {
				holder = (ViewHolder) rowView.getTag();
			}
		 holder.subId.setText(subs[position].getSubId());
		 holder.subName.setText(subs[position].getSubName());
		return rowView;
	}
	
	private  class  ViewHolder{
		 
		TextView subId;
		TextView subName;
	
	}
}
