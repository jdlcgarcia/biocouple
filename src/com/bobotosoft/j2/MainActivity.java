package com.bobotosoft.j2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent music = new Intent(this, Playlist.class);
		startService(music);
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
																					// TODO
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
}
