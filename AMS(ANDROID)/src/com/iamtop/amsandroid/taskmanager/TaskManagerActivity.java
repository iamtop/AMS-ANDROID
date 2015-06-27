package com.iamtop.amsandroid.taskmanager;



import java.util.concurrent.ExecutionException;

import com.iamtop.amsandroid.R;

import com.iamtop.amsandroid.utilities.GetOperation;
import com.iamtop.amsandroid.utilities.JsonHelper;




import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TaskManagerActivity extends Activity {
	
	TaskManagerAdapter adapter;
	ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_manager);
		ActionBar actionBar=getActionBar();
		actionBar.show();
		
		listView=(ListView)findViewById(R.id.task_list);
		String serverUrl=com.iamtop.amsandroid.urls.UrlInfo.ALL_TASK;
		AsyncTask<String, Void, String>allTask=new GetOperation().execute(serverUrl);
		try{
			final TaskManager[] tasks=(TaskManager[]) JsonHelper.toObject(allTask.get(), TaskManager[].class);
	        adapter=new TaskManagerAdapter(TaskManagerActivity.this, tasks);
			listView.setAdapter(adapter);
			
			listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					
					// pass Data to other Activity
					Intent i = new Intent(TaskManagerActivity.this,
							TaskDetailsActivity.class);
					// i.putStringArrayListExtra("productData", productData);
					i.putExtra("teachId", tasks[position].getId());
					
					startActivity(i);
				}
			});
			
			
			
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
			//write the logic for logout here
		return true;
		

		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
