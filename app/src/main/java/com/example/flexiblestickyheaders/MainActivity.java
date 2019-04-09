package com.example.flexiblestickyheaders;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.IFlexible;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        createRV();
    }


    private void createRV() {
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        FlexHeader header = new FlexHeader();

        List<IFlexible> flexibles = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            flexibles.add(new FlexItem(header, new SimpleClass(i)));
        }

        FlexibleAdapter<IFlexible> adapter = new FlexibleAdapter<>(flexibles);
        adapter.showAllHeaders()
                .setDisplayHeadersAtStartUp(true)
                .setStickyHeaders(true);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}
