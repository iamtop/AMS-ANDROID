package com.iamtop.amsandroid.login;




import com.iamtop.amsandroid.R;





import com.iamtop.amsandroid.home.HomeActivity;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity {
	private EditText userEmail;
	private EditText password;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
	}
	
	public void getHomePage(View view) {
		userEmail = (EditText) findViewById(R.id.editText1);
		password = (EditText) findViewById(R.id.editText2);
		
		if ((userEmail.getText().toString().trim().equals("admin"))&&(password.getText().toString().trim().equals("123456"))) {
			//userEmail.setError("Email is required!");
			Intent i = new Intent(LoginActivity.this,
					HomeActivity.class);
			startActivity(i);
			
		} else if  (userEmail.getText().toString().trim().equals(""))
		{ 
			Toast.makeText(getApplicationContext(), "Email is required!", Toast.LENGTH_LONG).show();
			//userEmail.setError("Email is required!");
		}else if
			(password.getText().toString().trim().equals("")) {
			Toast.makeText(getApplicationContext(), "Password is required!", Toast.LENGTH_LONG).show();
			//password.setError("Password is required!");
		}
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
