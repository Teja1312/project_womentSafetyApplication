package com.example.tejashree.womensafetyapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list_of_emergency extends AppCompatActivity {
    ListView numberList ;
    //ArrayAdapter adpt;
   // List<String> numbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_emergency);

       // numbers=new ArrayList<String>(Arrays.asList(
         //        "@drawable/ic_phone_black_24dp","Police 100"
        //));
       // numberList=(ListView)findViewById(R.id.numberList);
        //adpt=new ArrayAdapter(this,android.R.layout.simple_list_item_1,numbers);
        //numberList.setAdapter(adpt);
       // numberList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         //   @Override
           // public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(list_of_emergency.this,numbers.get(position), Toast.LENGTH_SHORT).show();
           // }
      //  });
    }


}
