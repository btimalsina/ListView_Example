package com.hello.btimalsina.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hello.btimalsina.listview.adapter.MyCustomeAdapter;
import com.hello.btimalsina.listview.module.Rank;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        /*
        ArrayList<String> list = new ArrayList<>();
        list.add("England");
        list.add("Spain");
        list.add("Germany");
        list.add("Italy");
        list.add("Portugal");
        list.add("Wales");
        list.add("France");
        list.add("Turkey");
        list.add("Turkey");
        list.add("Turkey");
        list.add("Turkey");
        list.add("Turkey");
        list.add("Turkey");
        list.add("Turkey");
        list.add("Turkey");
        list.add("Turkey");
        list.add("Turkey");
*/
        //Default ArrayAdapter
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        //listView.setAdapter(adapter);

        // For Rank type

        ArrayList<Rank> list1 = new ArrayList<>();
        list1.add(new Rank("German", 1));
        list1.add(new Rank("France", 1));
        list1.add(new Rank("England", 1));
        list1.add(new Rank("German", 1));
        list1.add(new Rank("German", 1));
        list1.add(new Rank("German", 1));

        MyCustomeAdapter adapter = new MyCustomeAdapter(this, R.layout.listview, list1);
        listView.setAdapter(adapter);
    }

    public void init() {
        listView = (ListView) findViewById(R.id.listView);
    }
}
