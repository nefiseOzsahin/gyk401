package android.example.gyk401;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class DietAdapter extends BaseAdapter {

    Context context;
    List<Diet> diyetListesi;

    public DietAdapter(Context context, List<Diet> diyetListesi) {
        this.context = context;
        this.diyetListesi = diyetListesi;
    }

    @Override
    public int getCount() {
        return diyetListesi.size();
    }

    @Override
    public Object getItem(int position) {
        return diyetListesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=View.inflate(context,R.layout.diet_satir,null);
        ImageView yiyecekİmage=(ImageView)v.findViewById(R.id.yiyecekImage);
        TextView yiycekler=(TextView)v.findViewById(R.id.yiyecekler);
        TextView kalori=(TextView)v.findViewById(R.id.kalori);

        yiyecekİmage.setImageResource(diyetListesi.get(position).getImageId());
        yiycekler.setText(diyetListesi.get(position).getYiyecekAdi());
        kalori.setText(diyetListesi.get(position).getCalori());

        return v;
    }
}
