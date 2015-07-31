package com.example.pankaj.listactivityproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Pankaj on 7/31/2015.
 */
public class CustomList extends Activity {
    String item[] = {"punjab", "Hariyana", "Maharastra", "Up", "Bihar", "Rajsthan", "Jamu", "Arunachal pradesh", "Karnatada", "Udisa"};
    ListView mlListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list);
        mlListView = (ListView) findViewById(R.id.mylist);
        MyCustomListAdapter ad = new MyCustomListAdapter(CustomList.this, item);
        mlListView.setAdapter(ad);
    }
}
