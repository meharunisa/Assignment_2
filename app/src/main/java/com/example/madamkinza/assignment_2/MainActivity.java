package com.example.madamkinza.assignment_2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private List<Contact> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ContactAdapter mAdapter;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new ContactAdapter(contactList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        prepareContactData();
    }

    private void prepareContactData() {

        for (int i = 0; i < 1000; i++) {
            contactList.add(new Contact(i, "mehar  " + i, "Email " + i, "09886756" + i));
        }
        mAdapter.notifyDataSetChanged();
    }
}

}
