package com.iamtop.amsandroid.home;

import com.iamtop.amsandroid.R;
import com.iamtop.amsandroid.attendance.AttendanceActivity;
import com.iamtop.amsandroid.login.LoginActivity;
import com.iamtop.amsandroid.taskmanager.TaskManager;
import com.iamtop.amsandroid.taskmanager.TaskManagerActivity;


import android.support.v7.app.ActionBarActivity;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		ActionBar actionBar = getActionBar();
		actionBar.show();
		
	}
	
	public void goToManagement(View v){
		
	}
	
   public void goToTaskManager(View v){
	   Intent intent=new Intent(HomeActivity.this,TaskManagerActivity.class);
	   startActivity(intent);
		
	}
   public void goToAttendance(View v){
	   Intent intent=new Intent(HomeActivity.this ,AttendanceActivity.class);
	   startActivity(intent);
		
	}
   public void goToIamTopWebsite(View v){
	  
	   Intent i = new Intent(Intent.ACTION_VIEW, 
		       Uri.parse("http://iamtop.net/"));
		startActivity(i);
		
	}
   
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		
		MenuItem logoutitem = menu.findItem(R.id.log_out);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.log_out:
			finish();
			/*Intent intent=new Intent(HomeActivity.this,LoginActivity.class);
			startActivity(intent);*/
			return true;
		
	default:
		return super.onOptionsItemSelected(item);
		}
	}
}
