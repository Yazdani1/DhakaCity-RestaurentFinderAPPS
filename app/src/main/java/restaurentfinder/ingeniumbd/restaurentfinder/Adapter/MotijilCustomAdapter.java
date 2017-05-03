package restaurentfinder.ingeniumbd.restaurentfinder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import restaurentfinder.ingeniumbd.restaurentfinder.MotijilActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.R;

/**
 * Created by Yazdani on 3/18/2017.
 */

public class MotijilCustomAdapter extends BaseAdapter {

    String[] MYTEXT;
    int[] myimage;
    Context ct;

    public   LayoutInflater inflater=null;

    public MotijilCustomAdapter(MotijilActivity mtmain, String[] text, int[] img){

        MYTEXT=text;
        myimage=img;
        ct=mtmain;
        inflater=(LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return MYTEXT.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class MyHolderMot{

        ImageView ctimage;
        TextView cttext;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        MyHolderMot myhmot=new MyHolderMot();

        View myview=inflater.inflate(R.layout.motijil_custom_list,null);

        myhmot.cttext=(TextView)myview.findViewById(R.id.text_dha_xml);
        myhmot.ctimage=(ImageView)myview.findViewById(R.id.image_custom_dhan_xml);

        myhmot.cttext.setText(MYTEXT[i]);
        myhmot.ctimage.setImageResource(myimage[i]);

        return myview;
    }



}
