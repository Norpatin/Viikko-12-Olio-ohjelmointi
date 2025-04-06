package com.example.viikko12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.viikko12.fragments.BossFightFragment;
import com.example.viikko12.fragments.ShowMonsterFragment;

public class FightMonstersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fight_monsters);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.frame), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button bossFightFragment = findViewById(R.id.BossFightFragmentButton);
        Button showMonsterFragment = findViewById(R.id.ShowMonsterFragmentButton);
        showMonsterFragment.setOnClickListener(listener);
        bossFightFragment.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Fragment fragment = null;

            if(view.getId() == R.id.BossFightFragmentButton) {
                fragment = new BossFightFragment();
            } else if (view.getId() == R.id.ShowMonsterFragmentButton) {
                fragment = new ShowMonsterFragment();
            }

            if(fragment != null){
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
            }

        }
    };

    public void SwitchToMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}