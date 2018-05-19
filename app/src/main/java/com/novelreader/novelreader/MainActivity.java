package com.novelreader.novelreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.novelreader.novelreader.FileShareModule.FileShareActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShareFile=(Button)findViewById(R.id.btnShareFile);
        btnShareFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FileShareActivity.class);
                startActivity(intent);
            }
        });

        Button btnDownload=(Button)findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownLoad myDownLoad=new DownLoad();
                //Log.i("分界线","分界线");
                ArrayList<String[] > arrayListA= new ArrayList<>();
                String []arrayList=myDownLoad.PartDownLoad("https://www.gxwztv.com/28/28945/","第4章 把工资结给我");
                int c=1;
                //Log.i("分界线1","分界线1");
                for(String  a:arrayList){
                    Log.e("这本书的一行",a);
                }

            }
        });
    }
}
