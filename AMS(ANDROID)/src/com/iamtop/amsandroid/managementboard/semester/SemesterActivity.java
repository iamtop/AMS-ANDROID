package com.iamtop.amsandroid.managementboard.semester;

import java.util.concurrent.ExecutionException;

import com.iamtop.amsandroid.R;
import com.iamtop.amsandroid.R.id;
import com.iamtop.amsandroid.R.layout;
import com.iamtop.amsandroid.R.menu;
import com.iamtop.amsandroid.taskmanager.TaskManager;
import com.iamtop.amsandroid.taskmanager.TaskManagerActivity;
import com.iamtop.amsandroid.taskmanager.TaskManagerAdapter;
import com.iamtop.amsandroid.urls.UrlInfo;
import com.iamtop.amsandroid.utilities.GetOperation;
import com.iamtop.amsandroid.utilities.JsonHelper;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class SemesterActivity extends Activity {
	SemesterAdapter adapter;
	ListView listView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_semester);
		
		String serverUrl=UrlInfo.ALL_SEMS;
		listView=(ListView) findViewById(R.id.sem_list);
		AsyncTask<String, Void, String>allSems=new GetOperation().execute(serverUrl);
		try{
			Semester[] sems=(Semester[]) JsonHelper.toObject(allSems.get(), Semester[].class);
	        adapter=new SemesterAdapter(SemesterActivity.this, sems);
			listView.setAdapter(adapter);
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.semester, menu);
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
