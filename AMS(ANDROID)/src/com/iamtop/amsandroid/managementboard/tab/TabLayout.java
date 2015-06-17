package com.iamtop.amsandroid.managementboard.tab;

import com.iamtop.amsandroid.R;
import com.iamtop.amsandroid.managementboard.authority.AuthorityActivity;
import com.iamtop.amsandroid.managementboard.department.DepartmentActivity;
import com.iamtop.amsandroid.managementboard.designation.RoleAssignActivity;
import com.iamtop.amsandroid.managementboard.semester.SemesterActivity;
import com.iamtop.amsandroid.managementboard.student.StudentDetailsActivity;
import com.iamtop.amsandroid.managementboard.subject.SubjectActivity;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

	@SuppressWarnings("deprecation")
	public class TabLayout extends TabActivity {
		
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_tablayout);


			TabHost tabHost = getTabHost();

			
			TabSpec tab = tabHost.newTabSpec("Authority");
			Intent i = new Intent(TabLayout.this,AuthorityActivity.class);
			tab.setIndicator(getResources().getString(R.string.Authority));;
			tab.setContent(i);

			
			TabSpec tab1 = tabHost.newTabSpec("Department");
			Intent i1 = new Intent(TabLayout.this, DepartmentActivity.class);
			tab1.setIndicator(getResources().getString(R.string.Department));
			tab1.setContent(i1);

			
			TabSpec tab2 = tabHost.newTabSpec("RoleAsign");
			Intent i2 = new Intent(TabLayout.this, RoleAssignActivity.class);
			tab2.setIndicator(getResources().getString(R.string.RoleAsign));
			tab2.setContent(i2);
			
			TabSpec tab3 = tabHost.newTabSpec("Batch");
			Intent i3 = new Intent(TabLayout.this, SemesterActivity.class);
			tab3.setIndicator(getResources().getString(R.string.Batch));
			tab3.setContent(i3);
			
			TabSpec tab4 = tabHost.newTabSpec("Student");
			Intent i4 = new Intent(TabLayout.this, StudentDetailsActivity.class);
			tab4.setIndicator(getResources().getString(R.string.Student));
			tab4.setContent(i4);
			
			TabSpec tab5 = tabHost.newTabSpec("Subject");
			Intent i5 = new Intent(TabLayout.this, SubjectActivity.class);
			tab5.setIndicator(getResources().getString(R.string.Subject));
			tab5.setContent(i5);
			
			

			// Adding all TabSpec to TabHost
			tabHost.addTab(tab); 
			tabHost.addTab(tab1); 
			tabHost.addTab(tab2); 
			tabHost.addTab(tab3); 
			tabHost.addTab(tab4); 
			tabHost.addTab(tab5); 
			
	}


}
