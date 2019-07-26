package com.example.shape_u;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class BodyTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)     {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_type);

        getSupportActionBar().show();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Bundle parameters = getIntent().getExtras();

        if(parameters != null && parameters.containsKey("layout"))
            setContentView(parameters.getInt("layout"));
        else
            setContentView(R.layout.endomorph_layout);


        if(parameters != null && parameters.containsKey("layout_endo"))
            setContentView(parameters.getInt("layout_endo"));
        else
            setContentView(R.layout.ectomorph_layout);


        if(parameters != null && parameters.containsKey("meso"))
            setContentView(parameters.getInt("meso"));

        /*else
            setContentView(R.layout.meso_layout);*/
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
