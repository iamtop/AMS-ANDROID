package com.iamtop.amsandroid.login;


import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import com.iamtop.amsandroid.R;
import com.iamtop.amsandroid.managementboard.department.DepartmentActivity;


import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		SQLiteDatabase db = Connector.getDatabase();
		
		DepartmentActivity dept=new DepartmentActivity();
		dept.setDeptCode("1001");
		dept.setDeptName("Pabitra");
		dept.save();
		DepartmentActivity dept1=new DepartmentActivity();
		dept1.setDeptCode("1002");
		dept1.setDeptName("Raju");
		dept1.save();
		
		dept.setDeptCode("1003");
		dept.update(1);
		DataSupport.delete(DepartmentActivity.class, 1);
		TextView txt1=(TextView) findViewById(R.id.dept1);
		TextView txt2=(TextView) findViewById(R.id.dept2);
		txt1.setText(dept1.getDeptCode());
		txt2.setText(dept.getDeptName());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
