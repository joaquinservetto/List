package com.fragments.joaqu.list;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.fragments.joaqu.list.R.id.parent;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    private class Innerclass extends ArrayAdapter<Estudiante>{

        public Innerclass(){
            super(MainActivity.this,R.layout.intemdelista);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView==null){
                convertView= getLayoutInflater().inflate(position,parent,false);
            }
            return super.getView(position, convertView, parent);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView)findViewById(R.id.list);
        String[] values =new String[]{"dato1","dato2"};

        ArrayList<Estudiante> e= new ArrayList<>();
        Estudiante e1 = new Estudiante("CEDULA1","nombre1","apellido1");
        Estudiante e2 = new Estudiante("CEDULA2","nombre2","apellido2");
        Estudiante e3 = new Estudiante("CEDULA3","nombre3","apellido3");
        e.add(e1);
        e.add(e2);
        e.add(e3);

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnClickListener(new AdapterView.OnItemClickListener()){
            @Override
            public void OnItemClick(AdapterView<?>parent, View view,int position, long id){
        });

    }
}
