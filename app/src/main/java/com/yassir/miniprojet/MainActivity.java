package com.yassir.miniprojet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<ImageDesc> arrayList = new ArrayList<ImageDesc>();
        arrayList.add(new ImageDesc(1,"Ismag","institut ismag bla bla bla bla bla",R.drawable.ismag));
        arrayList.add(new ImageDesc(2,"Android","Android  etc........",R.drawable.android));
        adap ad =  new adap(arrayList);
        ListView  ls = (ListView)findViewById(R.id.listview1);
        ls.setAdapter(ad);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(MainActivity.this,Main2Activity.class);
                Bundle b = new Bundle();
                b.putString("titre",arrayList.get(position).getTitre());
                b.putString("description",arrayList.get(position).getDescription());
                b.putInt("image",arrayList.get(position).getImage());
                myIntent.putExtras(b);
                startActivity(myIntent);

            }
        });
    }
    class adap extends BaseAdapter{
        ArrayList<ImageDesc> item = new ArrayList<ImageDesc>();
        adap(ArrayList<ImageDesc> it){
            this.item=it;
        }
        @Override
        public int getCount(){
            return item.size();
        }
        @Override
        public String getItem(int position){
            return item.get(position).getTitre();
        }
        @Override
        public long getItemId(int position){
            return item.get(position).getId();

        }
        @Override
        public View getView(int i , View view, ViewGroup viewGroup){
            LayoutInflater inflater = getLayoutInflater();
            View view1 = inflater.inflate(R.layout.ligne,null);
            ImageView img = (ImageView)view1.findViewById(R.id.img);
            TextView txt = (TextView)view1.findViewById(R.id.txt);
            img.setImageResource(item.get(i).getImage());
            txt.setText(item.get(i).getTitre());
            return  view1;
        }

    }
}
