package com.yassir.miniprojet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView nom = (TextView)findViewById(R.id.textView);
        TextView tel = (TextView)findViewById(R.id.textView1);
        TextView email  = (TextView)findViewById(R.id.textView2);
        ImageView image   = (ImageView)findViewById(R.id.imageView);
        ImageView im   = (ImageView)findViewById(R.id.imageView1);
        Bundle b = getIntent().getExtras();
        String titre = b.getString("titre");
        String tele = b.getString("tel");
        boolean fav = b.getBoolean("fav");
        String Nom_pre = b.getString("Nom_pre");
        int avatar = b.getInt("Avatar");
        email.setText(titre);
        nom.setText(Nom_pre);
        tel.setText(tele);
        image.setImageResource(avatar);
        if(fav==true)
        {
            im.setImageResource(R.drawable.etoile_oui);
        }
        else im.setImageResource(R.drawable.etoile_non);
    }
}
