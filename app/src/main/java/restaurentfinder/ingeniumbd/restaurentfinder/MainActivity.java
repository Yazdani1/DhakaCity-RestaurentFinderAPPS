package restaurentfinder.ingeniumbd.restaurentfinder;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    Button dhanmondi;
    Button uttara;
    Button mirpur;
    Button gulsan;
    Button khilgaw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title);

        dhanmondi=(Button)findViewById(R.id.dhanmondi_btn);
        uttara=(Button)findViewById(R.id.Uttara_btn);
        mirpur=(Button)findViewById(R.id.Mirpur_btn);
        gulsan=(Button)findViewById(R.id.Gulsan_btn);
        khilgaw=(Button)findViewById(R.id.Khilgaon_btn);


        dhanmondi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,DhanmondiActivity.class);
                startActivity(intent);
            }
        });



        uttara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,UttaraActivity.class);
                startActivity(intent);
            }
        });



        mirpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MotijilActivity.class);
                startActivity(intent);

            }
        });

        gulsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,GulsanActivity.class);
                startActivity(intent);

            }
        });


        khilgaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,EliphentRoadActivity.class);
                startActivity(intent);

            }
        });


    }
}
