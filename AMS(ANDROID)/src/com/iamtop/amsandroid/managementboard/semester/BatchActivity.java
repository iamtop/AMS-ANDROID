package com.iamtop.amsandroid.managementboard.semester;

import org.litepal.LitePalApplication;
import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;


import com.iamtop.amsandroid.R;
import com.iamtop.amsandroid.managementboard.department.DepartmentActivity;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BatchActivity extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_batch);
		
		TextView txt1=(TextView)findViewById(R.id.dept_code);
		TextView txt2=(TextView)findViewById(R.id.dept_name);
		SQLiteDatabase db=Connector.getDatabase();
		db.beginTransaction();
		DepartmentActivity dept1=new DepartmentActivity();
		dept1.setDeptCode("1001");
		dept1.setDeptName("Pabi");
		dept1.save();
		
	    DepartmentActivity dept2=new DepartmentActivity();
	    dept2.setDeptCode("1002");
	    dept2.update(1);
	    
	    txt1.setText(dept2.getDeptCode());
		
	}
	
	

	
	
	

}
