package com.bobotosoft.j2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MusicActivity extends Activity  {
	MediaPlayer player;
	private static final int[] songs = {
		R.raw.annie_lennox__love_song_for_a_vampire/*,
		R.raw.beatles_good_day_sunshine,
		R.raw.blur__coffee_and_tv,
		R.raw.cafe_tacvba__eres,
		R.raw.carla_morrison__eres_tu,
		R.raw.chetes__querer,
		R.raw.europe__superstitious,
		R.raw.fobia__me_siento_vivo,
		R.raw.fobia__vivo_,
		R.raw.george_harrison_and_bob_dylan__if_not_for_you,
		R.raw.guns_n_roses__sweet_child_o_mine,
		R.raw.john_lennon__real_love,
		R.raw.kings_of_leon__pyro,
		R.raw.lana_del_rey__video_games,
		R.raw.leon_larregui__brillas,
		R.raw.leon_larregui__carmin,
		R.raw.meat_loaf__id_do_anything_for_love,
		R.raw.mika__grace_kelly,
		R.raw.mike_oldfield_islands,
		R.raw.muse__blackout,
		R.raw.muse__feeling_good,
		R.raw.muse__follow_me,
		R.raw.muse__space_dementia,
		R.raw.paul_mccartney__every_night,
		R.raw.paul_mccartney__little_willow,
		R.raw.queen__breakthru,
		R.raw.radiohead__true_love_waits,
		R.raw.scorpions__no_one_like_you,
		R.raw.scorpions__you_and_i,
		R.raw.semisonic__secret_smile,
		R.raw.snow_patrol__run,
		R.raw.stratovarius__forever,
		R.raw.susana_zabaleta_y_ofcm__contigo_en_la_distancia,
		R.raw.the_beatles__birthday,
		R.raw.the_beatles__it_wont_be_long,
		R.raw.the_beatles__something,
		R.raw.the_cure__lovesong,
		R.raw.the_cure__pictures_of_you,
		R.raw.the_killers__here_with_me,
		R.raw.the_smashing_pumpkins__ava_adore,
		R.raw.the_smashing_pumpkins__stand_inside_your_love,
		R.raw.the_xx__angels,
		R.raw.travis__flowers_in_the_window,
		R.raw.van_morrison__brown_eyed_girl,
		R.raw.visita__enjambre,
		R.raw.weezer__island_in_the_sun,
		R.raw.zoe__labios_rotos*/};
	private static final String TAG = "MusicActivity";
	ArrayList<String> playlist;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_music);
		playlist = new ArrayList<String>();
		playlist.add("annie lennox - love song for a vampire");
		/*playlist.add("beatles - good day sunshine");
		playlist.add("blur - coffee and tv");
		playlist.add("cafe tacvba - eres");
		playlist.add("carla morrison - eres tu");
		playlist.add("chetes - querer");
		playlist.add("europe - superstitious");
		playlist.add("fobia - me siento vivo");
		playlist.add("fobia - vivo ");
		playlist.add("george harrison and bob dylan - if not for you");
		playlist.add("guns n roses - sweet child o mine");
		playlist.add("john lennon - real love");
		playlist.add("kings of leon - pyro");
		playlist.add("lana del rey - video games");
		playlist.add("leon larregui - brillas");
		playlist.add("leon larregui - carmin");
		playlist.add("meat loaf - id do anything for love");
		playlist.add("mika - grace kelly");
		playlist.add("mike oldfield - islands");
		playlist.add("muse - blackout");
		playlist.add("muse - feeling good");
		playlist.add("muse - follow me");
		playlist.add("muse - space dementia");
		playlist.add("paul mccartney - every night");
		playlist.add("paul mccartney - little willow");
		playlist.add("queen - breakthru");
		playlist.add("radiohead - true love waits");
		playlist.add("scorpions - no one like you");
		playlist.add("scorpions - you and i");
		playlist.add("semisonic - secret smile");
		playlist.add("snow patrol - run");
		playlist.add("stratovarius - forever");
		playlist.add("susana zabaleta y ofcm - contigo en la distancia");
		playlist.add("the beatles - birthday");
		playlist.add("the beatles - it wont be long");
		playlist.add("the beatles - something");
		playlist.add("the cure - lovesong");
		playlist.add("the cure - pictures of you");
		playlist.add("the killers - here with me");
		playlist.add("the smashing pumpkins - ava adore");
		playlist.add("the smashing pumpkins - stand inside your love");
		playlist.add("the xx - angels");
		playlist.add("travis - flowers in the window");
		playlist.add("van morrison - brown eyed girl");
		playlist.add("visita - enjambre");
		playlist.add("weezer - island in the sun");
		playlist.add("zoe - labios rotos");*/

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, playlist);
		ListView canciones = (ListView) findViewById(R.id.lvCanciones);
		canciones.setAdapter(adapter);
		player.create(getApplicationContext(), R.raw.annie_lennox__love_song_for_a_vampire);
		
		canciones.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			   public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
			     long arg3) {
				playnext(player,arg2);
		        
			   }  });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.music, menu);
		return true;
	}
	
	
	private void playnext(MediaPlayer mp, int i)
    {
    	
    	AssetFileDescriptor afd = getApplicationContext().getResources().openRawResourceFd(songs[i]);
    	try
        {   
    		if(mp != null)
    			mp.reset();
    		mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getDeclaredLength());
    		mp.prepare();
    		mp.start();
            afd.close();
        }
        catch (IllegalArgumentException e)
        {
            Log.e(TAG, "Unable to play audio queue do to exception: " + e.getMessage(), e);
        }
        catch (IllegalStateException e)
        {
            Log.e(TAG, "Unable to play audio queue do to exception: " + e.getMessage(), e);
        }
        catch (IOException e)
        {
            Log.e(TAG, "Unable to play audio queue do to exception: " + e.getMessage(), e);
        }
    	catch (Exception e)
    	{
    		Log.e(TAG, "Other exception: " + e.getMessage(), e);
        }
    }

}
