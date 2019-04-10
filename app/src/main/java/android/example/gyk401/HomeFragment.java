package android.example.gyk401;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    Button btn;
    TextView sonuc;
    EditText kilo,boy;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.home_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

         btn=(Button)getView().findViewById(R.id.hesapla);
         sonuc=(TextView)getView().findViewById(R.id.home_fragment_result_tv);
         kilo=(EditText)getView().findViewById(R.id.kilo);
         boy=(EditText)getView().findViewById(R.id.boy);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (kilo.getText().toString().length() > 0 && boy.getText().toString().length() > 0) {
                     float userWeight =  Float.parseFloat(kilo.getText().toString());
                     float userLength = Float.parseFloat(boy.getText().toString());
                     if(userLength>0) {
                         userLength = userLength / 100;
                         float result = (userWeight / ((userLength * userLength)));

                         String resultDescription = "";

                         if (result < 15) {
                             resultDescription = "Aşırı Zayıf";
                         } else if(result<19){
                             resultDescription = "Zayıf";
                         } else if (result >= 19 && result <25) {
                             resultDescription = "Normal";
                         } else if (result >= 25 && result <= 30) {
                             resultDescription = "Şimanlık Öncesi(Pre Obez)";
                         } else {
                             resultDescription = "Şişman (Obez)";
                         }

                         sonuc.setText("Vücut kitle endeksiniz: " + result + "\n" + resultDescription);
                     }

                     kilo.setText("");
                     boy.setText("");
                 }else{
                     final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                     builder.setTitle("Hata!");
                     builder.setMessage("Kilo ya da boy boş bırakılamaz.");
                     builder.setNegativeButton("TAMAM", new DialogInterface.OnClickListener(){
                         public void onClick(DialogInterface dialog, int id) {

                         }
                     });

                     builder.show();
                 }
             }
         });

    }


}
