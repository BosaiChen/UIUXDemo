package cooluiux.demo.com.uiuxdemo;

import android.animation.ValueAnimator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AccelerateDecelerateInterpolator;

import java.util.Timer;
import java.util.TimerTask;

import cooluiux.demo.com.uiuxdemo.widget.ArcProgress;


public class MainActivity extends ActionBarActivity {

    ArcProgress mArcProgress;
    Timer mTimer;
    ValueAnimator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArcProgress = (ArcProgress) findViewById(R.id.arc_progress);

        //use Timer
        /*mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mArcProgress.setProgress(mArcProgress.getProgress() + 1);
                    }
                });
            }
        }, 1000, 100);*/

        //use ValueAnimator
        /*ValueAnimator animator = ValueAnimator.ofInt(0, 100);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int currentValue = (int)valueAnimator.getAnimatedValue();
                mArcProgress.setProgress(currentValue);
            }
        });

        animator.setTarget(mArcProgress);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.setDuration(5000);
        animator.setRepeatCount(3);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.start();*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        mTimer.cancel();
//        mAnimator.cancel();
    }
}
