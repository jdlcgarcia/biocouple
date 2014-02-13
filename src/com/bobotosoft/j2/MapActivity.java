package com.bobotosoft.j2;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.Menu;

public class MapActivity extends Activity {
	private GoogleMap mMap;
	/* BARCELONA */
	private static final LatLng AEROPUERTOPRAT = new LatLng(41.303187, 2.077146);
	private static final LatLng TRAFALGAR29 = new LatLng(41.389586, 2.176716);
	private static final LatLng SAGRADAFAMILIA = new LatLng(41.403571, 2.174472);
	private static final LatLng BARCELONETA = new LatLng(41.377142, 2.192860);
	private static final LatLng LASAGRERA = new LatLng(41.395192, 2.161887);
	private static final LatLng PARCGUELL = new LatLng(41.413787, 2.152759);
	private static final LatLng REQUESENS3 = new LatLng(41.379747, 2.164096);
	private static final LatLng AQUARIUM = new LatLng(41.376851, 2.184390);
	LatLng BARCELONA[] = { AEROPUERTOPRAT, TRAFALGAR29, SAGRADAFAMILIA,
			BARCELONETA, LASAGRERA, PARCGUELL, REQUESENS3, AQUARIUM };
	String BARCELONATITLE[] = { "Aeropuerto del Prat", "C/ Trafalgar, 29",
			"Sagrada Familia", "Espigón de la Barceloneta", "La Sagrera",
			"Parc Güell", "C/ Requesens, 3", "Acuario de Barcelona" };
	String BARCELONADESC[] = {
			"El lugar donde nos vimos en persona por primera vez",
			"Nuestro primer nidito, aunque fuera sólo una habitación",
			"Un bonito lugar compartido contigo",
			"Un lugar muy especial para una noche muy especial",
			"Un tarde improvisada y divertidisima pasamos allí",
			"Lugar de picnics, paseos, fotos...",
			"Nuestra primera casa solo para ti y para mi",
			"Donde te pude ver disfrutar como una niña" };

	/* CÁDIZ */
	private static final LatLng AEROPUERTOJEREZ = new LatLng(36.744444,
			-6.060000);
	private static final LatLng MICASA = new LatLng(36.524288, -6.286204);
	private static final LatLng SANTABARBARA = new LatLng(36.536621, -6.30486);
	private static final LatLng JEREZ = new LatLng(36.682178, -6.141336);
	private static final LatLng CASAALI = new LatLng(36.453206, -6.124879);
	private static final LatLng MERCADO = new LatLng(36.530441, -6.298193);
	LatLng CADIZ[] = { AEROPUERTOJEREZ, MICASA, SANTABARBARA, JEREZ, CASAALI,
			MERCADO };
	String CADIZTITLE[] = { "Aeropuerto de Jerez", "C/ Acacias, 8",
			"Paseo de Santa Bárbara", "Jerez", "Casa de Ali",
			"Mercado de Abastos"};
	String CADIZDESC[] = {
			"A conocer a los suegros!",
			"Mi casa es tu casa, al menos de vacaciones",
			"Puestas de sol al pie del mar",
			"Mucho calor, mucho andar pero una buena tarde",
			"Fiesta de piscina-presentación en sociedad",
			"Pintoresco y lleno de cosas ricas!"
			};

	/* MÉXICO DF */
	private static final LatLng AEROPUERTODF = new LatLng(19.436111, -99.071944);
	private static final LatLng COYOACAN = new LatLng(19.349126, -99.163498);
	private static final LatLng TUCASA = new LatLng(19.291461, -99.116475);
	private static final LatLng CENTROTLALPAN = new LatLng(19.288746, -99.166979);
	private static final LatLng TEMPLOMAYOR = new LatLng(19.434604, -99.131881);
	private static final LatLng XOCHIMILCO = new LatLng(19.2503637, -99.0910849);
	LatLng MEXICO[] = { AEROPUERTODF, COYOACAN, TUCASA, CENTROTLALPAN,
			TEMPLOMAYOR, XOCHIMILCO };
	String MEXICOTITLE[] = { "Aeropuerto Juarez Internacional", "Coyoacán",
			"C/ Tenorios, 289", "Centro de Tlalpan", "Templo Mayor",
			"Xochimilco"};
	String MEXICODESC[] = {
			"Donde te volvi a ver... y conocí a tus padres!",
			"Noches de gorditas y leyendas",
			"Tu casa, donde me hiciste un lugar para vivir",
			"Más comida y bailes y regalitos",
			"Impresionantes restos que me ilusionaron",
			"Una buena jornada de trajineras y risas"
			};

	/* OTROS */
	private static final LatLng AEROPUERTOMADRID = new LatLng(40.463783,
			-3.570558);
	LatLng OTROS[] = { AEROPUERTOMADRID };
	String OTROSTITLE[] = { "Aeropuerto de Madrid"};
	String OTROSDESC[] = {
			"Te recogí para empezar nuestra vida juntos"
			};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);

		mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();
		for (int i = 0; i < BARCELONA.length; i++) {
			mMap.addMarker(new MarkerOptions()
					.position(BARCELONA[i])
					.title(BARCELONATITLE[i])
					.snippet(BARCELONADESC[i])
					.icon(BitmapDescriptorFactory
							.fromResource(R.drawable.ic_action_favorite)));
		}
		for (int i = 0; i < CADIZ.length; i++) {
			mMap.addMarker(new MarkerOptions()
					.position(CADIZ[i])
					.title(CADIZTITLE[i])
					.snippet(CADIZDESC[i])
					.icon(BitmapDescriptorFactory
							.fromResource(R.drawable.ic_action_favorite)));
		}
		for (int i = 0; i < MEXICO.length; i++) {
			mMap.addMarker(new MarkerOptions()
					.position(MEXICO[i])
					.title(MEXICOTITLE[i])
					.snippet(MEXICODESC[i])
					.icon(BitmapDescriptorFactory
							.fromResource(R.drawable.ic_action_favorite)));
		}
		for (int i = 0; i < OTROS.length; i++) {
			mMap.addMarker(new MarkerOptions()
					.position(OTROS[i])
					.title(OTROSTITLE[i])
					.snippet(OTROSDESC[i])
					.icon(BitmapDescriptorFactory
							.fromResource(R.drawable.ic_action_favorite)));
		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
		return true;
	}

}
