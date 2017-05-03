package restaurentfinder.ingeniumbd.restaurentfinder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import restaurentfinder.ingeniumbd.restaurentfinder.R;
import restaurentfinder.ingeniumbd.restaurentfinder.UttaraActivity;

/**
 * Created by Yazdani on 3/18/2017.
 */

public class UttaraCustomAdapter extends BaseAdapter {

    String[] mytext;
    int[] myimage;

    Context ct;

    public static LayoutInflater inflater=null;


    public UttaraCustomAdapter(UttaraActivity utmain, String[] text, int[] img){

        mytext=text;
        myimage=img;
        ct=utmain;
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

    public class MyHolderUttara{

        ImageView ctimg;
        TextView cttext;

    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        MyHolderUttara myhut=new MyHolderUttara();

        View myview=inflater.inflate(R.layout.cusrestaurent_uttara_custom,null);

        myhut.cttext=(TextView)myview.findViewById(R.id.text_dha_xml);
        myhut.ctimg=(ImageView)myview.findViewById(R.id.image_custom_dhan_xml);
        myhut.cttext.setText(mytext[i]);
        myhut.ctimg.setImageResource(myimage[i]);
        return myview;
    }


}
