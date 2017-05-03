package restaurentfinder.ingeniumbd.restaurentfinder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import restaurentfinder.ingeniumbd.restaurentfinder.EliphentRoadActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.GulsanActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.R;

/**
 * Created by Yazdani on 3/18/2017.
 */

public class ElephantRoadCustomAdapter extends BaseAdapter {

    String[] mytext;
    int[] myimage;
    Context ct;
    private LayoutInflater inflater=null;

    public ElephantRoadCustomAdapter(EliphentRoadActivity gulsanmain, String[] text, int[] img){

        mytext=text;
        myimage=img;
        ct=gulsanmain;
        inflater=(LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return mytext.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class MyHolderGulsan{

        ImageView ctimg;
        TextView cttext;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyHolderGulsan myh=new MyHolderGulsan();
        View myview=inflater.inflate(R.layout.custom_eliphentroad_list,null);
        myh.cttext=(TextView)myview.findViewById(R.id.text_dha_xml);
        myh.ctimg=(ImageView)myview.findViewById(R.id.image_custom_dhan_xml);
        myh.cttext.setText(mytext[i]);
        myh.ctimg.setImageResource(myimage[i]);
        return myview;
    }



}
