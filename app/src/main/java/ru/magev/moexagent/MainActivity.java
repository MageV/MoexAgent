package ru.magev.moexagent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void intRecyclerView()
    {
        rcView=findViewById(R.id.recycleMainView);
        rcView.setLayoutManager(new LinearLayoutManager(this));
    }
}
