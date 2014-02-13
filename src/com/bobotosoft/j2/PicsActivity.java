package com.bobotosoft.j2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class PicsActivity extends Activity{

	protected static final String TAG = "";
	
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_pics);

	    GridView gridview = (GridView) findViewById(R.id.gridview);
	    gridview.setAdapter(new ImageAdapter(this, gridview));

	    gridview.setOnItemClickListener(new OnItemClickListener() {

	        public void onItemClick(AdapterView<?> parent, View v, int position,
	                long id) {
	        	Intent picIntent = new Intent(getApplicationContext(), Fullpic.class);
	        	picIntent.putExtra("img", position);
	            startActivity(picIntent);
	        }
	    });
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pics, menu);
		return true;
	}


}
