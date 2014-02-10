package com.bobotosoft.j2;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MapActivity extends Activity {
	private GoogleMap mMap;
	private static final LatLng BARCELONA = new LatLng(41.389662, 2.176603);
	private static final LatLng CADIZ = new LatLng(36.524288, -6.286204);
	 
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		
		mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mMap.addMarker(new MarkerOptions()
		        .position(BARCELONA)
		        .title("Hello world")
		        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_favorite)));
		mMap.addMarker(new MarkerOptions()
        .position(CADIZ)
        .title("Hello world")
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_favorite)));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
		return true;
	}

}
