package restaurentfinder.ingeniumbd.restaurentfinder;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import restaurentfinder.ingeniumbd.restaurentfinder.Adapter.DhanmondiCustomAdapter;
import restaurentfinder.ingeniumbd.restaurentfinder.Adapter.UttaraCustomAdapter;
import restaurentfinder.ingeniumbd.restaurentfinder.DhanmondiItemActivity.ZeroActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.UttaraItemActivity.UtThreeActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.UttaraItemActivity.UtoneActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.UttaraItemActivity.UttwoActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.UttaraItemActivity.UtzeroActivity;

public class UttaraActivity extends AppCompatActivity {

    ListView list_uttara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttara);
        list_uttara=(ListView)findViewById(R.id.uttara_list);

        Toolbar toolbar=(Toolbar)findViewById(R.id.uttara_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] text={

                "Ranna Ghor Restaurant",
                "Rasona Bilas Restaurant",
                "New Khajana Restaurant and Kabab Ghor",
                "Curry in Harry Restaurant"
        };

        int[] img={

                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon
        };
        UttaraCustomAdapter adapter=new UttaraCustomAdapter(this,text,img);

        list_uttara.setAdapter(adapter);


        list_uttara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){

                    case 0:
                        startActivity(new Intent(UttaraActivity.this, UtzeroActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(UttaraActivity.this, UtoneActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(UttaraActivity.this, UttwoActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(UttaraActivity.this, UtThreeActivity.class));

                        break;

                }

            }
        });



    }
}
