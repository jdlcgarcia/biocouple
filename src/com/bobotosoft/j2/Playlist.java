package com.bobotosoft.j2;


import java.util.Random;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class Playlist extends Service {
	private static final String TAG = "MyService";
	private static final int[] songs = {
		/*R.raw.annie_lennox__love_song_for_a_vampire,
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
		R.raw.weezer__island_in_the_sun,*/
		R.raw.zoe__labios_rotos};
	MediaPlayer player;
	
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		Log.d(TAG, "Playing!");
		Random dice =  new Random(System.currentTimeMillis());
		player = MediaPlayer.create(this, songs[dice.nextInt()]);
		player.setLooping(false); // Set looping
	}

	@Override
	public void onDestroy() {
		Toast.makeText(this, "My Service Stopped", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onDestroy");
		player.stop();
	}
	
	@Override
	public void onStart(Intent intent, int startid) {
		Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onStart");
		player.start();
	}
}