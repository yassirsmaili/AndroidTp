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
        TextView txtTitre = (TextView)findViewById(R.id.textView);
        TextView txtDesc  = (TextView)findViewById(R.id.textView2);
        ImageView image   = (ImageView)findViewById(R.id.imageView);
        Bundle b = getIntent().getExtras();
        String titre = b.getString("titre");
        String desc = b.getString("description");
        int img = b.getInt("image");
        txtTitre.setText(titre);
        txtDesc.setText(desc);
        image.setImageResource(img);
    }
}
