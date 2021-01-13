package com.linda.insta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private RecyclerView rvTop;
    private  RecyclerView rvContent;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTop = findViewById(R.id.rv_top);
        rvContent = findViewById(R.id.rv_content);

        TopInstaAdapter topInstaAdapter = new TopInstaAdapter();
        //실제로는 onCreate로 만들어 주는데
        //외부에서 다운받아서 하려면 쓰레드 만들어서 함.
        topInstaAdapter.addItem(new TopInsta("hori", R.drawable.hori));
        topInstaAdapter.addItem(new TopInsta("corgies", R.drawable.corgies));
        topInstaAdapter.addItem(new TopInsta("terri", R.drawable.terri));
        topInstaAdapter.addItem(new TopInsta("jeju", R.drawable.jeju));
        topInstaAdapter.addItem(new TopInsta("welshi", R.drawable.welshi));
        topInstaAdapter.addItem(new TopInsta("pomerian", R.drawable.pome));
        topInstaAdapter.addItem(new TopInsta("harry", R.drawable.harry));


        rvTop.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        rvTop.setAdapter(topInstaAdapter);


        ContentInstaAdapter contentInstaAdapter = new ContentInstaAdapter();
        contentInstaAdapter.addItem(new ContentInsta(R.drawable.hori));
        contentInstaAdapter.addItem(new ContentInsta(R.drawable.corgies));
        contentInstaAdapter.addItem(new ContentInsta(R.drawable.terri));
        contentInstaAdapter.addItem(new ContentInsta(R.drawable.jeju));

        rvContent.setLayoutManager(new LinearLayoutManager(this));
        rvContent.setAdapter(contentInstaAdapter);
    }
}