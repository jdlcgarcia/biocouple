package com.bobotosoft.j2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void changeIntent(View V)
	{
		if(V.getId() == R.id.imageView1 || V.getId() == R.id.textView1) //Fotos
			startActivity(new Intent(this.getApplicationContext(),PicsActivity.class));
		else if (V.getId() == R.id.imageView2 || V.getId() == R.id.textView2) //Música TODO
			startActivity(new Intent(this.getApplicationContext(),MusicActivity.class)); 
		else if (V.getId() == R.id.imageView3 || V.getId() == R.id.textView3) //Historia
			startActivity(new Intent(this.getApplicationContext(),StoryActivity.class));
		else if (V.getId() == R.id.imageView4 || V.getId() == R.id.textView4) //Mapa
			startActivity(new Intent(this.getApplicationContext(),MapActivity.class)); 
		else if (V.getId() == R.id.imageView5 || V.getId() == R.id.textView5) //Gustos TODO
			startActivity(new Intent(this.getApplicationContext(),LikesActivity.class)); 
			
			
		
		
	}
}
