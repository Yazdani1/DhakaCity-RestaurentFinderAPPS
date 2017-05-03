package restaurentfinder.ingeniumbd.restaurentfinder;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import restaurentfinder.ingeniumbd.restaurentfinder.Adapter.DhanmondiCustomAdapter;
import restaurentfinder.ingeniumbd.restaurentfinder.DhanmondiItemActivity.FiveActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.DhanmondiItemActivity.FourActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.DhanmondiItemActivity.OneActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.DhanmondiItemActivity.SixActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.DhanmondiItemActivity.ThreeActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.DhanmondiItemActivity.TwoActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.DhanmondiItemActivity.ZeroActivity;

public class DhanmondiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhanmondi);

        Toolbar toolbar=(Toolbar)findViewById(R.id.dhanmondi_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Dhanmondi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        ListView lst=(ListView)findViewById(R.id.list_dhanmondi_xml);


        String[] text={
                "Boishakh Bangla Restaurant",
                "Baburchi Restaurant",
                "Dhanshiri Restaurant, Dhanmondi",
                "Korai Gost Restaurant",
                "Ahaar Restaurant",
                "Al-Beik Restaurant",
                "Manancho Restaurant",

        };

        int[] img={

                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,

        };


        DhanmondiCustomAdapter adapter=new DhanmondiCustomAdapter(this,text,img);

        lst.setAdapter(adapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        startActivity(new Intent(DhanmondiActivity.this, ZeroActivity.class));
                        break;

                    case 1:
                        startActivity(new Intent(DhanmondiActivity.this, OneActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(DhanmondiActivity.this, TwoActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(DhanmondiActivity.this, ThreeActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(DhanmondiActivity.this, FourActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(DhanmondiActivity.this, FiveActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(DhanmondiActivity.this, SixActivity.class));
                        break;

                }
            }
        });


    }
}
