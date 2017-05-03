package restaurentfinder.ingeniumbd.restaurentfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import restaurentfinder.ingeniumbd.restaurentfinder.Adapter.MotijilCustomAdapter;
import restaurentfinder.ingeniumbd.restaurentfinder.MotijilItemActivity.Motiji_three_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.MotijilItemActivity.Motijil_eight_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.MotijilItemActivity.Motijil_five_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.MotijilItemActivity.Motijil_four_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.MotijilItemActivity.Motijil_one_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.MotijilItemActivity.Motijil_seven_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.MotijilItemActivity.Motijil_six_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.MotijilItemActivity.Motijil_two_Activity;
import restaurentfinder.ingeniumbd.restaurentfinder.MotijilItemActivity.Motijil_zero_Activity;

public class MotijilActivity extends AppCompatActivity {

    ListView motijil_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motijil);

        Toolbar toolbar=(Toolbar)findViewById(R.id.motijil_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        motijil_list=(ListView)findViewById(R.id.motijil_list);

        String[] text={
                "Moyuri Restaurant",
                "Dhakar Khana Restaurant",
                "Gharoa Hotel and Restaurant, Motijheel",
                "Café Dilkusha",
                "Café Al-Amin Restaurant",
                "Hotel Kosturi",
                "Daruchini Restaurant",
                "Bibikhana Restaurant",
                "Al-Tazaz Bangla Restaurant",
        };

        int[] img={

                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon,
                R.drawable.custom_res_icon
        };

        MotijilCustomAdapter adapter=new MotijilCustomAdapter(this,text,img);

        motijil_list.setAdapter(adapter);

        motijil_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        startActivity(new Intent(MotijilActivity.this, Motijil_zero_Activity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MotijilActivity.this, Motijil_one_Activity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MotijilActivity.this, Motijil_two_Activity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MotijilActivity.this, Motiji_three_Activity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MotijilActivity.this, Motijil_four_Activity.class));
                        break;
                    case 5:
                        startActivity(new Intent(MotijilActivity.this, Motijil_five_Activity.class));
                        break;
                    case 6:
                        startActivity(new Intent(MotijilActivity.this, Motijil_six_Activity.class));
                        break;
                    case 7:
                        startActivity(new Intent(MotijilActivity.this, Motijil_seven_Activity.class));
                        break;
                    case 8:
                        startActivity(new Intent(MotijilActivity.this, Motijil_eight_Activity.class));
                        break;
                }

            }
        });

    }
}
