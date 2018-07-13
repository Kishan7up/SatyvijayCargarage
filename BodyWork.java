package com.example.com.satyvijaycargarage;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import android.view.Window;
import android.view.WindowManager;
import me.relex.circleindicator.CircleIndicator;

public class BodyWork extends AppCompatActivity{
//    private static ViewPager mPager;
//        private static int currentPage = 0;
//        private static final Integer[] XMEN= {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.image11};
//        private ArrayList<Integer> XMENArray = new ArrayList<Integer>();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
//            requestWindowFeature( Window.FEATURE_NO_TITLE);
//    getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_body_work);
//            init();
        }
//        private void init() {
//            for(int i=0;i<XMEN.length;i++)
//                XMENArray.add(XMEN[i]);
//
//            mPager = (ViewPager) findViewById(R.id.pager);
//            mPager.setAdapter(new MyAdapter(BodyWork.this,XMENArray));
//            CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
//            indicator.setViewPager(mPager);
//
//            // Auto start of viewpager
//            final Handler handler = new Handler();
//            final Runnable Update = new Runnable() {
//                public void run() {
//                    if (currentPage == XMEN.length) {
//                        currentPage = 0;
//                    }
//                    mPager.setCurrentItem(currentPage++, true);
//                }
//            };
//            Timer swipeTimer = new Timer();
//            swipeTimer.schedule(new TimerTask() {
//                @Override
//                public void run() {
//                    handler.post(Update);
//                }
//            }, 2500, 2500);
//        }

}
