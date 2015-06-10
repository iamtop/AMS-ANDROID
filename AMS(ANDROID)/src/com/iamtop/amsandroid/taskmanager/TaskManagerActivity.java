package com.iamtop.amsandroid.taskmanager;

import com.iamtop.amsandroid.R;
import com.iamtop.amsandroid.R.id;
import com.iamtop.amsandroid.R.layout;
import com.iamtop.amsandroid.R.menu;
import com.iamtop.amsandroid.login.LoginActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class TaskManagerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_manager);
		ActionBar actionBar=getActionBar();
		actionBar.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.task_manager, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.log_out:
			
		return true;
		

		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
