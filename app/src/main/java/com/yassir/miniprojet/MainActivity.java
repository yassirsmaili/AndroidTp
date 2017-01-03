package com.yassir.miniprojet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        final ArrayList<Contact> arrayList = new ArrayList<Contact>();
        arrayList.add(new Contact(1,"isma","mohammed",R.drawable.contact_m,"0641902222","med_asma@gmail.com",false));
        arrayList.add(new Contact(2,"Smaili","Yassir",R.drawable.contact_m,"0641903243","yassir.sm@gmail.com",false));
        arrayList.add(new Contact(3,"idyahia","mohammed marouan",R.drawable.contact_m2,"06419043","medmarouan@gmail.com",false));
        arrayList.add(new Contact(4,"lakhlifi","mounir",R.drawable.contact_m,"063334342","LAKHLIFI@gmail.com",false));
        arrayList.add(new Contact(5,"el maazouzi","marouan",R.drawable.contact_m,"0641903243","behja01@gmail.com",false));
        arrayList.add(new Contact(6,"mchichou","sahar",R.drawable.contact_f,"0641903243","mchicho@gmail.com",false));
        arrayList.add(new Contact(7,"cray","otman",R.drawable.contact_m2,"0641903243","cray@gmail.com",false));
        arrayList.add(new Contact(8,"agadi","najwa",R.drawable.contact_f,"0641903243","agadi@gmail.com",false));
        arrayList.add(new Contact(9,"benodifa","sara",R.drawable.contact_f2,"0641903243","beno.sm@gmail.com",false));
        arrayList.add(new Contact(10,"maourori","mohamed",R.drawable.contact_m2,"0641903243","maourori.sm@gmail.com",false));
        arrayList.add(new Contact(11,"el fakir","zakaria",R.drawable.contact_m2,"0641903243","elfakir@gmail.com",false));
        arrayList.add(new Contact(12,"lahkim","rabie",R.drawable.contact_m,"0641903243","lahkim@gmail.com",false));

        adap ad =  new adap(arrayList);
        ListView  ls = (ListView)findViewById(R.id.listview1);
        ls.setAdapter(ad);

         ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(MainActivity.this,Main2Activity.class);
                Bundle b = new Bundle();
                b.putBoolean("fav",arrayList.get(position).getFavori());
                b.putString("Nom_pre",arrayList.get(position).getNom()+""+arrayList.get(position).getPrenom());
                b.putString("tel",arrayList.get(position).getNum_tel());
                b.putInt("Avatar",arrayList.get(position).getAvatar());
                myIntent.putExtras(b);
                startActivity(myIntent);

            }
        });
    }


    class adap extends BaseAdapter{
        ArrayList<Contact> item = new ArrayList<Contact>();
        adap(ArrayList<Contact> it){
            this.item=it;
        }
        @Override
        public int getCount(){
            return item.size();
        }
        @Override
        public String getItem(int position){
            return item.get(position).getNom();
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
            img.setImageResource(item.get(i).getAvatar());
            txt.setText(item.get(i).getNom() +" "+item.get(i).getPrenom());
            return  view1;
        }

    }
}
