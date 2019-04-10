package android.example.gyk401;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DietListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.diet_fragment,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<Diet> diyetListesi=new ArrayList<>();

        diyetListesi.add(new Diet(R.drawable.ic_favorite_black_24dp,"Yumurta,peynir,zeytin","5000k"));
        diyetListesi.add(new Diet(R.drawable.ic_favorite_black_24dp,"yeşillik,salata,zeytin","3000k"));
        diyetListesi.add(new Diet(R.drawable.ic_favorite_black_24dp,"badem,fıstık,ceviz","8000k"));
        diyetListesi.add(new Diet(R.drawable.ic_favorite_black_24dp,"kivi,çilek,muz","3000k"));

        DietAdapter adapter=new DietAdapter(getActivity(),diyetListesi);
        ListView liste=(ListView) getView().findViewById(R.id.liste);
        liste.setAdapter(adapter);

    }
}
