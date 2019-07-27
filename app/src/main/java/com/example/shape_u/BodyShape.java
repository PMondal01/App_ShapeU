package com.example.shape_u;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BodyShape extends AppCompatActivity {

    private Button ecto_btn, endo_btn,meso_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_shape);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ecto_btn=findViewById(R.id.ecto);
        endo_btn=findViewById(R.id.endo);
        meso_btn=findViewById(R.id.meso);


        ecto_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(BodyShape.this, BodyTypeActivity.class);
                intent.putExtra("layout", R.layout.ectomorph_layout);
                startActivity(intent);

            }
        });


        endo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(BodyShape.this, BodyTypeActivity.class);
                intent.putExtra("layout_endo", R.layout.endomorph_layout);
                startActivity(intent);

            }
        });

        meso_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(BodyShape.this,BodyTypeActivity.class);
                intent.putExtra("meso",R.layout.meso_layout);
                startActivity(intent);
            }
        });


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
