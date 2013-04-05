package pages.multiple.multiplepages;

import java.io.File;

import android.util.Log;
import android.net.Uri;

import android.os.Bundle;
import android.os.Environment;

import android.provider.MediaStore;

import android.app.Activity;

//import android.view.Menu;

import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
//import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;
import android.content.Intent;

public class AccessCAmera extends Activity  {


	Button myButtonDocument;
	String videoFilePath;
	TextView myTextView;
	 VideoView videoView;
	public final int VIDEO_RESULT = 0;
	Uri videoFileUri;
	
    @Override
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_camera);
        
        videoFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/tmpvideo.mp4";
        Log.v("IMAGE FILE",videoFilePath);
        
        myTextView = (TextView) this.findViewById(R.id.textView1);
        
        myButtonDocument = (Button) this.findViewById(R.id.document);
        myButtonDocument.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		File videoFile = new File(videoFilePath);
				videoFileUri = Uri.fromFile(videoFile);
				
				Intent i = new Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
				i.putExtra(android.provider.MediaStore.EXTRA_OUTPUT, videoFileUri);

				startActivityForResult(i, VIDEO_RESULT);
        	}});
        videoView = (VideoView) this.findViewById(R.id.VideoView01);
        
        	}
    

    
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) 
    {       		
		super.onActivityResult(requestCode, resultCode, intent);

		switch(requestCode) 
		{
			case VIDEO_RESULT:
				
				if (resultCode == RESULT_OK)
				{
					Log.v("RESULTS","HERE");
					videoView.setVisibility(View.VISIBLE);
					//videoView.setVideoPath(videoFilePath);
					videoView.setVideoURI(videoFileUri);
					videoView.start();
				}
				break;    
		}
    }


}
	
    




