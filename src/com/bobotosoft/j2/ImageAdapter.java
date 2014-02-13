package com.bobotosoft.j2;
import java.util.ArrayList;
 
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
 
public class ImageAdapter extends BaseAdapter {
	private static final String TAG = "ImageAdapter";
	private Context mContext;
	private GridView grid;
	// references to our images
    private Integer[] mThumbIds = {
    		R.drawable.thumb_aeropuerto, R.drawable.thumb_anillos, 
    		R.drawable.thumb_hangouts, R.drawable.thumb_ikea, 
    		R.drawable.thumb_kiss, R.drawable.thumb_kissacoxpa, 
    		R.drawable.thumb_kissbk4, R.drawable.thumb_kissvintage, 
    		R.drawable.thumb_manos, R.drawable.thumb_movilkiss, 
    		R.drawable.thumb_pzaespanya, R.drawable.thumb_selfie1, 
    		R.drawable.thumb_selfie3, R.drawable.thumb_selfie4, 
    		R.drawable.thumb_selfieacoxpa4, R.drawable.thumb_selfieacoxpa5, 
    		R.drawable.thumb_selfieacoxpabn, R.drawable.thumb_selfiebk7, 
    		R.drawable.thumb_selfiebk8, R.drawable.thumb_selfiebkj5,
    		R.drawable.thumb_selfiecadiz, R.drawable.thumb_selfiejohnnys3, 
    		R.drawable.thumb_selfiereforma1, R.drawable.thumb_trafalgar3};
    
    
	public ImageAdapter(Context c, GridView gridview) {
	    mContext = c;
	    this.grid = gridview;
	}

	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	    ImageView imageView;
	    if (convertView == null) {  // if it's not recycled, initialize some attributes
	        imageView = new ImageView(mContext);
	        imageView.setLayoutParams(new GridView.LayoutParams (300, 300));
	        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
	        imageView.setPadding(5, 5, 5, 5);
	    } else {
	        imageView = (ImageView) convertView;
	    }

	    imageView.setImageResource(mThumbIds[position]);
	    return imageView;
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.mThumbIds.length;
	}


	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return this.mThumbIds[position];
	}


	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
}
   