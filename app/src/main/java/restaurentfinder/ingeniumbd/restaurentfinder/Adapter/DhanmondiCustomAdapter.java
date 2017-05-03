package restaurentfinder.ingeniumbd.restaurentfinder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import restaurentfinder.ingeniumbd.restaurentfinder.DhanmondiActivity;
import restaurentfinder.ingeniumbd.restaurentfinder.R;

/**
 * Created by Yazdani on 3/16/2017.
 */

public class DhanmondiCustomAdapter extends BaseAdapter {

  String[] mytext;
  int[] myimage;
    Context ct;
    private static LayoutInflater inflater=null;

    public DhanmondiCustomAdapter(DhanmondiActivity dhanct, String[] text, int[] img){

        ct=dhanct;
        mytext=text;
        myimage=img;
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

    public class DhanmondiHolder{
        ImageView ctimg;
        TextView cttext;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        DhanmondiHolder mydb=new DhanmondiHolder();

        View myview=inflater.inflate(R.layout.custom_restaurent_list,null);

        mydb.cttext=(TextView)myview.findViewById(R.id.text_dha_xml);
        mydb.ctimg=(ImageView)myview.findViewById(R.id.image_custom_dhan_xml);

        mydb.cttext.setText(mytext[i]);
        mydb.ctimg.setImageResource(myimage[i]);

        return myview;
    }
}
