package com.example.com.satyvijaycargarage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class HomePage extends AppCompatActivity {
LinearLayout l1,l2,l3,l4,l5,l6;
CardView c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
//        requestWindowFeature( Window.FEATURE_NO_TITLE);
//        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView ( R.layout.activity_home_page );
        c1=(CardView)findViewById ( R.id.c1 );
        c2=(CardView)findViewById ( R.id.c2 );
        c3=(CardView)findViewById ( R.id.c3 );
        c4=(CardView)findViewById ( R.id.c4 );
        c5=(CardView)findViewById ( R.id.c5 );
        c6=(CardView)findViewById ( R.id.c6 );

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent a=new Intent ( HomePage.this, BodyWork.class);
              startActivity ( a );
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent ( HomePage.this, EngineWork.class);
                startActivity ( b );
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent ( HomePage.this, PaintingWork.class);
                startActivity ( c );
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent ( HomePage.this, ElectricWork.class);
                startActivity ( d );
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e=new Intent ( HomePage.this, InsuranceWork.class);
                startActivity ( e );
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent ( HomePage.this, AboutUs.class);
                startActivity ( f );
            }
        });
    }
}
