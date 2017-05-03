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

import restaurentfinder.ingeniumbd.restaurentfinder.Adapter.GulsanCustomAdapter;
import restaurentfinder.ingeniumbd.restaurentfinder.GulsanItemActivity.Gulsan_one_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.GulsanItemActivity.Gulsan_three_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.GulsanItemActivity.Gulsan_two_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.GulsanItemActivity.Gulsan_zero_Activity;

public class GulsanActivity extends AppCompatActivity {

    ListView gulsan_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulsan);
        Toolbar toolbar=(Toolbar)findViewById(R.id.gulsan_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gulsan_list=(ListView)findViewById(R.id.gulsan_list);

        String[] text={

                "Saffron Garden Restaurant",
                "Ruti Goshto Chaola",
                "Dhanshiri Restaurant, Gulshan",
                "Kosturi Kitchen",
        };

        int[] img={

                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,

        };

        GulsanCustomAdapter adapter=new GulsanCustomAdapter(this,text,img);
        gulsan_list.setAdapter(adapter);

        gulsan_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        startActivity(new Intent(GulsanActivity.this, Gulsan_zero_Activity.class));
                        break;
                    case 1:
                        startActivity(new Intent(GulsanActivity.this, Gulsan_one_Activity.class));
                        break;
                    case 2:
                        startActivity(new Intent(GulsanActivity.this, Gulsan_two_Activity.class));
                        break;
                    case 3:
                        startActivity(new Intent(GulsanActivity.this, Gulsan_three_Activity.class));
                        break;

                }
            }
        });


    }
}
