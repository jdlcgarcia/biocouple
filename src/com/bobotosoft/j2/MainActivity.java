package com.bobotosoft.j2;

import java.util.Random;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";
	Intent bgmusic;
	private boolean _doubleBackToExitPressedOnce = false;
	Random r = new Random(System.currentTimeMillis());
	int song;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//processStartService("bgmusic");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void changeIntent(View V) {
		if (V.getId() == R.id.ivFotos || V.getId() == R.id.tvFotos) // Fotos
			startActivity(new Intent(this.getApplicationContext(),
					PicsActivity.class));
		else if (V.getId() == R.id.ivCanciones || V.getId() == R.id.tvCanciones) // Música
			startActivity(new Intent(this.getApplicationContext(),
					MusicActivity.class));
		else if (V.getId() == R.id.ivHistoria || V.getId() == R.id.tvHistoria) // Historia
			startActivity(new Intent(this.getApplicationContext(),
					StoryActivity.class));
		else if (V.getId() == R.id.ivLugares || V.getId() == R.id.tvLugares) // Mapa
			startActivity(new Intent(this.getApplicationContext(),
					MapActivity.class));
		else if (V.getId() == R.id.ivGustos || V.getId() == R.id.tvGustos) // Gustos
																			// TODO
			startActivity(new Intent(this.getApplicationContext(),
					LikesActivity.class));
	}
	
	@Override
	public void onStop(){
		
		super.onStop();
	}
	
	@Override
	public void onBackPressed() {

	    Log.i(TAG, "onBackPressed--");
	    if (_doubleBackToExitPressedOnce) {
	        super.onBackPressed();
	        return;
	    }
	    this._doubleBackToExitPressedOnce = true;
	    Toast.makeText(this, "Pulsar de nuevo para salir", Toast.LENGTH_SHORT).show();
	    new Handler().postDelayed(new Runnable() {
	        @Override
	        public void run() {
	        	processStopService("bgmusic");
	            _doubleBackToExitPressedOnce = false;
	        }
	    }, 2000);
	}
	private void processStartService(final String tag) {
	    Intent intent = new Intent(getApplicationContext(), Playlist.class);
	    intent.addCategory(tag);
	    //song = r.nextInt();
	    intent.putExtra("song", r.nextInt());
	    startService(intent);
	}
	private void processStopService(final String tag) {
	    Intent intent = new Intent(getApplicationContext(), Playlist.class);
	    intent.addCategory(tag);
	    stopService(intent);
	}
	public int getSong(){
	return this.song;
}
	
	public void setSong(int s){
		this.song = s;
	}
	
}
