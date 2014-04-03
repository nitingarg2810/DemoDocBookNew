package patientmanagementsystem.demodocbook;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	
	MediaPlayer song;
	
	@Override
	protected void onCreate(Bundle SplashBack) {
		// TODO Auto-generated method stub
		super.onCreate(SplashBack);
		setContentView(R.layout.splash);
		song = MediaPlayer.create(Splash.this, R.raw.start);
		song.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openSplash = new Intent("patientmanagementsystem.demodocbook.MAINACTIVITY");
					startActivity(openSplash);
					finish();
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.release();
		finish();
	}
	
	
	
}
