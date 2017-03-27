package com.arturopacheco.md;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout srl;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srl = (SwipeRefreshLayout) findViewById(R.id.srl);
        lv = (ListView) findViewById(R.id.lv);

        String[] meses = new String[]
                {
                        "Enero","Febrero","Marzo","Abril"
                };
        lv.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,meses));
        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                RefreshContent();
            }
        });
    }

    public void RefreshContent(){

        String[] meses2 = new String[]{
                "Mayo","Junio","Julio"
        };
        lv.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1,meses2));
        srl.setRefreshing(false);
    }
}
