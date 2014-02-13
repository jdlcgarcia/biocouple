package com.bobotosoft.j2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Fullpic extends Activity{
	private Integer[] mIds = {
			R.drawable.aeropuerto, R.drawable.anillos, 
    		R.drawable.hangouts, R.drawable.ikea, 
    		R.drawable.kiss, R.drawable.kissacoxpa, 
    		R.drawable.kissbk4, R.drawable.kissvintage, 
    		R.drawable.manos, R.drawable.movilkiss, 
    		R.drawable.pzaespanya, R.drawable.selfie1, 
    		R.drawable.selfie3, R.drawable.selfie4, 
    		R.drawable.selfieacoxpa4, R.drawable.selfieacoxpa5, 
    		R.drawable.selfieacoxpabn, R.drawable.selfiebk7, 
    		R.drawable.selfiebk8, R.drawable.selfiebkj5,
    		R.drawable.selfiecadiz, R.drawable.selfiejohnnys3, 
    		R.drawable.selfiereforma1, R.drawable.trafalgar3};
	
	private String[] mPies = {
			"Nuestra primera foto juntos de nuestro (por ahora) último set", 
			"Alianzas sin firma pero con compromiso de respeto y longevidad", 
            "Nuestro día a día", 
            "Comprando cositas para nuestra primera casa juntos", 
            "R.drawable.kiss", 
            "R.drawable.kissacoxpa", 
            "R.drawable.kissbk4", 
            "R.drawable.kissvintage", 
            "Cuando agarro tu mano, siento como si estuviera en el cielo", 
            "Cada uno pasa la ausencia como puede", 
            "Desde las alturas, construyendo recuerdos", 
            "R.drawable.selfie1", 
            "R.drawable.selfie3", 
            "R.drawable.selfie4", 
            "R.drawable.selfieacoxpa4", 
            "R.drawable.selfieacoxpa5", 
            "R.drawable.selfieacoxpabn", 
            "R.drawable.selfiebk7", 
            "R.drawable.selfiebk8", 
            "R.drawable.selfiebkj5",
            "La luz de Cádiz te sienta muy bien, just sayin'...", 
            "R.drawable.selfiejohnnys3", 
            "R.drawable.selfiereforma1", 
            "Nuestro primer cuarto y tus selfies de pareja"};
	
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.fullpic);
	    
	    int pic = getIntent().getExtras().getInt("img");
	    ImageView img = (ImageView)findViewById(R.id.ivPic); 
	    img.setImageResource(mIds[pic]);
	    
	    TextView txt = (TextView)findViewById(R.id.tvPieFoto); 
	    txt.setText(mPies[pic]);

	    
	}

}
