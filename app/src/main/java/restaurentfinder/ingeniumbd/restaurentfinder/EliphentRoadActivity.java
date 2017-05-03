package restaurentfinder.ingeniumbd.restaurentfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import restaurentfinder.ingeniumbd.restaurentfinder.Adapter.ElephantRoadCustomAdapter;
import restaurentfinder.ingeniumbd.restaurentfinder.EliphentRoadItemActivity.Eliphent_one_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.EliphentRoadItemActivity.Eliphent_zero_Activity;

public class EliphentRoadActivity extends AppCompatActivity {

    ListView eliphent_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliphent_road);
        Toolbar toolbar=(Toolbar)findViewById(R.id.eliphent_road_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        eliphent_list=(ListView)findViewById(R.id.eliphent_road_list);

        String[] text={
                "Osto Banjon Restaurant",
                "Ghorowa Hotel and Restaurant, Elephant Road"
        };

        int[] img={
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon
        };

        ElephantRoadCustomAdapter adapter=new ElephantRoadCustomAdapter(this,text,img);
        eliphent_list.setAdapter(adapter);

        eliphent_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        startActivity(new Intent(EliphentRoadActivity.this, Eliphent_zero_Activity.class));
                        break;
                    case 1:
                        startActivity(new Intent(EliphentRoadActivity.this, Eliphent_one_Activity.class));
                        break;
                }
            }
        });

    }
}
