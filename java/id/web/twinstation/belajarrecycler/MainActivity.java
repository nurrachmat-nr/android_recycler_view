package id.web.twinstation.belajarrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewGuppy;
    private ArrayList<Guppy> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewGuppy = findViewById(R.id.rv_guppies);
        recyclerViewGuppy.setHasFixedSize(true);

        list.addAll(GuppiesData.getListIkan());
        showRecyclerList();
    }

    private void showRecyclerList(){
        recyclerViewGuppy.setLayoutManager(new LinearLayoutManager(this));
        CardViewGuppyAdapter cardViewGuppyAdapter = new CardViewGuppyAdapter(list);
        recyclerViewGuppy.setAdapter(cardViewGuppyAdapter);
    }
}