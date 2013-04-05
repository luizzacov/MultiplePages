package pages.multiple.multiplepages;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	TextView myTextView;
	Button myButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myTextView = (TextView) findViewById(R.id.my_textview);
		myButton = (Button) findViewById(R.id.get_started);
		myButton.setOnClickListener(this);
	Log.v("MainActivity","onCreate Started");
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View clickedView) {
		// TODO Auto-generated method stub
		//myButton.setText("You Clicked Me");
		//Toast t = Toast.makeText(this, "Take Establishing Shot of your Project", Toast.LENGTH_LONG);
	//	t.show();
		Log.v("MainActivity", "onClick Called"+ myTextView.getText());
		Intent i = new Intent(this, EstablishIt.class); 
		startActivity(i);
	}

}
