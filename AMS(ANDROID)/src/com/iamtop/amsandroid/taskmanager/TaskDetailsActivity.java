package com.iamtop.amsandroid.taskmanager;

import java.util.concurrent.ExecutionException;

import com.iamtop.amsandroid.R;

import com.iamtop.amsandroid.urls.UrlInfo;
import com.iamtop.amsandroid.utilities.GetOperation;
import com.iamtop.amsandroid.utilities.JsonHelper;

import android.app.Activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class TaskDetailsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_details);
		
		String teacherId=getIntent().getExtras().getString("teachId");
		System.out.println("teacherId=="+teacherId);
		
		String serverUrl=UrlInfo.SINGLE_TASK_DETAILS+teacherId;
		
		AsyncTask<String, Void, String>taskDetails=new GetOperation().execute(serverUrl);
		try{
			 TaskManager tasks[]=(TaskManager[]) JsonHelper.toObject(taskDetails.get(), TaskManager[].class);
			
			 System.out.println("taskDetails=="+taskDetails.get());
			
			
			 ViewHolder holder=new ViewHolder();
			holder.slotStart=(TextView) findViewById(R.id.slot_start_time);
			holder.slotEnd=(TextView) findViewById(R.id.slot_end_time);
			holder.taskDate=(TextView) findViewById(R.id.task_date);
			holder.taskDept=(TextView) findViewById(R.id.task_dept);
			holder.taskSem=(TextView) findViewById(R.id.task_sem);
			holder.taskSub=(TextView) findViewById(R.id.task_sub);
			holder.taskTeacher=(TextView) findViewById(R.id.task_teacher);
			
			holder.slotStart.setText(tasks[0].getSlotStartTime());
			holder.slotEnd.setText(tasks[0].getSlotEndTime());
			holder.taskDate.setText(tasks[0].getTaskDate());
			holder.taskDept.setText(tasks[0].getDeptName());
			holder.taskSem.setText(tasks[0].getSemName());
			holder.taskSub.setText(tasks[0].getSubName());
			holder.taskTeacher.setText(tasks[0].getFname()+" "+tasks[0].getLname());
			
			
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private class ViewHolder{
		TextView slotStart;
		TextView slotEnd;
		TextView taskDate;
		TextView taskDept;
		TextView taskSem;
		TextView taskSub;
		TextView taskTeacher;
		
	}
	
	public void clickOk(View view){
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.task_details, menu);
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
