package com.example.pankaj.listactivityproject;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;


public class MainActivity extends ListActivity {
    String item[] = {"punjab", "Hariyana", "Maharastra", "Up", "Bihar", "Rajsthan", "Jamu", "Arunachal pradesh", "Karnatada", "Udisa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ArrayAdapter<String> ad  = new ArrayAdapter<String>(MainActivity.this,R.layout.list_label,R.id.listlabel,item);
        setListAdapter(ad);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
