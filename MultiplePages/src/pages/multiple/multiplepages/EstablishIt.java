package pages.multiple.multiplepages;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class EstablishIt extends Activity implements OnClickListener {
	TextView myTextEstablish;
	TextView myTextprojectName;
	TextView myTextDate;
	Button myButtonnext;
	EditText myProjectname;
	EditText myDate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_establish_it);
		myTextEstablish = (TextView) findViewById(R.id.textEstablish);
		myTextprojectName= (TextView) findViewById(R.id.projectName);
		myTextDate= (TextView) findViewById(R.id.date);
		myProjectname =(EditText) findViewById(R.id.project_name);
		myDate =(EditText) findViewById(R.id.date_entry);
		myButtonnext = (Button) findViewById(R.id.next1);
		myButtonnext.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_establish_it, menu);
		return true;
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	//	myButtonnext.setText("Let's Film");
	Toast t = Toast.makeText(this, "Take Establishing Shot of your Project", Toast.LENGTH_LONG);
		t.show();
		Log.v("Establishit", "onClick Called"+ myTextEstablish.getText());
		Intent i = new Intent(this, AccessCAmera.class); 
		startActivity(i);
	
	}
}
