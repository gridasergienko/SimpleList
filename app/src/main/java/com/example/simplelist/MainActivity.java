package com.example.simplelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextButton = findViewById(R.id.button_next_fragment);

        if (savedInstanceState == null) {
            Fragment parentFragment = new PeopleFragment();
            parentFragment.setRetainInstance(false);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.parent, parentFragment)

                    .commit();
        }
        nextButton.setOnClickListener((v) -> {

            Fragment fragment = new PeopleFragment();
            fragment.setRetainInstance(false);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.parent, fragment)
                    .addToBackStack(null)
                    .commit();
        });
    }
}
